package blackjack;

public class InputChecker {
    public static boolean inputCheck(String input) {
        String regex = "Player 1: \"([A23456789JQK]|10)\"(, \"([A23456789JQK]|10)\")*\n" +
                "Player 2: \"([A23456789JQK]|10)\"(, \"([A23456789JQK]|10)\")*\n"+
                "Player 3: \"([A23456789JQK]|10)\"(, \"([A23456789JQK]|10)\")*\n"+
                "Croupier: \"([A23456789JQK]|10)\"(, \"([A23456789JQK]|10)\")*\n"+
                "Deck: \"([A23456789JQK]|10)\"(, \"([A23456789JQK]|10)\")*";
        return input.matches(regex);
    }
}
