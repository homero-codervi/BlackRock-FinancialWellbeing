package com.blk.auto_ahorro.dto;

import com.blk.auto_ahorro.dto.request.ExpensesRequest;

import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TransactionDTO that = (TransactionDTO) o;
        return Objects.equals(date, that.date) && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount);
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
