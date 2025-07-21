package com.blk.auto_ahorro.service;

import com.blk.auto_ahorro.dto.TransactionDTO;
import com.blk.auto_ahorro.exception.InvalidDateFormatException;
import com.blk.auto_ahorro.utils.TransformDate;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class TransactionSorterImplTest {

    TransactionSorterServiceImpl transactionSorter = new TransactionSorterServiceImpl();

    @Test
    void sortByDate() {

        List<TransactionDTO> transactions = new ArrayList<>();
        LocalDateTime date = null;
        try {
            date = TransformDate.stringToDate("2025-03-10 13:59");
            transactions.add(new TransactionDTO(date, 15.50));

            date = TransformDate.stringToDate("2025-05-10 13:59");
            transactions.add(new TransactionDTO(date, 15.50));

            date = TransformDate.stringToDate("2025-01-10 13:59");
            transactions.add(new TransactionDTO(date, 15.50));

            date = TransformDate.stringToDate("2025-02-10 13:59");
            transactions.add(new TransactionDTO(date, 15.50));

            date = TransformDate.stringToDate("2025-04-10 13:59");
            transactions.add(new TransactionDTO(date, 15.50));

            date = TransformDate.stringToDate("2025-06-10 13:59");
            transactions.add(new TransactionDTO(date, 15.50));
        } catch (InvalidDateFormatException e) {
            throw new RuntimeException(e);
        }

        //List<TransactionDTO> result = transactionSorter.sortByDate(transactions);
        System.out.println(transactions.get(0).getDate());
        System.out.println(transactions.get(1).getDate());
        System.out.println(transactions.get(2).getDate());
        System.out.println(transactions.get(3).getDate());
        System.out.println(transactions.get(4).getDate());
        System.out.println(transactions.get(5).getDate());







    }
}