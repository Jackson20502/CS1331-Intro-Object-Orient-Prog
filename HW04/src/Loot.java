/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public abstract class Loot {
    private double value;
    /**
     * A Loot constructor that takes in a value.
     * @param value The monetary value of an item.
     */
    public Loot(double value) {
        this.value = value;
    }
    /**
     * A no-parameter constructor that sets value to 0.
     */
    public Loot() {
        this.value = 0;
    }
    /**
     * Set the value.
     * @param value The monetary value of an item.
     */
    public void setValue(double value) {
        if (value > 0) {
            this.value = value;
        }
    }
    /**
     * Get the value.
     * @return value.
     */
    public double getValue() {
        return this.value;
    }
    @Override
    public String toString() {
        return "A piece of loot worth " + value;
    }
    @Override
    public boolean equals(Object o) {
        boolean equal = false;
        if (o == null) {
            equal = false;
        } else if (o instanceof Loot) {
            equal = this.value == ((Loot) o).value;
        } else {
            equal = false;
        }
        return equal;
    }
}
