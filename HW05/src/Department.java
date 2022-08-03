/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class Department {
    private String name;
    private boolean hasFireExtinguisher;
    /**
     * A Department constructor that takes in the name
     * and if the department has a fire extinguisher.
     * @param name The name of the department.
     * @param hasFireExtinguisher Indicates if the department has a fire extinguisher.
     */
    public Department(String name, boolean hasFireExtinguisher) {
        this.name = name;
        this.hasFireExtinguisher = hasFireExtinguisher;
    }
    /**
     * Return name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Return hasFireExtinguisher.
     * @return hasFireExtinguisher.
     */
    public boolean getHasFireExtinguisher() {
        return this.hasFireExtinguisher;
    }
}
