package blackjack;

import blackjack.Model.CardHand;

public class CalculateWin {
    public static boolean playerWin(CardHand croupier, CardHand player) {
        int playerValue = 21 - player.totalValue();
        if (playerValue < 0) {return false;}
        int croupierValue = 21 - croupier.totalValue();
        if (croupierValue < 0) {return true;}
        if (croupierValue != playerValue) {return playerValue<croupierValue;}
        if (playerValue == 0 && player.cardAmmount() == 2) {return croupier.cardAmmount() != 2;}
        return false;
    }
}
