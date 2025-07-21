package com.blk.auto_ahorro.dto.request;

public class TransactionsFilterRequestExtra {

    private Double extra;
    private String start;
    private String end;

    public TransactionsFilterRequestExtra() {
    }

    public TransactionsFilterRequestExtra(Double extra, String start, String end) {
        this.extra = extra;
        this.start = start;
        this.end = end;
    }

    public Double getExtra() {
        return extra;
    }

    public void setExtra(Double extra) {
        this.extra = extra;
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
