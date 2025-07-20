package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.ExpenseDTO;
import com.blk.auto_ahorro.dto.TransactionDTO;
import com.blk.auto_ahorro.dto.request.ExpensesRequest;
import com.blk.auto_ahorro.dto.request.TransactionsValidatorRequest;
import com.blk.auto_ahorro.dto.response.TransactionsParseResponse;
import com.blk.auto_ahorro.dto.response.TransactionsValidatorResponse;

import java.util.List;

public interface TransactionProcessorService {

    public List<TransactionsParseResponse> processExpense(List<ExpensesRequest> expenses);

    public TransactionDTO processExpense(ExpenseDTO expense);

    public TransactionsValidatorResponse processTransactions(TransactionsValidatorRequest request);
}
