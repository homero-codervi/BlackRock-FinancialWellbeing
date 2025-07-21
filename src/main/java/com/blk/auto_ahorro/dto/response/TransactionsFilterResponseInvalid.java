package com.blk.auto_ahorro.dto.response;

public class TransactionsFilterResponseInvalid {

    private String date;
    private Double amount;
    private Double ceiling;
    private Double remanent;
    private String message;

    public TransactionsFilterResponseInvalid() {
    }

    public TransactionsFilterResponseInvalid(String date, Double amount, Double ceiling, Double remanent, String message) {
        this.date = date;
        this.amount = amount;
        this.ceiling = ceiling;
        this.remanent = remanent;
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getCeiling() {
        return ceiling;
    }

    public void setCeiling(Double ceiling) {
        this.ceiling = ceiling;
    }

    public Double getRemanent() {
        return remanent;
    }

    public void setRemanent(Double remanent) {
        this.remanent = remanent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
