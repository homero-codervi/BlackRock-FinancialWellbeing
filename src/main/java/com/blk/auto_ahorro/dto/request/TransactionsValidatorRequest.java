package com.blk.auto_ahorro.dto.request;

import com.blk.auto_ahorro.dto.TransactionDTO;

import java.util.List;

public class TransactionsValidatorRequest {

    Double wage;
    List<TransactionDTO> transactions;

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public List<TransactionDTO> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionDTO> transactions) {
        this.transactions = transactions;
    }
}
