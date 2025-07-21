package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.DateExtraDTO;
import com.blk.auto_ahorro.dto.DatePeriodDTO;

import java.util.List;

public interface DatePeriodService {

    public void sortByStartDate(List<DatePeriodDTO> dateList);
}
