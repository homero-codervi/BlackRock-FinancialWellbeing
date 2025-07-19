package com.blk.auto_ahorro.dto;

import com.blk.auto_ahorro.dto.request.ExpensesRequest;

import java.util.Date;

public class ExpenseDTO {

    private Date date;
    private Double amount;

    public ExpenseDTO(ExpensesRequest expense) {
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
}
