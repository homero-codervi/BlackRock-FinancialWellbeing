package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.TransactionDTO;
import org.springframework.stereotype.Service;

@Service
public class TransactionValidatorServiceImpl implements TransactionValidatorService{

    public String isValid(TransactionDTO transaction){
        return isValidDate(transaction) + isValidAmount(transaction) + isValidCeiling(transaction) + isValidRemanent(transaction);
    }

    public String isValidDate(TransactionDTO transactionDTO){
        //TODO
        return "";
    }

    public String isValidAmount(TransactionDTO transactionDTO){

        if(transactionDTO == null ){
            return "The transaction is NULL.";
        }

        if(transactionDTO.getAmount() == null){
            return "There is not amount value.";
        }

        if(transactionDTO.getAmount() == 0){
            return "The transaction amount value must be a different to 0.";

        }

        if(transactionDTO.getAmount() < 0){
            return "The transaction amount value must be a upper to 0.";

        }

        return "";

    }

    public String isValidCeiling(TransactionDTO transactionDTO){
        if(transactionDTO == null ){
            return "The transaction is NULL.";
        }

        if(transactionDTO.getCeiling() == null){
            return "There is not value for ceiling.";
        }

        if(transactionDTO.getCeiling() < 0){
            return "The transaction ceiling value must be a upper to 0.";
        }

        return "";
    }

    public String isValidRemanent(TransactionDTO transactionDTO){
        if(transactionDTO == null ){
            return "The transaction is NULL.";
        }

        if(transactionDTO.getRemanent() == null){
            return "There is not value for remanent.";
        }

        if(transactionDTO.getRemanent() < 0){
            return "The transaction remanent value must be a upper to 0.";
        }

        return "";

    }
}
