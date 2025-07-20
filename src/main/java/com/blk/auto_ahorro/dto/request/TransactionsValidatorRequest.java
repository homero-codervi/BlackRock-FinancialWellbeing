package com.blk.auto_ahorro.dto.request;

import com.blk.auto_ahorro.dto.TransactionDTO;

import java.util.List;

public class TransactionsValidatorRequest {

    Double wage;
    List<TransactionRequest> transactions;

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public List<TransactionRequest> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionRequest> transactions) {
        this.transactions = transactions;
    }
}
