package com.blk.auto_ahorro.dto;

import com.blk.auto_ahorro.dto.request.ExpensesRequest;
import com.blk.auto_ahorro.exception.InvalidDateFormatException;
import com.blk.auto_ahorro.utils.TransformDate;

import java.time.LocalDateTime;

public class ExpenseDTO {

    private LocalDateTime date;
    private Double amount;

    public ExpenseDTO(ExpensesRequest expense) {
        this.date = null;
        try {
            this.date = TransformDate.stringToDate(expense.getDate());
        }catch (InvalidDateFormatException e){
            System.out.println("The expense : {'date':'"+expense.getDate()+"', 'amount' : '"+expense.getAmount()+"'} does not have a correct format date.");
        }
        this.amount = expense.getAmount();
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
}
