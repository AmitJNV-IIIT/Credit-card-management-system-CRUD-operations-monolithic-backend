package com.ps.cpspodeight.dao;

import com.ps.cpspodeight.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsDao extends JpaRepository<Transactions, Integer> {
}
