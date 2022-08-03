/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class ConferenceLeague extends Tournament {
    private int teamsPerLeague;
    private String currentHolder;
    /**
     *
     * @param finalReferee The name of the referee for the final game of the tournament.
     * @param teamsPerLeagueand The number of participating teams from each league.
     * @param currentHolder The current holder of the Conference League trophy.
     */
    public ConferenceLeague(String finalReferee, int teamsPerLeagueand, String currentHolder) {
        super("Conference League", 32, true, finalReferee, 15000);
        this.teamsPerLeague = teamsPerLeagueand;
        this.currentHolder = currentHolder;
    }
    /**
     * Override method toString().
     * @return String.
     */
    public String toString() {
        return "Name: " + getName() + ", Number of Teams: " + getNumTeams() + ", Final Referee: "
                + getFinalReferee() + ", Teams per League: " + teamsPerLeague + ", Current Holder: " + currentHolder;
    }
    /**
     * Override method equals().
     * @param o Takes in an object.
     * @return true or false.
     */
    public boolean equals(Object o) {
        boolean equal = false;
        if (o == null) {
            equal = false;
        } else if (o instanceof ConferenceLeague) {
            equal = (this.currentHolder == ((ConferenceLeague) o).currentHolder
                    && this.getFinalReferee() == ((ConferenceLeague) o).getFinalReferee());
        } else {
            equal = false;
        }
        return equal;
    }
    /**
     * Method nextRound().
     */
    public void nextRound() {
        if (getKnockout()) {
            if (getNumTeams() > 2) {
                setNumTeams(getNumTeams() / 2);
            } else {
                System.out.println("We have reached the final!");
                if (maxCapacity > getFINALCAPACITY()) {
                    maxCapacity = getFINALCAPACITY();
                }
            }
        }
    }
    @Override
    public void refereeHire(String referee) {
        if (referee == getFinalReferee()) {
            System.out.println("We need a new referee!");
            setFinalReferee("Undecided");
        } else {
            System.out.println("We are ready to go!");
            maxCapacity = maxCapacity * 2;
        }
    }
}
