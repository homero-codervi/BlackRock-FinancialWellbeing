package com.blk.auto_ahorro.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/blackrock/challenge/v1/")
public class TransactionsController {

    // DTO to simulate a transaction
    public static class TransactionRequest {
        public String id;
        public double amount;

        // Getters and setters (or use Lombok for brevity)
    }

    //TODO parse method
    /**
     *
    Recibe una lista de gastos y devuelve una lista de transacciones enriquecidas con los campos ceilling(techo) y remanent (remanente)
    . Tambien se puede calcular el total invertido, remanen y gasto.

    {"date": "2023-10-12 20:15", "amount":250.00, "ceiling":300.00, "remanent":50}
     */
    /**
     *
     * @param request
     * @return
     */
    @PostMapping("transactions:parse")
    public ResponseEntity<String> parseTransaction(@RequestBody TransactionRequest request) {


        if (request.amount <= 0) {
            return ResponseEntity.badRequest().body("Invalid amount: must be greater than 0");
        }
        return ResponseEntity.ok("Transaction is valid");
    }
    //TODO validator method
    /**
     * Valida una lista de transacciones en funcion del sueldo (wage) y el monto maximo a invertir.
     * @param request
     * {
     *     "wage": 50000,
     *     "transactions": [
     *          {"date": "2023-10-12 20:15", "amount": 250.00, "ceiling":300.00 "remanent":50}
     *     ]
     * }
     * @return
     * Devuelve las transacciones validas, invalidas y duplicadas
     * [transaction],
     * [invalid_transaction] (extiende de transaction con un campo adicional)
     *  message: String(Explicacion del error)
     *
     */
    @PostMapping("/transactions:validator")
    public ResponseEntity<String> validateTransaction(@RequestBody TransactionRequest request) {
        if (request.amount <= 0) {
            return ResponseEntity.badRequest().body("Invalid amount: must be greater than 0");
        }
        return ResponseEntity.ok("Transaction is valid");
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
