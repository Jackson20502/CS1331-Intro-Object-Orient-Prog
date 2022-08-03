
public class HouseHunting {
	public static void main(String[] args) {
	    House h1 = new House("Shanghai", 1999, 2, true);
	    House h2 = new House("Beijing", 1);
	    House h3 = new House();
	    House h4 = new House("Shenzhen", 1997, 3, false);
	    House h5 = new House("Taiwan", 2);
	    House h6 = new House("HongKong", 0);
	    Neighborhood n0 = new Neighborhood();
	    n0.addHouse(1, h1);
	    n0.addHouse(2, h2);
	    n0.addHouse(3, h3);
	    n0.addHouse(4, h4);
	    n0.addHouse(5, h5);
	    n0.addHouse(6, h5);
	    n0.displayNewHouses(1984);
	    System.out.println(n0.getNumHouses());
	    n0.removeHouse(2);
	    System.out.println(n0.getNumHouses());
	    n0.removeHouse(4);
	    System.out.println(n0.getNumHouses());
	    n0.displayNewHouses(1984);
	    System.out.println(n0.getNumHouses());
	    n0.addHouse(3, h6);
	    System.out.println(n0.getNumHouses());
	    n0.displayNewHouses(1984);
	    System.out.println(n0.getNumHouses());
	    n0.addHouse(2, h3);
	    System.out.println(n0.getNumHouses());
	    n0.displayNewHouses(1984);
	    System.out.println(n0.isFull());
	    System.out.println(n0.getNumHouses());
	    n0.displayNewHouses(1988);
	    System.out.println(n0.getNumHouses());
	}
}
