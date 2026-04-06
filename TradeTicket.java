public class TradeTicket {
    private String ticketId;
    private String tradeId;
    private String userId;
    private String issueDescription;
    private String status;
    private String createdAt;
    private String updatedAt;

    public TradeTicket(String ticketId, String tradeId, String userId, String issueDescription) {
        this.ticketId = ticketId;
        this.tradeId = tradeId;
        this.userId = userId;
        this.issueDescription = issueDescription;
        this.status = "Open";  // Default status
        this.createdAt = "2026-04-06 10:57:18";  // Set current date
        this.updatedAt = "2026-04-06 10:57:18";  // Set current date
    }

    // Getters and Setters
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}