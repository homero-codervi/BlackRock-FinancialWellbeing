package com.blk.auto_ahorro.dto;

public class InvalidTransactionDTO extends TransactionDTO{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
