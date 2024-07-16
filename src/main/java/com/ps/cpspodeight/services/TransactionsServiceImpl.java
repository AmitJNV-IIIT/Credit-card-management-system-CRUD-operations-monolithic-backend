package com.ps.cpspodeight.services;

import com.ps.cpspodeight.dao.TransactionsDao;
import com.ps.cpspodeight.entities.Transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionsServiceImpl implements TransactionsService {
    @Autowired
    private TransactionsDao transactionsDao;

    @Override
    public List<Transactions> getAllTransactionsByUserId(int userId) {
        Optional<Transactions> transactionsList = transactionsDao.findById(userId);
        return (List<Transactions>) transactionsList.orElse(null);
    }

    @Override
    public Transactions getTransactionDetailbyTransactionId(int transactionId) {
        return transactionsDao.findById(transactionId).orElse(null);
    }

    @Override
    public Transactions addTransactionByCardNumber(String cardNumber, Transactions transactions) {
        // Assuming you have a method in TransactionsDao to save transactions
        return transactionsDao.save(transactions);
    }
}
