package com.blk.auto_ahorro.dto;

import com.blk.auto_ahorro.dto.request.ExpensesRequest;

import java.util.Date;

public class TransactionDTO {

    private Date date;
    private Double amount;
    private Double ceiling;
    private Double remanent;

    public TransactionDTO() {
    }

    public TransactionDTO(Date date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public TransactionDTO(ExpenseDTO expense) {
        //this.date = expense.getDate();
        this.date = null;
        this.amount = expense.getAmount();
    }

    
    public TransactionDTO(ExpensesRequest expense) {
        //this.date = expense.getDate();
        this.date = null;
        this.amount = expense.getAmount();
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
