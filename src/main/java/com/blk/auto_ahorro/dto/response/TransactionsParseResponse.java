package com.blk.auto_ahorro.dto.response;

import com.blk.auto_ahorro.dto.InvalidTransactionDTO;
import com.blk.auto_ahorro.dto.TransactionDTO;
import com.blk.auto_ahorro.dto.request.ExpensesRequest;

import java.util.Date;
import java.util.List;

public class TransactionsParseResponse {
    private Date date;
    private Double amount;
    private Double ceiling;
    private Double remanent;

    public TransactionsParseResponse() {
    }

    public TransactionsParseResponse(Date date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public TransactionsParseResponse(ExpensesRequest expense) {
        //this.date = expense.getDate();
        this.date = null;
        this.amount = expense.getAmount();
    }

    public TransactionsParseResponse(TransactionDTO transaction) {
        //this.date = expense.getDate();
        this.date = null;
        this.amount = transaction.getAmount();
        this.ceiling = transaction.getCeiling();
        this.remanent = transaction.getRemanent();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
