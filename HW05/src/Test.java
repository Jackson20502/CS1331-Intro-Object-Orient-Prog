import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Department d1 = new Department("Buy", false);
		Department d2 = new Department("Sale", true);
		Department d3 = new Department("ADS", true);
		Employee e1 = new Employee("Li", 6);
		Employee e2 = new Employee("Wang", 5);
		Employee e3 = new Employee("Zhang", 7);
		Employee e4 = new Employee("Gu", 4);
		Employee e5 = new Employee("Zhang", 7);
		Employee e6 = new Employee("Lee", 3);
		Employee e7 = new Employee("King", 5);
		Employee e8 = new Employee("Ben", 4);;
		Office o1 = new Office("Advisor Office");
		Office o2 = new Office("Professor Office");
		Dwight dwight = new Dwight();
		o1.addDepartment(d1);
		o1.addDepartment(d2);
		o1.addDepartment(d3);
		
		o1.addEmployee(e1);
		o1.addEmployee(e2);
		o1.addEmployee(e3);
		o1.addEmployee(e4);
		o1.addEmployee(e5);
		
		o2.addEmployee(e6);
		o2.addEmployee(e2);
		o2.addEmployee(e3);
		
		System.out.println(o1.getEmployee());
		System.out.println(o1.getEmployee().get(0));
		System.out.println(e3.compareTo(e4));
		//System.out.println(o1.getEmployee());
		System.out.println(o1.getEmployee().size());
//		System.out.println(o1.removeEmployee(e1));
//		System.out.println(o1.removeEmployee(e3));
		System.out.println("o1: "+o1.getEmployee());
		System.out.println("o2: "+o2.getEmployee());

		//System.out.println(dwight.checkOffice(o1));
		System.out.println(dwight.findEmployee(e1, o1.getEmployee()));
		System.out.println(dwight.doRecount(o2.getEmployee(), o1));
		System.out.println(dwight.findEmployee(e7, o1.getEmployee()));
		
//		Employee: compareTo()
//      if (this.height > ((Employee) o).height) {
//          result = 1;
//      } else if (this.height == ((Employee) o).height) {
//          result = 0;
//      } else {
//          result = -1;
//      }
	}

}
