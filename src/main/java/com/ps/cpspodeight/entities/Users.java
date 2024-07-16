package com.ps.cpspodeight.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="username")
    private String userName;
    @Column(name="password")
    private String password;
    @Column(name="account_status")
    private String accountStatus;
    @Column(name="jwt")
    private String JWT;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Roles roles;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "user_id")
    private UserInfo userInfo;




}
