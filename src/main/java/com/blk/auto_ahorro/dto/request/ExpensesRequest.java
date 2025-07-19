package com.blk.auto_ahorro.dto.request;

public class ExpensesRequest {

    public String date;
    public Double amount;

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
}
