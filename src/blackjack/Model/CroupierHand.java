package blackjack.Model;

import java.util.List;

public class CroupierHand implements CardHand {
    private final List<Card> hand;
    private final List<Card> deck;
    private int cardAmmount = 0;
    
    public CroupierHand(List<Card> cards, List<Card> deckCards) {
        hand = cards;
        deck = deckCards;
    }
    
    @Override
    public int totalValue() {
        int totalValue = 0;
        
        for (Card card : hand) {
            totalValue += card.value();
            if (totalValue + 10 <= 21 && card.value() == 1) {
                totalValue += 10;
            }
            cardAmmount++;
        }
        int i = 0;
        while (totalValue < 17) {
            Card card = deck.get(i);
            totalValue += card.value();
            if (totalValue + 10 <= 21 && card.value() == 1) {
                totalValue += 10;
            }
            i++;
            cardAmmount++;
        }
        
        return totalValue;
    }
    
    @Override
    public int cardAmmount() {
        totalValue();
        return cardAmmount;
    }
}
