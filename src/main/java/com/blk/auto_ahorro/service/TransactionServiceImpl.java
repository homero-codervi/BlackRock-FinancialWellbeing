package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.request.ExpensesRequest;
import com.blk.auto_ahorro.dto.request.TransactionsFilterRequest;
import com.blk.auto_ahorro.dto.request.TransactionsFilterRequestTransaction;
import com.blk.auto_ahorro.dto.request.TransactionsValidatorRequest;
import com.blk.auto_ahorro.dto.response.TransactionsParseResponse;
import com.blk.auto_ahorro.dto.response.TransactionsValidatorResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{

    private final TransactionProcessorService transactionProcessorService;

    public TransactionServiceImpl(TransactionProcessorServiceImpl transactionProcessorService) {
        this.transactionProcessorService = transactionProcessorService;
    }

    public List<TransactionsParseResponse> getTransactionsFromExpenses(List<ExpensesRequest> expenses){
        return transactionProcessorService.processExpense(expenses);
    }

    public TransactionsValidatorResponse validateTransactions(TransactionsValidatorRequest request) {
        return transactionProcessorService.processTransactions(request);
    }

    @Override
    public void getTransactionsWithFilters(TransactionsFilterRequest request) {

        for(TransactionsFilterRequestTransaction transaction : request.getTransactions()){

        }

    }
}
