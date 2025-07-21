package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.TransactionDTO;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class TransactionSorterServiceImpl implements TransactionSorterService {

    @Override
    public void sortByDate(List<TransactionDTO> transactions) {
        transactions.sort(Comparator.comparing(TransactionDTO::getDate));
    }
}
