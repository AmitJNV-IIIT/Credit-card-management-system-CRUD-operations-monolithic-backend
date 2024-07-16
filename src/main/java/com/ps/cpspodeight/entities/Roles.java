package com.ps.cpspodeight.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table
public class Roles {
    @Id
    @Column(name="role_id")
    private int roleId;
    @Column(name="resources")
    private String resources;
//    @Column(name="user_id")
//    private String userId;
    @Column(name="role")
    private String role;
    @Column(name="added_by")
    private String addedBy ;

    // One role will have many users
    // Q: Should I keep or not keep? cascade = CascadeType.ALL, orphanRemoval = true
    @OneToMany(mappedBy = "roles")
    private List<Users> usersList = new ArrayList<>();



}
