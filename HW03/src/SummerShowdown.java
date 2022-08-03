/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class SummerShowdown extends Tournament {
    private String backupReferee;
    /**
     *
     * @param numTeams The number of teams in a tournament.
     * @param knockout A tournament where the loser is immediately eliminated.
     * @param finalReferee The name of the referee for the final game of the tournament.
     * @param maxCapacity The maximum capacity for all stadiums.
     * @param backupReferee A backup referee.
     */
    public SummerShowdown(int numTeams, boolean knockout, String finalReferee, int maxCapacity, String backupReferee) {
        super("Summer Showdown", numTeams, knockout, finalReferee, maxCapacity);
        this.backupReferee = backupReferee;
    }
    /**
     *
     * @param finalReferee The name of the referee for the final game of the tournament.
     * @param backupReferee A backup referee.
     */
    public SummerShowdown(String finalReferee, String backupReferee) {
        super("Summer Showdown", 64, false, finalReferee, 20000);
        this.backupReferee = backupReferee;
    }
    /**
     * @return String.
     */
    public String toString() {
        return "Name: " + getName() + ", Number of Teams: " + getNumTeams() + ", Final Referee: "
                + getFinalReferee() + ", Backup Referee: " + backupReferee + ", Maximum Capacity: " + maxCapacity;
    }
    /**
     * @param o Takes in an object.
     * @return true of false.
     */
    public boolean equals(Object o) {
        boolean equal = false;
        if (o == null) {
            equal = false;
        } else if (o instanceof SummerShowdown) {
            equal = (this.getMaxCapacity() == ((SummerShowdown) o).getMaxCapacity()
                    && this.getFinalReferee() == ((SummerShowdown) o).getFinalReferee());
        } else {
            equal = false;
        }
        return equal;
    }
    @Override
    public void refereeHire(String referee) {
        if (referee == getFinalReferee()) {
            System.out.printf("We need a new referee! %s is already refereeing the final!\n", referee);
            backupReferee = "Undecided";
        } else if (backupReferee == referee) {
            System.out.println("Be ready for some conflicts!");
            maxCapacity = maxCapacity / 2;
        } else {
            System.out.println("Ready to play!");
        }
    }
}
