package com.escrow.listeners;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class TradeButtonListener extends ListenerAdapter {
    @Override
    public void onButtonInteraction(ButtonInteractionEvent event) {
        String buttonId = event.getButton().getId();
        if (buttonId == null) return;
        if (buttonId.startsWith("buyer_confirm_")) {
            handleBuyerConfirm(event);
        } else if (buttonId.startsWith("seller_confirm_")) {
            handleSellerConfirm(event);
        } else if (buttonId.startsWith("cancel_trade_")) {
            handleCancelTrade(event);
        }
    }

    private void handleBuyerConfirm(ButtonInteractionEvent event) {
        String tradeId = event.getButton().getId().replace("buyer_confirm_", "");
        event.reply("✅ Køber bekræftet betaling!").setEphemeral(true).queue();
    }

    private void handleSellerConfirm(ButtonInteractionEvent event) {
        String tradeId = event.getButton().getId().replace("seller_confirm_", "");
        event.reply("✅ Sælger bekræftet skin!").setEphemeral(true).queue();
    }

    private void handleCancelTrade(ButtonInteractionEvent event) {
        String tradeId = event.getButton().getId().replace("cancel_trade_", "");
        event.reply("❌ Handel aflyst - staff bliver notificeret!").setEphemeral(true).queue();
    }
}