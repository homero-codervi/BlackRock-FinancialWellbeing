package com.blk.auto_ahorro.dto;

public class InvalidTransactionDTO extends TransactionDTO{
    private String message;

    public InvalidTransactionDTO(TransactionDTO transactionDTO, String message) {
        this.setDate(transactionDTO.getDate());
        this.setAmount(transactionDTO.getAmount());
        this.setCeiling(transactionDTO.getCeiling());
        this.setRemanent(transactionDTO.getRemanent());

        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
