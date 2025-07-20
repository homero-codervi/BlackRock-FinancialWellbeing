package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.request.ExpensesRequest;
import com.blk.auto_ahorro.dto.response.TransactionsParseResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpensesProcessorService {

    //private final TransactionValidator validator = new TransactionValidator();
    //private final TransactionProcessorService transactionProcessorService = new TransactionProcessorService();

    private final TransactionValidatorServiceImpl validator;
    private final TransactionProcessorServiceImpl transactionProcessorService;

    public ExpensesProcessorService(TransactionValidatorServiceImpl validator, TransactionProcessorServiceImpl transactionProcessorService) {
        this.validator = validator;
        this.transactionProcessorService = transactionProcessorService;
    }

    public List<TransactionsParseResponse> process(List<ExpensesRequest> expenses){

        List<TransactionsParseResponse> transactions = new ArrayList<>();

        return transactions;

    }

//    public TransactionsParseResponse process(List<TransactionDTO> transaction){
//
////        List<TransactionDTO> transactions = new ArrayList<>();
////        List<InvalidTransactionDTO> invalidTransactions = null;
////
////        for(ExpensesRequest expense: expenses){
////            transactions.add(transactionProcessor.process(expense));
////        }
//
//
//
//        //return new TransactionsParseResponse(transactions, invalidTransactions);
//        return null;
//
//    }


}
