/**
 *
 * @author 14918
 * @version 1.0
 */
public class Ghost extends TrickOrTreater {
    private int transparency;
    /**
     * Constructor taking name, neighborhood, numCandy, and transparency.
     * @param name The name of the ghost.
     * @param neighborhood The neighborhood.
     * @param numCandy The numCandy.
     * @param transparency The transparency of the ghost.
     */
    public Ghost(String name, String neighborhood, int numCandy, int transparency) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.numCandy = numCandy;
        this.transparency = transparency;
        TrickOrTreater.totalCandy += numCandy;
    }
    /**
     *
     * @param transparency The transparency of the ghost.
     */
    public Ghost(int transparency) {
        super();
        this.transparency = transparency;
    }
    /**
     *
     * @param other A copy of a ghost.
     */
    public Ghost(Ghost other) {
        this(other.getName(), other.getNeighborhood(), other.getNumCandy(), other.getTransparency());
    }
    /**
     * Method spook().
     */
    public void spook() {
        if (transparency >= 10) {
            System.out.println("Very spooky");
        } else if (transparency >= 3 && transparency <= 9) {
            System.out.println("Boo!");
        } else {
            System.out.println("Not very spooky");
        }
    }
    /**
     *
     * @param transparency The transparency of the ghost.
     */
    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }
    /**
     *
     * @return Returns the transparency of the ghost.
     */
    public int getTransparency() {
        return this.transparency;
    }
}
