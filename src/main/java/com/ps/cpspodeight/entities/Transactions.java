package com.ps.cpspodeight.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;
@Entity(name = "transactions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table
public class Transactions {
    @Id
    @Column(name="transaction_id")
    private int transactionId ;
//    @Column(name="card_id", insertable=false, updatable=false)
//    private int cardId ;// REFERENCES Card(cardId)
    @Column(name="merchant_id")
    private int merchantId ;// REFERENCES Merchant(merchantId)
    @Column(name="transaction_date_time")
    private Timestamp transactionDateTime;
    @Column(name="amount")
    private double amount;
    @Column(name="transaction_type")
    private String transactionType;
    @Column(name="notes")
    private String notes;
    @Column(name="product_category")
    private String productCategory;
    @Column(name="is_fraudulent")
    private boolean isFraudulent;

//    @OneToMany(mappedBy = "transactions")
//    private List<ChargebackRequests> chargebackRequestsList;

//    @OneToOne
//    @JoinColumn(name = "transaction_id")
//    private TransactionEnablement transactionsEnablement;

    // Many transactions will be associated with one card

    @ManyToOne
    @JoinColumn(name="card_id")
    private Card card;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserInfo userInfo;

}
