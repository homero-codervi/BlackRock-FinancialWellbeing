package com.blk.auto_ahorro.dto.request;

public class TransactionsFilterRequestFixed {
    private Double fixed;
    private String start;
    private String end;

    public TransactionsFilterRequestFixed() {
    }

    public TransactionsFilterRequestFixed(Double fixed, String start, String end) {
        this.fixed = fixed;
        this.start = start;
        this.end = end;
    }

    public Double getFixed() {
        return fixed;
    }

    public void setFixed(Double fixed) {
        this.fixed = fixed;
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
