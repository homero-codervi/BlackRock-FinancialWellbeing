package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.DateExtraDTO;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class DateExtraServiceImpl implements DateExtraService{
    @Override
    public void sortByStartDate(List<DateExtraDTO> transactions) {
        transactions.sort(Comparator.comparing(DateExtraDTO::getStart));
    }

}
