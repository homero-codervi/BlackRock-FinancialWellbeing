package com.blk.auto_ahorro.dto;

import java.time.LocalDateTime;

public class DateExtraDTO extends DatePeriodDTO {

    private Double extra;

    public DateExtraDTO() {
    }

    public DateExtraDTO(Double extra, LocalDateTime start, LocalDateTime end) {
        this.extra = extra;
        this.setStart(start);
        this.setEnd(end);
    }

    public Double getExtra() {
        return extra;
    }

    public void setExtra(Double extra) {
        this.extra = extra;
    }
}
