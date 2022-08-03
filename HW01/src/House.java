
public class House {
    private String address;
    private int yearBuilt;
    private double numBaths;
    private boolean isRenovated;
    public House(String address, int yearBuilt, double numBaths, boolean isRenovated) {
        this.address = address;
        this.yearBuilt = yearBuilt;
        this.numBaths = numBaths;
        this.isRenovated = isRenovated;
    }
    public House(String address, double numBaths) {
        this(address, 1984, numBaths, false);
    }
    public House() {
        this("North Ave NW, Atlanta, GA 30332", 1984, 1, false);
    }
    public String getAddress() {
        return this.address;
    }
    public int getYearBuilt() {
        return this.yearBuilt;
    }
    public double getNumBaths() {
        return this.numBaths;
    }
    public boolean getIsRenovated() {
        return this.isRenovated;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setYearBuilt(int yearBuilt) {
        if (yearBuilt < 0) {
            System.out.println("Invalid yearBuilt!");
        } else {
            this.yearBuilt = yearBuilt;
        }
    }
    public void setNumBaths(double numBaths) {
        if (numBaths >= 0 && numBaths % 0.5 == 0) {
            this.numBaths = numBaths;
        } else {
            this.numBaths = -1;
            System.out.println("Invalid numBuilt!");
        }
    }
    public void setIsRenovated(boolean isRenovated) {
        this.isRenovated = isRenovated;
    }
}
