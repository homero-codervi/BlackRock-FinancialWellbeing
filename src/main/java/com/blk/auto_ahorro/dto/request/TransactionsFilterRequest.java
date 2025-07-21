package com.blk.auto_ahorro.dto.request;

import java.util.List;

public class TransactionsFilterRequest {

    private List<TransactionsFilterRequestFixed> q;
    private List<TransactionsFilterRequestExtra> p;
    private List<TransactionsFilterRequestPeriod> k;
    private Double wage;
    private List<TransactionsFilterRequestTransaction> transactions;

    public TransactionsFilterRequest() {
    }

    public List<TransactionsFilterRequestFixed> getQ() {
        return q;
    }

    public void setQ(List<TransactionsFilterRequestFixed> q) {
        this.q = q;
    }

    public List<TransactionsFilterRequestExtra> getP() {
        return p;
    }

    public void setP(List<TransactionsFilterRequestExtra> p) {
        this.p = p;
    }

    public List<TransactionsFilterRequestPeriod> getK() {
        return k;
    }

    public void setK(List<TransactionsFilterRequestPeriod> k) {
        this.k = k;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public List<TransactionsFilterRequestTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionsFilterRequestTransaction> transactions) {
        this.transactions = transactions;
    }
}
