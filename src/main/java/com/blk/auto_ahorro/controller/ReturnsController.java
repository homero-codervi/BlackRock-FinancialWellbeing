package com.blk.auto_ahorro.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/blackrock/challenge/v1/")

public class ReturnsController {

    // DTO to simulate a transaction
    public static class TransactionRequest {
        public String id;
        public double amount;

        // Getters and setters (or use Lombok for brevity)
    }

    //TODO returns ppr method
    @PostMapping("returns:ppr")
    public ResponseEntity<String> returnsPPR(@RequestBody TransactionsController.TransactionRequest request) {


        if (request.amount <= 0) {
            return ResponseEntity.badRequest().body("Invalid amount: must be greater than 0");
        }
        return ResponseEntity.ok("Transaction is valid");
    }

    //TODO returns ishares method
    @PostMapping("returns:ishares")
    public ResponseEntity<String> returnIShares(@RequestBody TransactionsController.TransactionRequest request) {


        if (request.amount <= 0) {
            return ResponseEntity.badRequest().body("Invalid amount: must be greater than 0");
        }
        return ResponseEntity.ok("Transaction is valid");
    }
}
