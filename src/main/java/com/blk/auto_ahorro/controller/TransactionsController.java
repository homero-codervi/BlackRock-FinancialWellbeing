package com.blk.auto_ahorro.controller;

import com.blk.auto_ahorro.dto.request.ExpensesRequest;
import com.blk.auto_ahorro.dto.request.TransactionsValidatorRequest;
import com.blk.auto_ahorro.dto.response.TransactionsParseResponse;
import com.blk.auto_ahorro.dto.response.TransactionsValidatorResponse;
import com.blk.auto_ahorro.service.TransactionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/blackrock/challenge/v1/")
public class TransactionsController {

    //TransactionService transactionService = new TransactionService();
    TransactionService transactionService;

    public TransactionsController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    // DTO to simulate a transaction
    public static class TransactionRequest {
        public String id;
        public double amount;

        // Getters and setters (or use Lombok for brevity)
    }

    /**
     *
     * @param request
     * @return
     */
    @PostMapping("transactions:parse")
    public ResponseEntity<List<TransactionsParseResponse>> parseTransaction(@RequestBody List<ExpensesRequest> request) {
        List<TransactionsParseResponse> transactionsParseResponses = transactionService.getTransactionsFromExpenses(request);

        return ResponseEntity.ok(transactionsParseResponses);
    }

    /**
     *
     * @param request
     * @return
     */
    @PostMapping("/transactions:validator")
    public ResponseEntity<TransactionsValidatorResponse> validateTransaction(@RequestBody TransactionsValidatorRequest request) {
        TransactionsValidatorResponse response = transactionService.validateTransactions(request);
        return ResponseEntity.ok(response);
    }
    //TODO filter method

    /**
     * Valida transacciones segun los periodos definidos como Q, P, K. Cada periodo tiene reglas especicficas
     * que afectan la validez de las transacciones
     * @param request
     * {
     *  "q":[
     *  {"fixed":0.00, "start":"2023-10-12 20:15", "end":"2023-10-12 20:15"}
     *  ],
     *  "p":[
     *      {"extra":25.00, "start":"2023-10-12 20:15", "end":"2023-10-12 20:15"}
     *   ],
     *  "k":[
     *     {"start":"2023-10-12 20:15", "end":"2023-10-12 20:15"},
     *     {"start":"2023-10-12 20:15", "end":"2023-10-12 20:15"}
     *   ],
     *   "wage": 50000,
     *      "transactions": [
     *      {"date": "2023-10-12 20:15", "amount": 250.00, "ceiling":300.00 "remanent":50}
     *      ]
     * }
     * @return
     * Devuelve las transacciones validas e invalidas
     * {
     *     "valid": [<transactions>],
     *     "invalid":[
     *      {
     *          "date": "2023-10-12 20:15",
     *          "amount": -480.00,
     *          "ceiling":0.00,
     *          "remanent":0.00,
     *          "message": "NEgative amounts are not allowed"
     *
     *      }
     *     ]
     * }
     */
    @PostMapping("/transactions:filter")
    public ResponseEntity<String> filterTransaction(@RequestBody TransactionRequest request) {
        if (request.amount <= 0) {
            return ResponseEntity.badRequest().body("Invalid amount: must be greater than 0");
        }
        return ResponseEntity.ok("Transaction is valid");
    }
}
