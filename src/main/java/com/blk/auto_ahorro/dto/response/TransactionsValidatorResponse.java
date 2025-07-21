package com.blk.auto_ahorro.dto.response;

import com.blk.auto_ahorro.dto.InvalidTransactionDTO;
import com.blk.auto_ahorro.dto.TransactionDTO;

import java.util.ArrayList;
import java.util.List;

public class TransactionsValidatorResponse {
    //TODO Change the transactionsDTo by transactions response
    private List<TransactionDTO> valid;
    private List<InvalidTransactionDTO> invalid;

    public TransactionsValidatorResponse() {
        valid = new ArrayList<>();
        invalid = new ArrayList<>();
    }

    public TransactionsValidatorResponse(List<TransactionDTO> valid, List<InvalidTransactionDTO> invalid) {
        this.valid = valid;
        this.invalid = invalid;
    }

    public List<TransactionDTO> getValid() {
        return valid;
    }

    public void setValid(List<TransactionDTO> valid) {
        this.valid = valid;
    }

    public List<InvalidTransactionDTO> getInvalid() {
        return invalid;
    }

    public void setInvalid(List<InvalidTransactionDTO> invalid) {
        this.invalid = invalid;
    }
}
