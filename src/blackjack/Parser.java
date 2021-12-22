package blackjack;

import blackjack.Model.Card;
import blackjack.Model.CardHand;
import blackjack.Model.CroupierHand;
import blackjack.Model.PlayerHand;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    private static List<Card> str2Cards(String player) {
        player = player.replaceAll("\"", "");
        player = player.split(": ")[1];
        String[] cards = player.split(", ");
        ArrayList<Card> hand = new ArrayList<>();
        for (String card : cards) {
            hand.add(new Card(card));
        }
        return hand;
    }
    
    public static List<CardHand> parse(String input) {
        ArrayList<CardHand> playerHands = new ArrayList<>();
        String[] players = input.split("\n");
        for (int i=0; i<3; i++) {
            String player = players[i];
            List<Card> hand = str2Cards(player);
            playerHands.add(new PlayerHand(hand));
        }
        
        String croupier = players[3];
        List<Card> croupierHand = str2Cards(croupier);
        String deck = players[4];
        List<Card> deckCards = str2Cards(deck);     
        CroupierHand croupierCards = new CroupierHand(croupierHand, deckCards);
        playerHands.add(croupierCards);
        return playerHands;
    }
}
