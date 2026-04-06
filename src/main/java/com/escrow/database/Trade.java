package com.escrow.database;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Trade {
    private String tradeId;
    private String sellerId;
    private String buyerId;
    private BigDecimal amount;
    private String tradeStatus;
    private LocalDateTime tradeDate;

    public Trade(String tradeId, String sellerId, String buyerId, BigDecimal amount, String tradeStatus) {
        this.tradeId = tradeId;
        this.sellerId = sellerId;
        this.buyerId = buyerId;
        this.amount = amount;
        this.tradeStatus = tradeStatus;
        this.tradeDate = LocalDateTime.now();
    }

    // Getters and Setters
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public LocalDateTime getTradeDate() {
        return tradeDate;
    }
}