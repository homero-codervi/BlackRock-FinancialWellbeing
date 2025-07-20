package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.ExpenseDTO;
import com.blk.auto_ahorro.dto.InvalidTransactionDTO;
import com.blk.auto_ahorro.dto.request.ExpensesRequest;
import com.blk.auto_ahorro.dto.TransactionDTO;
import com.blk.auto_ahorro.dto.request.TransactionRequest;
import com.blk.auto_ahorro.dto.request.TransactionsValidatorRequest;
import com.blk.auto_ahorro.dto.response.TransactionsParseResponse;
import com.blk.auto_ahorro.dto.response.TransactionsValidatorResponse;
import com.blk.auto_ahorro.exception.InvalidDateFormatException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TransactionProcessorServiceImpl implements TransactionProcessorService{

    //TransactionValidator transactionValidator = new TransactionValidator();
    TransactionValidatorService transactionValidatorService;

    public TransactionProcessorServiceImpl(TransactionValidatorService transactionValidatorService) {
        this.transactionValidatorService = transactionValidatorService;
    }

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

    public TransactionsValidatorResponse processTransactions(TransactionsValidatorRequest request) {

        TransactionsValidatorResponse response = new TransactionsValidatorResponse();
        Set<TransactionDTO> seen = new HashSet<>();

        for(TransactionRequest transaction : request.getTransactions()){
            String error_message = "";
            TransactionDTO transactionDTO = null;

            try{
                transactionDTO = new TransactionDTO(transaction);
            } catch (InvalidDateFormatException e) {
                System.out.println("The transaction : {'date':'"+transaction.getDate()+ "', 'amount' : '" + transaction.getAmount()+"'} does not have a correct format date.");
                error_message = "The transaction does not have a defined format to the date value."+transaction.getDate();
                transactionDTO =  new TransactionDTO(transaction.getAmount(), transaction.getCeiling(), transaction.getRemanent());
            }

            error_message += transactionValidatorService.isValid(transactionDTO);

            if(error_message.isEmpty()){
                response.getValid().add(transactionDTO);
                if(!seen.add(transactionDTO)){
                    response.getInvalid().add(new InvalidTransactionDTO(transactionDTO, "Transaction duplicated."));
                }
            }else{
                response.getInvalid().add(new InvalidTransactionDTO(transactionDTO, error_message));
            }
        }
        return response;
    }

}
