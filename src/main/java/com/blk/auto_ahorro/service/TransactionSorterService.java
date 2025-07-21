package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.TransactionDTO;

import java.util.List;

public interface TransactionSorterService {

    public void sortByDate(List<TransactionDTO> transactions);
}
