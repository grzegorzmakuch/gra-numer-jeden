public class Card {
    private long cardId;
    private String cardName;
    private CardType cardType;

    public Card() {
    }

    public Card(long cardId, String cardName, CardType cardType) {
        this.cardId = cardId;
        this.cardName = cardName;
        this.cardType = cardType;
    }
}
