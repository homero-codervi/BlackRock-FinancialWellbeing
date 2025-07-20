package com.blk.auto_ahorro.dto.response;

import com.blk.auto_ahorro.dto.TransactionDTO;
import com.blk.auto_ahorro.dto.request.ExpensesRequest;
import com.blk.auto_ahorro.utils.TransformDate;

public class TransactionsParseResponse {
    private String date;
    private Double amount;
    private Double ceiling;
    private Double remanent;

    public TransactionsParseResponse() {
    }

    public TransactionsParseResponse(String date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public TransactionsParseResponse(ExpensesRequest expense) {
        this.date = expense.getDate();
        this.amount = expense.getAmount();
    }

    public TransactionsParseResponse(TransactionDTO transaction) {
        this.date = TransformDate.dateTimeToString(transaction.getDate());
        this.amount = transaction.getAmount();
        this.ceiling = transaction.getCeiling();
        this.remanent = transaction.getRemanent();
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
