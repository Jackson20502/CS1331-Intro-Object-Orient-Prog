import java.util.ArrayList;
/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class Office {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Employee> employees;
    /**
     * A constructor that takes in a name.
     * @param name The name of the office.
     */
    public Office(String name) {
        this.name = name;
        this.departments = new ArrayList<Department>();
        this.employees = new ArrayList<Employee>();
    }
    /**
     * Add a Department Object to the end of the ArrayList of departments.
     * @param department Object Department.
     */
    public void addDepartment(Department department) {
        if (department != null) {
            this.departments.add(department);
        }
    }
    /**
     * Add an Employee Object to the end of the ArrayList of employees.
     * @param employee Object Employee.
     */
    public void addEmployee(Employee employee) {
        if (employee != null && !employees.contains(employee)) {
            if (employees.isEmpty()) {
                this.employees.add(employee);
            } else {
                for (int i = 0; i < employees.size(); i++) {
                    if (employee.getHeight() > employees.get(i).getHeight()) {
                        this.employees.add(i, employee);
                        break;
                    } else {
                        this.employees.add(employee);
                        break;
                    }
                }
            }
        }
    }
    /**
     * Take in an Employee and remove it from the
     * ArrayList employees if it is in the ArrayList of employees.
     * @param employee Object Employee.
     * @return Employee.
     */
    public Employee removeEmployee(Employee employee) {
        Employee result;
        if (employee != null && employees.contains(employee)) {
            result = employee;
            this.employees.remove(employee);
        } else {
            result = null;
        }
        return result;
    }
    /**
     * Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Return departments.
     * @return departments.
     */
    public ArrayList<Department> getDepartments() {
        return this.departments;
    }
    /**
     * Return employees.
     * @return employees.
     */
    public ArrayList<Employee> getEmployee() {
        return this.employees;
    }
}
