public class Shield {
    private String name;
    private long shieldTypeId;
    private int defensePoints;

    public Shield() {
    }

    public Shield(String name, long shieldTypeId, int defensePoints) {
        this.name = name;
        this.shieldTypeId = shieldTypeId;
        this.defensePoints = defensePoints;
    }
}
