package com.blk.auto_ahorro.dto.response;

public class TransactionsFilterResponseValid {

    private String date;
    private Double amount;
    private Double ceiling;
    private Double remanent;

    public TransactionsFilterResponseValid() {
    }

    public TransactionsFilterResponseValid(String date, Double amount, Double ceiling, Double remanent) {
        this.date = date;
        this.amount = amount;
        this.ceiling = ceiling;
        this.remanent = remanent;
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
}
