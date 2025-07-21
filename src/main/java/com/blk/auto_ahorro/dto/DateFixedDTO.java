package com.blk.auto_ahorro.dto;

import java.time.LocalDateTime;

public class DateFixedDTO extends DatePeriodDTO {

    private Double fixed;

    public DateFixedDTO() {
    }

    public DateFixedDTO(Double fixed, LocalDateTime start, LocalDateTime end) {
        this.fixed = fixed;
        this.setStart(start);
        this.setEnd(end);
    }

    public Double getFixed() {
        return fixed;
    }

    public void setFixed(Double fixed) {
        this.fixed = fixed;
    }

}
