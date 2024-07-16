package com.ps.cpspodeight.services;

import com.ps.cpspodeight.entities.Card;

import java.util.List;

public interface CardService {

    public List<Card> getAllCardsByUserId(int userId);
    public Card getCardDetailbyUserIdAndCardNumber(int userId, String cardNumber);
    public Card addCardByUserId(Card card, int userId);
    public Card updateCardByUserId(int userId, Card card);
    // Returns true for success and false if action failed.
    public boolean deleteCardByUserIdAndCardNumber(int userId, String cardNumber);
    public boolean disableCardByUserIdAndCardNumber(int userId, String cardNumber);
    public boolean enableCardByUserIdAndCardNumber(int userId, String cardNumber);
    public boolean setDefaultByUserIdAndCardNumber(int userId, String cardNumber);
    public String updateCardNicknameByUserIdAndCardNumber(int userId, String cardNumber);

}
