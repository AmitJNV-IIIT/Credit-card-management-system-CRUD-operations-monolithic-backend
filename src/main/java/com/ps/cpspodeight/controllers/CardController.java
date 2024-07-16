package com.ps.cpspodeight.controllers;

import com.ps.cpspodeight.entities.Card;
import com.ps.cpspodeight.services.CardService;
import com.ps.cpspodeight.services.CardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user/{userId}/card")
@RestController
public class CardController {
    @Autowired
    private CardServiceImpl cardService;

    @GetMapping("")
    public List<Card> getAllCards(@PathVariable int userId){
        return cardService.getAllCardsByUserId(userId);
    }

    @PostMapping("")
    public Card addCard(@RequestBody Card card, @PathVariable int userId){
        return cardService.addCardByUserId(card, userId);
    }
}
