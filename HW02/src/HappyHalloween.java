/**
 *
 * @author 14918
 * @version 1.0
 */
public class HappyHalloween extends TrickOrTreater {
    /**
     * Test cases.
     * @param args The main method.
     */
    public static void main(String[] args) {
        BlackCat bc1 = new BlackCat("Milo", true);
        BlackCat bc2 = new BlackCat("Kitty", false);
        Witch w1 = new Witch("Glinda", "G", bc1);
        System.out.println(TrickOrTreater.getTotalCandy());
        Witch w2 = new Witch("Blair", "Green Mountain Park", 5, "B", bc2);
        System.out.println(TrickOrTreater.getTotalCandy());
        Ghost g1 = new Ghost(8);
        System.out.println(TrickOrTreater.getTotalCandy());
        Ghost g2 = new Ghost("Hamlet", "North Lamar", 3, 1);
        System.out.println(TrickOrTreater.getTotalCandy());
        Witch w3 = new Witch(w2);
        System.out.println(w3);
        System.out.println(w2);
        System.out.println(TrickOrTreater.getTotalCandy());
        System.out.println(w1.getNumCandy());
        w1.castSpell();
        System.out.println(w1.getNumCandy());
        System.out.println(TrickOrTreater.getTotalCandy());
        System.out.println(w2.getNumCandy());
        w2.castSpell();
        System.out.println(w2.getNumCandy());
        System.out.println(TrickOrTreater.getTotalCandy());
        w1.seekCandy(2);
        w2.seekCandy(3);
        w3.seekCandy(5);
        g1.seekCandy(6);
        g2.seekCandy(1);
        System.out.println(TrickOrTreater.getTotalCandy());
        g1.spook();
        g2.spook();
        bc1.meow();
        bc2.meow();
    }
}
