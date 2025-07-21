package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.TransactionDTO;

public interface TransactionValidatorService {

    public String isValid(TransactionDTO transaction);

    public String isValidDate(TransactionDTO transactionDTO);

    public String isValidAmount(TransactionDTO transactionDTO);

    public String isValidCeiling(TransactionDTO transactionDTO);

    public String isValidRemanent(TransactionDTO transactionDTO);
}
