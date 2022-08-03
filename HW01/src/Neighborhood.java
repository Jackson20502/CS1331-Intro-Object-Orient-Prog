
public class Neighborhood {
    private int numHouses;
    private House[] houses;
    public Neighborhood(House[] houses) {
        this.numHouses = 0;
        this.houses = houses;
    }
    public Neighborhood() {
        this.numHouses = 0;
        houses = new House[5];
        for (int i = 1; i <= houses.length; i++) {
            houses[i - 1] = null;
        }
    }
    public int getNumHouses() {
        return this.numHouses;
    }
    public House[] getHouses() {
        return this.houses;
    }
    public void setNumHouses(int numHouses) {
        this.numHouses = numHouses;
    }
    public void setHouses(House[] houses) {
        this.houses = houses;
    }
    public void displayNewHouses(int yearBuilt) {
        String hasOrNot = "";
        for (int i = 1; i <= houses.length; i++) {
            if (houses[i - 1] != null && houses[i - 1].getYearBuilt() >= yearBuilt
                    && houses[i - 1].getNumBaths() != -1) {
                if (houses[i - 1].getIsRenovated()) {
                    hasOrNot = "has";
                } else {
                    hasOrNot = "has not";
                }
                System.out.printf("House located at %s was built in %d, "
                        + "has %.1f number of bathrooms, and %s been renovated recently.\n",
                        houses[i - 1].getAddress(), houses[i - 1].getYearBuilt(),
                        houses[i - 1].getNumBaths(), hasOrNot);
            }
        }
    }
    public House addHouse(int index, House house) {
        House flag = null;
        if (index < 1 || index > houses.length || house == null) {
            System.out.printf("%d is an invalid index!\n", index);
            flag = null;
        } else if (houses[index - 1] == null) {
            houses[index - 1] = house;
            numHouses++;
            flag = null;
        } else {
            flag = houses[index - 1];
            houses[index - 1] = house;
        }
        return flag;
    }
    public House removeHouse(int index) {
        House flag = null;
        if (index < 1 || index > houses.length) {
            flag = null;
        }
        if (houses[index - 1] != null) {
            flag = houses[index - 1];
            houses[index - 1] = null;
            numHouses--;
        } else {
            flag = null;
        }
        return flag;
    }
    public boolean isFull() {
        boolean flag = false;
        for (int i = 1; i <= houses.length; i++) {
            if (houses[i - 1] == null) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }
}
