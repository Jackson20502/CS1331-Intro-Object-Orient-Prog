import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Loot c1 = new Coin(true, 1650);
		Loot c2 = new Coin(false, 1760);
		Loot s1 = new Sugar(10.0, 3.25);
		System.out.println(c1.toString());
		System.out.println(s1.toString());
		Ship p1 = new Ship("Sooraj's Amazing Test Ship");
		System.out.println(p1.toString());
		p1.addCargo(s1);
		p1.addCargo(c1);
		p1.addCargo(c2);
		//System.out.println(p1.getTotalCargoValue());
		System.out.println(p1.toString());
		//p1.removeCargo(c1);
		//System.out.println(p1.getTotalCargoValue());
		System.out.println(p1.toString());
		System.out.println(p1.bePlundered());
		//System.out.println(p1.getTotalCargoValue());
		//System.out.println(Arrays.toString(p1.bePlundered()));
//		p1.removeCargo();
//		System.out.println(p1.toString());
//		p1.removeCargo();
//		//System.out.println(p1.removeCargo(c1));
//		System.out.println(p1.toString());
//		p1.addCargo(s1);
//		System.out.println(p1.toString());
	}
}
