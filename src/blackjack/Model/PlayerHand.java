package blackjack.Model;

import java.util.List;

public class PlayerHand implements CardHand {
    private final List<Card> hand;
    
    public PlayerHand(List<Card> cards) {
        hand = cards;
    }
    
    @Override
    public int totalValue() {
        int totalValue = 0;
        int aces = 0;
        for (Card card : hand) {
            aces += card.value()==1?1:0;
            totalValue += card.value();
        }
        while (totalValue <= 11 && aces > 0) {
            aces--;
            totalValue += 10;
        }
        
        return totalValue;
    }
    
    @Override
    public int cardAmmount() {
        return hand.size();
    }
}
