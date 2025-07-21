package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.TransactionDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionValidatorServiceImplTest {
    TransactionValidatorServiceImpl transactionValidatorService = new TransactionValidatorServiceImpl();

    @Test
    void isValid() {
    }

    @Test
    void isValidDate() {
    }

    @Test
    void isValidDate_error_date_null() {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setDate(null);
        String result = transactionValidatorService.isValidAmount(transactionDTO);

        //assertEquals("There is not amount value.", result);
    }
    @Test
    void isValidAmount_error_amount_null() {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setAmount(null);
        String result = transactionValidatorService.isValidAmount(transactionDTO);

        assertEquals("There is not amount value.", result);
    }

    @Test
    void isValidCeiling_error_ceiling_null() {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setCeiling(null);

        String result = transactionValidatorService.isValidAmount(transactionDTO);

        assertEquals("There is not amount value.", result);
    }

    @Test
    void isValidRemanent_error_remanent_null() {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setRemanent(null);
        String result = transactionValidatorService.isValidAmount(transactionDTO);

        assertEquals("There is not amount value.", result);
    }



    @Test
    void isValidCeiling() {
    }

    @Test
    void isValidRemanent() {
    }
}