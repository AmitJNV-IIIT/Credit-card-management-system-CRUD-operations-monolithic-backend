package com.ps.cpspodeight.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table
public class Card {

    @Column(name="card_id")
    @Id
    private int cardId;
    @Column(name="card_number")
    private String cardNumber;
//    @Column(name="user_id", insertable = false, updatable = false)
//    private int userId; // REFERENCES UserInfo(user_ID)
    @Column(name="cvv")
    private String cvv;
    @Column(name="is_default")
    private boolean isDefault ;
    @Column(name="card_tier")
    private String cardTier;
    @Column(name="zip")
    private String zip;
    @Column(name="creation_date")
    private Date creationDate;
    @Column(name="issue_date")
    private Date issueDate ;
    @Column(name="bin")
    private String bin;
    @Column(name="expiration_date")
    private Date expirationDate;
    @Column(name="card_nickname")
    private String cardNickname;
    @Column(name="is_enabled")
    private String isEnabled;

    // One user can add many cards.
    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonIgnore
    private UserInfo userInfo;

//    @OneToOne
//    @JoinColumn(name="card_id", unique = true)
//    private IncidentCards incidentCards;

    // One card will have many transactions
    @OneToMany(mappedBy = "card")
    @JsonIgnore
    private List<Transactions> transactionsList = new ArrayList<>();
}
