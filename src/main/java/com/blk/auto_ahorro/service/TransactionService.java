package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.request.ExpensesRequest;
import com.blk.auto_ahorro.dto.response.TransactionsParseResponse;

import java.util.List;

public class TransactionService {

    //private final ExpensesProcessor expensesProcessor = new ExpensesProcessor();

    private final TransactionProcessor transactionProcessor = new TransactionProcessor();

    public List<TransactionsParseResponse> GetTransactionsFromExpenses(List<ExpensesRequest> expenses){
        return transactionProcessor.processExpense(expenses);
    }
}
