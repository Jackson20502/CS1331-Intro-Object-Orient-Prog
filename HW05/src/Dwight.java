import java.util.ArrayList;
/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class Dwight extends Employee {
    /**
     * A constructor that takes in no values and
     * assigns his name to Dwight Schrute and height to 74.
     */
    public Dwight() {
        super("Dwight Schrute", 74);
    }
    @Override
    public String toString() {
        return "My name is Dwight and I am the fire marshal";
    }
    /**
     * Take an office object and return a boolean that tells
     * whether at least half of the departments have a fire extinguisher.
     * @param office Object Office.
     * @return At least half of the departments have a fire extinguisher or not.
     */
    public boolean checkOffice(Office office) {
        boolean flag;
        int count = 0;
        for (int i = 0; i < office.getDepartments().size(); i++) {
            if (office.getDepartments().get(i).getHasFireExtinguisher()) {
                count++;
            }
        }
        if ((double) count / office.getDepartments().size() >= 0.5) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
    /**
     * Check whether the employee is in the list of employees.
     * @param employee Object Employee.
     * @param employees Arraylist employees.
     * @return Has Employee or not.
     */
    public boolean findEmployee(Employee employee, ArrayList<Employee> employees) {
        boolean hasEmployee = false;
        int low = 0;
        int high = employees.size() - 1;
        int middle;
        if (employee.getHeight() < employees.get(high).getHeight()
            || employee.getHeight() > employees.get(low).getHeight()
            || low > high) {
            hasEmployee = false;
        }
        while (low <= high) {
            middle = (low + high) / 2;
            if (employees.get(middle).getHeight() > employee.getHeight()) {
                low = middle + 1;
            } else if (employees.get(middle).getHeight() < employee.getHeight()) {
                high = middle - 1;
            } else {
                hasEmployee = true;
                break;
            }
        }
        return hasEmployee;
    }
    /**
     * Take an ArrayList with the employees and an office object.
     * @param employees Arraylist employees.
     * @param office Object Office.
     * @return a new ArrayList with the employees that are in the office
     *         but are not in the in the employees ArrayList passed in.
     */
    public ArrayList<Employee> doRecount(ArrayList<Employee> employees, Office office) {
        ArrayList<Employee> overlap = new ArrayList<Employee>();
        for (int i = 0; i < office.getEmployee().size(); i++) {
            if (!findEmployee(office.getEmployee().get(i), employees)) {
                overlap.add(office.getEmployee().get(i));
            }
        }
        return overlap;
    }
}
