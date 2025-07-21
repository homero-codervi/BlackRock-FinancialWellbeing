package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.DateExtraDTO;
import com.blk.auto_ahorro.dto.DateFixedDTO;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class DateFixedServiceImpl implements DateFixedService{
    @Override
    public void sortByStartDate(List<DateFixedDTO> transactions) {
        transactions.sort(Comparator.comparing(DateFixedDTO::getStart));
    }
}
