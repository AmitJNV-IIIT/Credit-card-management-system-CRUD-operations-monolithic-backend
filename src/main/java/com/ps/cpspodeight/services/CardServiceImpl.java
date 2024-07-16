package com.ps.cpspodeight.services;

import com.ps.cpspodeight.dao.CardDao;
import com.ps.cpspodeight.dao.UserInfoDao;
import com.ps.cpspodeight.entities.Card;
import com.ps.cpspodeight.entities.UserInfo;
import com.ps.cpspodeight.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class CardServiceImpl implements CardService{
    @Autowired
    CardDao cardDao;
    @Autowired
    UserInfoDao userInfoDao;
    @Override
    public List<Card> getAllCardsByUserId(int userId) {
        UserInfo user = userInfoDao.findById(userId).orElse(null);
        return (user != null) ? user.getCardList() : null;
    }

    @Override
    public Card getCardDetailbyUserIdAndCardNumber(int userId, String cardNumber) {
        return null;
    }

    @Override
    public Card addCardByUserId(Card card, int userId) {
        UserInfo user = userInfoDao.findById(userId).orElse(null);
        System.out.println("User: " + user);
        if (user != null) {
            card.setUserInfo(user);
            card.setCardId(card.getCardId()+1);

            boolean userAddCardResp = user.getCardList().add(card);
            System.out.println(userAddCardResp);
            System.out.println("a");
            UserInfo userInfoSaved = userInfoDao.save(user);  // Ensure that the cascade operation is triggered
            System.out.println(userInfoSaved);

            return userInfoSaved.getCardList().get(userInfoSaved.getCardList().size() - 1);
        } else {
            // Handle the case where the user is not found
            return null;
        }
    }

    @Override
    public Card updateCardByUserId(int userId, Card card) {
        return null;
    }

    @Override
    public boolean deleteCardByUserIdAndCardNumber(int userId, String cardNumber) {
        return false;
    }

    @Override
    public boolean disableCardByUserIdAndCardNumber(int userId, String cardNumber) {
        return false;
    }

    @Override
    public boolean enableCardByUserIdAndCardNumber(int userId, String cardNumber) {
        return false;
    }

    @Override
    public boolean setDefaultByUserIdAndCardNumber(int userId, String cardNumber) {
        return false;
    }

    @Override
    public String updateCardNicknameByUserIdAndCardNumber(int userId, String cardNumber) {
        return null;
    }
}
