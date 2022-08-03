
public class Hw03Test {

	public static void main(String[] args) {
		SummerShowdown ss1 = new SummerShowdown(26, false, "CaiPan1", 20000, "BeiYongCP1");
		SummerShowdown ss2 = new SummerShowdown(25, false, "CaiPan2", 20000, "BeiYongCP2");
		SummerShowdown ss3 = new SummerShowdown(22, false, "CaiPan3", 20000, "BeiYongCP3");
		ConferenceLeague cl1 = new ConferenceLeague("Jason", 6, "Jackson");
		ConferenceLeague cl2 = cl1;
		System.out.println(ss1.getKnockout());
		System.out.println(ss2.getKnockout());
		System.out.println(cl1.getKnockout());
		System.out.println(cl2.getKnockout());
		System.out.println(ss1.toString());
		System.out.println(ss2.toString());
		System.out.println(cl1.toString());
		System.out.println(cl2.toString());
		System.out.println(ss1.equals(ss2));
		System.out.println(ss1.equals(ss3));
		System.out.println(cl1.equals(cl2));
		ss1.refereeHire("BeiYongCP1");
		System.out.println(ss1.maxCapacity);
		cl1.refereeHire("Jason");
		System.out.println(cl1.maxCapacity);
		cl1.nextRound();
		System.out.println(cl1.getNumTeams());
		System.out.println(cl1.maxCapacity);
		cl1.nextRound();
		System.out.println(cl1.getNumTeams());
		System.out.println(cl1.maxCapacity);
		cl1.nextRound();
		System.out.println(cl1.getNumTeams());
		System.out.println(cl1.maxCapacity);
		cl1.nextRound();
		System.out.println(cl1.getNumTeams());
		System.out.println(cl1.maxCapacity);
		cl1.nextRound();
		System.out.println(cl1.getNumTeams());
		System.out.println(cl1.maxCapacity);
//	    /**
//	     *
//	     * @param name The name of the tournament.
//	     */
//	    public void setName(String name) {
//	        this.name = name;
//	    }
//	    /**
//	     *
//	     * @param knockout A tournament where the loser is immediately eliminated.
//	     */
//	    public void setKnockout(boolean knockout) {
//	        this.knockout = knockout;
//	    }

//	    /**
//	     *
//	     * @param maxCapacity The maximum capacity for all stadiums.
//	     */
//	    public void setMaxCapacity(int maxCapacity) {
//	        this.maxCapacity = maxCapacity;
//	    }
	}

}
