/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private int height;
    /**
     * A constructor that takes in name and height of the employee.
     * @param name The name of the employee.
     * @param height The height of the employee.
     */
    public Employee(String name, int height) {
        this.name = name;
        this.height = height;
    }
    @Override
    public String toString() {
        return "My name is " + name + " and I am " + height + " inches tall";
    }
    @Override
    public boolean equals(Object o) {
        boolean equal;
        if (o == null) {
            equal = false;
        } else if (o instanceof Employee) {
            equal = (this.name == ((Employee) o).name)
                    && (this.height == ((Employee) o).height);
        } else {
            equal = false;
        }
        return equal;
    }
    /**
     * compareTo() method.
     * @param o Take in an Employee class
     * @return -1, 0, 1.
     */
    @Override
    public int compareTo(Employee o) {
        int result;
        if (o != null && o instanceof Employee) {
            if (this.equals(o)) {
                result = 0;
            } else {
                result = this.height - ((Employee) o).height;
            }
        } else {
            result = -1;
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
     * Return height.
     * @return height.
     */
    public int getHeight() {
        return this.height;
    }
}
