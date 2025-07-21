package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.DatePeriodDTO;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class DatePeriodServiceImpl implements DatePeriodService {
    @Override
    public void sortByStartDate(List<DatePeriodDTO> dateList) {
        dateList.sort(Comparator.comparing(DatePeriodDTO::getStart));
    }
}
