/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public abstract class Tournament {
    private String name;
    private int numTeams;
    private boolean knockout = true;
    private String finalReferee;
    protected int maxCapacity;
    private static final int FINAL_CAPACITY = 30000;
    /**
     *
     * @param name The name of the tournament.
     * @param numTeams The number of teams in a tournament.
     * @param knockout A tournament where the loser is immediately eliminated.
     * @param finalReferee The name of the referee for the final game of the tournament.
     * @param maxCapacity The maximum capacity for all stadiums.
     */
    public Tournament(String name, int numTeams, boolean knockout, String finalReferee, int maxCapacity) {
        this.name = name;
        if (numTeams % 2 == 0) {
            this.numTeams = numTeams;
        } else {
            this.numTeams = 16;
        }
        if (numTeams > 64 && !knockout) {
            this.knockout = true;
        } else {
            this.knockout = knockout;
        }
        this.finalReferee = finalReferee;
        this.maxCapacity = maxCapacity;
    }
    /**
     *
     * @return String.
     */
    public String toString() {
        String str = "";
        if (knockout) {
            str = "this is a KO tournament";
        } else {
            str = "this isn't a KO tournament";
        }
        return "Name: " + name + ", Number of Teams: " + numTeams + ", KO: "
                + str + ", Final Referee: " + finalReferee + ", Maximum Capacity: " + maxCapacity;
    }
    /**
     * @param o Takes in an object.
     * @return true or false.
     */
    public boolean equals(Object o) {
        boolean equal = false;
        if (o == null) {
            equal = false;
        } else if (o instanceof Tournament) {
            equal = (this.name.equals(((Tournament) o).name)
                    && this.getNumTeams() == ((Tournament) o).getNumTeams()
                    && this.getKnockout() == ((Tournament) o).getKnockout());
        } else {
            equal = false;
        }
        return equal;
    }
    /**
     *
     * @param referee Takes in a String.
     */
    public abstract void refereeHire(String referee);
    /**
     *
     * @param numTeams The number of teams in a tournament.
     */
    public void setNumTeams(int numTeams) {
        if (numTeams % 2 == 0) {
            this.numTeams = numTeams;
        } else {
            this.numTeams = 16;
        }
    }
    /**
    *
    * @param finalReferee The name of the referee for the final game of the tournament.
    */
    public void setFinalReferee(String finalReferee) {
        this.finalReferee = finalReferee;
    }
    /**
     *
     * @return Name.
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @return Number of teams.
     */
    public int getNumTeams() {
        return numTeams;
    }
    /**
     *
     * @return Knockout.
     */
    public boolean getKnockout() {
        return knockout;
    }
    /**
     *
     * @return The final referee.
     */
    public String getFinalReferee() {
        return finalReferee;
    }
    /**
     *
     * @return The max capacity.
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }
    /**
     *
     * @return The final capacity.
     */
    public int getFINALCAPACITY() {
        return FINAL_CAPACITY;
    }
}
