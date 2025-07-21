package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.DateExtraDTO;

import java.util.List;

public interface DateExtraService {

    public void sortByStartDate(List<DateExtraDTO> transactions);
}
