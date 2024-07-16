package com.ps.cpspodeight.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
@Entity(name="user_info")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table
public class UserInfo {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="password")
    private String password;
    @Column(name="username")
    private String userName;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="dob")
    private Date DOB ;
    @Column(name="creation_date")
    private Timestamp creationDate;

    @PrePersist
    private void setDefaultCreationDate() {
        this.creationDate = new Timestamp(System.currentTimeMillis());
    }

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.PERSIST)
    @JsonIgnore
    private List<Card> cardList = new ArrayList<>();

    @OneToOne( mappedBy = "userInfo")
    @JsonIgnore
    private Users users;

    @OneToMany(mappedBy = "userInfo")
    @JsonIgnore
    private List<Transactions> transactionsList = new ArrayList<>();



}
