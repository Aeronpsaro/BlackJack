package blackjack;

import blackjack.Model.CardHand;
import java.util.List;

public class BlackJack {

    private String getWinners(String state) {
        String output = "[";
        if (!InputChecker.inputCheck(state)) return "Incorrect input";
        List<CardHand> players = Parser.parse(state);
        for (int i = 0; i < 3; i++) {
            CardHand croupier = players.get(3);
            CardHand player = players.get(i);
            String separator = i<2?", ":"";
            output += CalculateWin.playerWin(croupier, player)?"Player"+(i+1)+separator:"";
        }
        output += "]";
        return output;
    }
    
    public static void main(String[] args) {
        BlackJack blackjack = new BlackJack();
        String winners = blackjack.getWinners(
            "Player 1: \"10\", \"K\"\n" +
            "Player 2: \"10\", \"2\", \"6\"\n" +
            "Player 3: \"8\", \"8\", \"5\"\n" +
            "Croupier: \"5\", \"10\"\n" +
            "Deck: \"A\", \"3\", \"K\", \"2\"");
        System.out.println(winners);
    }
    
}
