package com.ps.cpspodeight.services;

import com.ps.cpspodeight.entities.Card;
import com.ps.cpspodeight.entities.Transactions;

import java.util.List;

public interface TransactionsService {

    public List<Transactions> getAllTransactionsByUserId(int userId);
    public Transactions getTransactionDetailbyTransactionId(int TransactionId);
    public Transactions addTransactionByCardNumber(String cardNumber, Transactions transactions);

    // Returns true for success and false if action failed.
//    public boolean disableTransactionByAdminIdAndTransactionId(int adminID, int transactionId);
//    public boolean enableTransactionByAdminIdAndTransactionId(int adminID, int transactionId);
//    public boolean setTransactionAsFraudulentByTransactionId(int transactionId);
//    public boolean setAllTransactionsAsFraudulentByAdminIdAndCardNumber(int adminId, String cardNumber);
}
