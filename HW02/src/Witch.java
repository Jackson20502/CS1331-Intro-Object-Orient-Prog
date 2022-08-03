/**
 *
 * @author 14918
 * @version 1.0
 */
public class Witch extends TrickOrTreater {
    private String signatureSpell;
    private BlackCat companion;
    /**
     * Constructor taking name, neighborhood, numCandy, signatureSpell, and companion.
     * @param name The name of the witch.
     * @param neighborhood The neighborhood.
     * @param numCandy The numCandy.
     * @param signatureSpell The signatureSpell of the witch.
     * @param companion The companion.
     */
    public Witch(String name, String neighborhood, int numCandy,
            String signatureSpell, BlackCat companion) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.numCandy = numCandy;
        this.signatureSpell = signatureSpell;
        this.companion = companion;
        TrickOrTreater.totalCandy += numCandy;
    }
    /**
     * Constructor taking name, signatureSpell, and companion.
     * @param name The name of the witch.
     * @param signatureSpell The signatureSpell of the witch.
     * @param companion The companion.
     */
    public Witch(String name, String signatureSpell, BlackCat companion) {
        this(name, "Godric's Hollow", 13, signatureSpell, companion);
    }
    /**
     * Constructor taking an exist witch.
     * @param other A copy of a witch.
     */
    public Witch(Witch other) {
        this(other.getName(), other.getNeighborhood(), other.getNumCandy(),
                other.getSignatureSpell(), new BlackCat(other.companion));
    }
    /**
     * Method castSpell().
     */
    public void castSpell() {
        int numAfterCastSpell = 0;
        System.out.printf("%s casts %s\n", name, signatureSpell);
        TrickOrTreater.totalCandy += numCandy;
        numAfterCastSpell = numCandy * 2;
        numCandy = numAfterCastSpell;
    }
    /**
     *
     * @param signatureSpell The signatureSpell of the witch.
     */
    public void setSignatureSpell(String signatureSpell) {
        this.signatureSpell = signatureSpell;
    }
    /**
     *
     * @return Returns the signatureSpell.
     */
    public String getSignatureSpell() {
        return this.signatureSpell;
    }
    /**
     *
     * @param companion The companion.
     */
    public void setCompanion(BlackCat companion) {
        this.companion = companion;
    }
    /**
     *
     * @return Returns the companion.
     */
    public BlackCat getCompanion() {
        return this.companion;
    }
}
