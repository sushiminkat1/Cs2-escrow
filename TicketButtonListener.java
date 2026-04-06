package com.escrow.listeners;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class TicketButtonListener extends ListenerAdapter {
    @Override
    public void onButtonInteraction(ButtonInteractionEvent event) {
        String buttonId = event.getButton().getId();
        if (buttonId == null) return;
        if (buttonId.startsWith("close_ticket_")) {
            event.reply("🔒 Ticket lukket!").setEphemeral(true).queue();
        } else if (buttonId.startsWith("reopen_ticket_")) {
            event.reply("🔓 Ticket genåbnet!").setEphemeral(true).queue();
        }
    }
}