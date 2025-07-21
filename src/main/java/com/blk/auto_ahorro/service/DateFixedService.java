package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.DateFixedDTO;

import java.util.List;

public interface DateFixedService {

    public void sortByStartDate(List<DateFixedDTO> transactions);
}
