/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class Coin extends Loot {
    private boolean heads;
    private int yearMade;
    private String material;
    /**
     * A Coin constructor that takes in value, heads, yearMade, and material.
     * @param value The monetary value of an item.
     * @param heads Represents whether or not the coin is heads up or tails up.
     * @param yearMade The year the coin was manufactured in.
     * @param material The material the Coin is made of, such as gold, silver, etc.
     */
    public Coin(double value, boolean heads, int yearMade, String material) {
        super(value);
        this.heads = heads;
        if (yearMade >= 0 && yearMade <= 1700) {
            this.yearMade = yearMade;
        } else {
            this.yearMade = 1700;
        }
        this.material = material;
    }
    /**
     * A Coin constructor that takes in heads and yearMade.
     * @param heads Represents whether or not the coin is heads up or tails up.
     * @param yearMade The year the coin was manufactured in.
     */
    public Coin(boolean heads, int yearMade) {
        this((double) (3000 - yearMade) / 100.0, heads, yearMade, "Gold");
    }
    @Override
    public String toString() {
        return " A " + material + " coin made in " + yearMade + ". Heads side is up: " + heads + ".";
    }
    @Override
    public boolean equals(Object o) {
        boolean equal = false;
        if (o == null) {
            equal = false;
        } else if (o instanceof Coin) {
            equal = super.equals(o)
                    && (this.yearMade == ((Coin) o).yearMade)
                    && (this.material == ((Coin) o).material);
        } else {
            equal = false;
        }
        return equal;
    }
}
