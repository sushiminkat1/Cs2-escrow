package com.escrow;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import com.escrow.listeners.TradeButtonListener;
import com.escrow.listeners.TicketButtonListener;
import com.escrow.database.MongoDB;
import javax.security.auth.login.LoginException;

public class EscrowBot {
    private static JDA jda;
    private static MongoDB database;

    public static void main(String[] args) throws LoginException {
        String token = System.getenv("DISCORD_TOKEN");
        if (token == null) {
            System.err.println("ERROR: DISCORD_TOKEN environment variable not set!");
            System.exit(1);
        }

        // Initialize MongoDB
        database = new MongoDB();
        database.connect();

        // Build JDA
        jda = JDABuilder.createDefault(token)
                .setActivity(Activity.playing("CS2 Trading"))
                .enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES, GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(
                    new TradeButtonListener(),
                    new TicketButtonListener()
                )
                .build();

        System.out.println("[BOT] CS2 Escrow Bot started successfully!");
    }

    public static JDA getJDA() {
        return jda;
    }

    public static MongoDB getDatabase() {
        return database;
    }
}