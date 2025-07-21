package com.blk.auto_ahorro.dto;

import com.blk.auto_ahorro.dto.request.TransactionRequest;
import com.blk.auto_ahorro.exception.InvalidDateFormatException;
import com.blk.auto_ahorro.utils.TransformDate;

import java.time.LocalDateTime;
import java.util.Objects;

public class TransactionDTO {

    private LocalDateTime date;
    private Double amount;
    private Double ceiling;
    private Double remanent;

    public TransactionDTO() {
    }

    public TransactionDTO(LocalDateTime date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public TransactionDTO(Double amount, Double ceiling, Double remanent) {
        this.date = null;
        this.amount = amount;
        this.ceiling = ceiling;
        this.remanent = remanent;
    }

    public TransactionDTO(ExpenseDTO expense) {
        this.date = expense.getDate();
        this.amount = expense.getAmount();
    }


    public TransactionDTO(TransactionRequest transaction) throws InvalidDateFormatException {
        this.date = TransformDate.stringToDate(transaction.getDate());
        this.amount = transaction.getAmount();
        this.ceiling = transaction.getCeiling();
        this.remanent = transaction.getRemanent();
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
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
