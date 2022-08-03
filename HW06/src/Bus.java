/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class Bus extends Transportation {
    private int stops;
    /**
     * A constructor that takes in company, id,
     * departDate, departTime, arrivalTime, and stops.
     * @param company The name of the transportation company.
     * @param id The transportation vehicle number identifier.
     * @param departDate Departure date.
     * @param departTime Departure time.
     * @param arrivalTime Arrival time.
     * @param stops The number of stops the bus trip has.
     */
    public Bus(String company, int id, String departDate,
            String departTime, String arrivalTime, int stops) {
        super(company, id, departDate, departTime, arrivalTime);
        try {
            if (stops < 0) {
                throw new IllegalArgumentException("Invalid stops!");
            } else {
                this.stops = stops;
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public String toString() {
        return "Bus," + company + "," + id + "," + departDate + ","
                + departTime + "," + arrivalTime + "," + stops;
    }
    @Override
    public boolean equals(Object o) {
        boolean equal;
        if (o == null) {
            equal = false;
        } else if (o instanceof Bus) {
            equal = this.company.equals(((Bus) o).company)
                    && (this.id == ((Bus) o).id)
                    && this.departDate.equals(((Bus) o).departDate)
                    && this.departTime.equals(((Bus) o).departTime)
                    && this.arrivalTime.equals(((Bus) o).arrivalTime)
                    && (this.stops == ((Bus) o).stops);
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
    /**
     * Get stops.
     * @return stops.
     */
    public int getStops() {
        return this.stops;
    }
}
