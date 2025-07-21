package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.request.ExpensesRequest;
import com.blk.auto_ahorro.dto.request.TransactionsFilterRequest;
import com.blk.auto_ahorro.dto.request.TransactionsValidatorRequest;
import com.blk.auto_ahorro.dto.response.TransactionsParseResponse;
import com.blk.auto_ahorro.dto.response.TransactionsValidatorResponse;

import java.util.List;

public interface TransactionService {

    public List<TransactionsParseResponse> getTransactionsFromExpenses(List<ExpensesRequest> expenses);

    public TransactionsValidatorResponse validateTransactions(TransactionsValidatorRequest request);

    public void getTransactionsWithFilters(TransactionsFilterRequest request);
}
