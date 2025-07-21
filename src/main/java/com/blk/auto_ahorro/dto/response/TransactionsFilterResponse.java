package com.blk.auto_ahorro.dto.response;

public class TransactionsFilterResponse {

    private TransactionsFilterResponseValid valid;

    private TransactionsFilterResponseInvalid invalid;

    public TransactionsFilterResponse() {
    }

    public TransactionsFilterResponseValid getValid() {
        return valid;
    }

    public void setValid(TransactionsFilterResponseValid valid) {
        this.valid = valid;
    }

    public TransactionsFilterResponseInvalid getInvalid() {
        return invalid;
    }

    public void setInvalid(TransactionsFilterResponseInvalid invalid) {
        this.invalid = invalid;
    }
}
