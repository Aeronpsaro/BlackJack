package blackjack.Model;

public class Card {
    Number number;
    
    public Card(String value) {
        switch (value) {
            case "A":
                number = Number.ACE;
                break;
            case "2":
                number = Number.TWO;
                break;
            case "3":
                number = Number.THREE;
                break;
            case "4":
                number = Number.FOUR;
                break;
            case "5":
                number = Number.FIVE;
                break;
            case "6":
                number = Number.SIX;
                break;
            case "7":
                number = Number.SEVEN;
                break;
            case "8":
                number = Number.EIGHT;
                break;
            case "9":
                number = Number.NINE;
                break;
            case "10":
                number = Number.TEN;
                break;
            case "J":
                number = Number.JACK;
                break;
            case "Q":
                number = Number.QUEEN;
                break;
            case "K":
                number = Number.KING;
                break;
        }
    }
    
    public int value() {
        switch (number) {
            case ACE:
                return 1;
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            case TEN:
                return 10;
            case JACK:
                return 10;
            case QUEEN:
                return 10;
            case KING:
                return 10;
            default:
                throw new AssertionError();
        }
    }
}
