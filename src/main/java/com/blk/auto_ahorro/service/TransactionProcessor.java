package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.ExpenseDTO;
import com.blk.auto_ahorro.dto.request.ExpensesRequest;
import com.blk.auto_ahorro.dto.TransactionDTO;
import com.blk.auto_ahorro.dto.response.TransactionsParseResponse;

import java.util.ArrayList;
import java.util.List;

public class TransactionProcessor {

    public List<TransactionsParseResponse> processExpense(List<ExpensesRequest> expenses){

        List<TransactionsParseResponse> transactions = new ArrayList<>();

        for(ExpensesRequest expense: expenses){
            ExpenseDTO expenseDTO = new ExpenseDTO(expense);
            TransactionDTO transactionDTO = this.processExpense(expenseDTO);
            transactions.add(new TransactionsParseResponse(transactionDTO));
        }

        return transactions;

    }

    public TransactionDTO processExpense(ExpenseDTO expense){
        TransactionDTO transaction = new TransactionDTO(expense);

        this.setCeiling(transaction);
        this.setRemanent(transaction);

        return transaction;
    }

    private void setCeiling(TransactionDTO transaction){
        transaction.setCeiling(Math.ceil(transaction.getAmount() / 100.0) * 100);
    }

    private void setRemanent(TransactionDTO transaction){
        if(transaction.getCeiling() != null || transaction.getCeiling() > 0) {
            transaction.setRemanent(transaction.getCeiling() - transaction.getAmount());
        }else{
            transaction.setRemanent((double) 0);
        }
    }
}
