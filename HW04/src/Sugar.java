/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class Sugar extends Loot {
    private double amount;
    private double sweetness;
    /**
     * A Sugar constructor that takes in amount and sweetness.
     * @param amount The amount of sugar.
     * @param sweetness This value represents the sweetness of the sugar.
     */
    public Sugar(double amount, double sweetness) {
        this.amount = amount;
        if (sweetness >= 0 && sweetness <= 100) {
            this.sweetness = sweetness;
        } else {
            this.sweetness = 0;
        }
        setValue(this.amount * this.sweetness);
    }
    @Override
    public String toString() {
        return " A pile of sugar of size " + amount + " and sweetness " + sweetness + ".";
    }
    @Override
    public boolean equals(Object o) {
        boolean equal = false;
        if (o == null) {
            equal = false;
        } else if (o instanceof Sugar) {
            equal = super.equals(o)
                    && (this.amount == ((Sugar) o).amount)
                    && (this.sweetness == ((Sugar) o).sweetness);
        } else {
            equal = false;
        }
        return equal;
    }
}
