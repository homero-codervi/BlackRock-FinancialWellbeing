package com.blk.auto_ahorro.dto.request;

public class TransactionsFilterRequestPeriod {

    private String start;
    private String end;

    public TransactionsFilterRequestPeriod() {
    }

    public TransactionsFilterRequestPeriod(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
