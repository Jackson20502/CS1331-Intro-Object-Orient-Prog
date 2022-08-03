/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public abstract class Transportation {
    protected String company;
    protected int id;
    protected String departDate;
    protected String departTime;
    protected String arrivalTime;
    /**
     * A constructor that takes in company, id,
     * departDate, departTime, and arrivalTime.
     * @param company The name of the transportation company.
     * @param id The transportation vehicle number identifier.
     * @param departDate Departure date.
     * @param departTime Departure time.
     * @param arrivalTime Arrival time.
     */
    public Transportation(String company, int id, String departDate,
            String departTime, String arrivalTime) {
        try {
            if (company == null || company.equals("")
                || departDate == null || departDate.equals("")
                || departTime == null || departTime.equals("")
                || arrivalTime == null || arrivalTime.equals("")
                || id < 0 || id < 10000 || id > 99999) {
                throw new IllegalArgumentException("Invalid company/id/departDate/departTime/arrivalTime!");
            } else {
                this.company = company;
                this.id = id;
                this.departDate = departDate;
                this.departTime = departTime;
                this.arrivalTime = arrivalTime;
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public String toString() {
        return company + "," + id + "," + departDate + ","
                + departTime + "," + arrivalTime;
    }
    @Override
    public boolean equals(Object o) {
        boolean equal;
        if (o == null) {
            equal = false;
        } else if (o instanceof Transportation) {
            equal = this.company.equals(((Transportation) o).company)
                    && (this.id == ((Transportation) o).id)
                    && this.departDate.equals(((Transportation) o).departDate)
                    && this.departTime.equals(((Transportation) o).departTime)
                    && this.arrivalTime.equals(((Transportation) o).arrivalTime);
        } else {
            equal = false;
        }
        return equal;
    }
    /**
     * Get Company.
     * @return company.
     */
    public String getCompany() {
        return this.company;
    }
    /**
     * Get id.
     * @return id.
     */
    public int getId() {
        return this.id;
    }
    /**
     * Get departDate.
     * @return departDate.
     */
    public String getDepartDate() {
        return this.departDate;
    }
    /**
     * Get departTime.
     * @return departTime.
     */
    public String getDepartTime() {
        return this.departTime;
    }
    /**
     * Get arrivalTime.
     * @return arrivalTime.
     */
    public String getArrivalTime() {
        return this.arrivalTime;
    }
}
