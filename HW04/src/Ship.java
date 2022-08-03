/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class Ship implements Plunderable {
    private Loot[] cargo = new Loot[10];
    private double totalCargoValue;
    private String name;
    /**
     * A Ship constructor takes in a name.
     * @param name Every ship needs a good name.
     */
    public Ship(String name) {
        this.name = name;
        this.totalCargoValue = 0.0;
    }
    /**
     * A no-parameter Ship constructor.
     */
    public Ship() {
        this("Black Pearl");
    }
    @Override
    public String toString() {
        String totalCargo = "";
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] != null) {
                totalCargo += cargo[i];
            }
        }
        return "A ship called " + name
                + " with cargo " + totalCargo
                + ", which has a total value of "
                + Math.round(totalCargoValue * 100.0) / 100.0 + ".";
    }
    /**
     * This method is used to add cargos to a ship.
     * @param newItem Add a new item.
     */
    public void addCargo(Loot newItem) {
        int count = 0;
        if (newItem == null) {
            System.out.println("Invalid cargo!");
        }
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] == null) {
                cargo[i] = newItem;
                count = i;
                totalCargoValue++;
                break;
            }
        }
        if (count > cargo.length - 1) {
            Loot[] cargoTemp = cargo;
            cargo = new Loot[2 * cargo.length];
            for (int j = 0; j < cargo.length; j++) {
                cargo[j] = cargoTemp[j];
            }
            addCargo(newItem);
        }
    }
    /**
     * This method will set the first filled cargo slot
     * in the array to null, then return that cargo item.
     * @return Loot cargo.
     */
    public Loot removeCargo() {
        Loot temp = null;
        if (cargo == null) {
            temp = null;
        }
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] != null) {
                temp = cargo[i];
                cargo[i] = null;
                totalCargoValue--;
                break;
            }
        }
        return temp;
    }
    /**
     * This method will iterate through the array,
     * checking if that cargo is on the ship.
     * @param removeCargo Remove cargo.
     * @return Loot cargo.
     */
    public Loot removeCargo(Loot removeCargo) {
        Loot temp = null;
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i].equals(removeCargo)) {
                temp = removeCargo;
                cargo[i] = null;
                totalCargoValue--;
                break;
            } else {
                temp = null;
            }
        }
        return temp;
    }
    @Override
    public Loot[] bePlundered() {
        int count = 0;
        int j = 0;
        totalCargoValue = 0;
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] != null) {
                count++;
            }
        }
        Loot[] array = new Loot[count];
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] != null) {
                array[j] = cargo[i];
                j++;
                cargo[i] = null;
            }
        }
        return array;
    }
}
