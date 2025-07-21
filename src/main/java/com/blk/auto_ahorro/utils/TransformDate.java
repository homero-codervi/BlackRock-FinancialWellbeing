package com.blk.auto_ahorro.utils;

import com.blk.auto_ahorro.exception.InvalidDateFormatException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TransformDate {

    public static LocalDateTime stringToDate(String dateString) throws InvalidDateFormatException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = null;

        try {
            dateTime = LocalDateTime.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            throw new InvalidDateFormatException("Invalid date format: " + dateString);
        }

        return dateTime;
    }

    public static String dateTimeToString(LocalDateTime dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dateTimeString = "";
        if (dateTime != null){
             dateTimeString = dateTime.format(formatter);
        }

        return dateTimeString;
    }
}
