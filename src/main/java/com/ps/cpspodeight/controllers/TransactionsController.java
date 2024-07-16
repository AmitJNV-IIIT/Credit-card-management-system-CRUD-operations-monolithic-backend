package com.ps.cpspodeight.controllers;

import com.ps.cpspodeight.entities.Transactions;
import com.ps.cpspodeight.services.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/transactions")
public class TransactionsController {

    private final TransactionsService transactionsService;

    @Autowired
    public TransactionsController(TransactionsService transactionsService) {
        this.transactionsService = transactionsService;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Transactions>> getAllTransactionsByUserId(@PathVariable int userId) {
        List<Transactions> transactionsList = transactionsService.getAllTransactionsByUserId(userId);
        if (transactionsList != null && !transactionsList.isEmpty()) {
            return new ResponseEntity<>(transactionsList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{transactionId}")
    public ResponseEntity<Transactions> getTransactionDetailbyTransactionId(@PathVariable int transactionId) {
        Transactions transaction = transactionsService.getTransactionDetailbyTransactionId(transactionId);
        if (transaction != null) {
            return new ResponseEntity<>(transaction, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add/{cardNumber}")
    public ResponseEntity<Transactions> addTransactionByCardNumber(
            @PathVariable String cardNumber,
            @RequestBody Transactions transactions) {
        // Assuming you want to associate the transaction with a card based on the card number
        // You may need to modify this part based on your actual logic
        Transactions addedTransaction = transactionsService.addTransactionByCardNumber(cardNumber, transactions);

        if (addedTransaction != null) {
            return new ResponseEntity<>(addedTransaction, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
