package com.ps.cpspodeight.dao;

import com.ps.cpspodeight.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolesDao extends JpaRepository<Roles, Integer> {
}
