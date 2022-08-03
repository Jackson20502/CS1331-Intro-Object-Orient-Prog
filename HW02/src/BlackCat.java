/**
 *
 * @author 14918
 * @version 1.0
 */
public class BlackCat {
    private String name;
    private boolean familiar;
    /**
     *
     * @param name The name of the BlackCat.
     * @param familiar Whether it's familiar or not.
     */
    public BlackCat(String name, boolean familiar) {
        this.name = name;
        this.familiar = familiar;
    }
    /**
     *
     * @param companion Copy BlackCat.
     */
    public BlackCat(BlackCat companion) {
        this(companion.name, companion.familiar);
    }
    /**
     * Method meow().
     */
    public void meow() {
        if (familiar) {
            System.out.printf("%s is a familiar\n", name);
        } else {
            System.out.printf("%s is not a familiar\n", name);
        }
    }
    /**
     * @param name The name of the BlackCat.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return Returns the name of the BlackCat.
     */
    public String getName() {
        return this.name;
    }
    /**
     *
     * @param familiar Whether it's familiar or not.
     */
    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }
    /**
     *
     * @return Returns whether it's familiar or not.
     */
    public boolean getFamiliar() {
        return this.familiar;
    }
}
