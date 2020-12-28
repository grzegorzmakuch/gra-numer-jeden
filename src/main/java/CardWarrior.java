public class CardWarrior extends Card {
    private long cardWarriorId;
    private int health;
    private int attack;
    private int defense;
    private boolean isAlive;

    public CardWarrior(long id, String cardName, CardType cardType, long cardWarriorId, int health, int attack, int defense, boolean isAlive) {
        super(id, cardName, cardType);
        this.cardWarriorId = cardWarriorId;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.isAlive = isAlive;
    }
}
