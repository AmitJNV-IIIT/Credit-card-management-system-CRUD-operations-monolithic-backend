package com.ps.cpspodeight.dao;

import com.ps.cpspodeight.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CardDao extends JpaRepository<Card, Integer> {
//    public List<Card> findAllByUserId(Integer userId);
}
