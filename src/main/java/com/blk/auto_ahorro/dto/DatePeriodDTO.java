package com.blk.auto_ahorro.dto;

import java.time.LocalDateTime;

public class DatePeriodDTO {

    private LocalDateTime start;
    private LocalDateTime end;

    public DatePeriodDTO() {
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
