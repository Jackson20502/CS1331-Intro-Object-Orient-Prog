/**
 *
 * @author 14918
 * @version 1.0
 */
public class TrickOrTreater {
    /*Difference between static and non-static values:
     *Static variables can be accessed using class name.
     *(A global variable and is available to all methods.)
     *Non-static variables can be accessed using instance of a class.
     *(A local variable and they can be accessed through only instance of a class.)
     */
    protected String name;
    protected String neighborhood;
    protected int numCandy = 0;
    protected static int totalCandy = 0;
    /**
     * Constructor taking name, neighborhood, and numCandy.
     *
     * @param name The name of the TrickOrTreater.
     * @param neighborhood The neighborhood.
     * @param numCandy The number of candies.
     */
    public TrickOrTreater(String name, String neighborhood, int numCandy) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.numCandy = numCandy;
        TrickOrTreater.totalCandy += numCandy;
    }
    /**
     * Constructor taking no parameters.
     */
    public TrickOrTreater() {
        this("Agnes", "Halloweentown", 0);
    }
    /**
     *
     * @param luck The number of luck.
     */
    public void seekCandy(int luck) {
        int numSeekCandy = 3 * luck;
        numCandy += numSeekCandy;
        TrickOrTreater.totalCandy += numSeekCandy;
    }
    /**
     *
     * @param name Set the name of the TrickOrTreater.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *
     * @param neighborhood Set the neighborhood.
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
    /**
     *
     * @param numCandy Set the number of candies.
     */
    public void setNumCandy(int numCandy) {
        this.numCandy = numCandy;
    }
    /**
     *
     * @param totalCandy Set the number of total candies.
     */
    public static void setTotalCandy(int totalCandy) {
        TrickOrTreater.totalCandy = totalCandy;
    }
    /**
     *
     * @return Returns the name.
     */
    public String getName() {
        return this.name;
    }
    /**
     *
     * @return Returns the neighborhood.
     */
    public String getNeighborhood() {
        return this.neighborhood;
    }
    /**
     *
     * @return Returns the numCandy.
     */
    public int getNumCandy() {
        return this.numCandy;
    }
    /**
     *
     * @return Returns the totalCandy.
     */
    public static int getTotalCandy() {
        return TrickOrTreater.totalCandy;
    }
}
