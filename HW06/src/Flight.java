/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class Flight extends Transportation {
    private int connectors;
    /**
     * A constructor that takes in company, id, departDate,
     * departTime, arrivalTime, and connectors.
     * @param company The name of the transportation company.
     * @param id The transportation vehicle number identifier.
     * @param departDate Departure date.
     * @param departTime Departure time.
     * @param arrivalTime Arrival time.
     * @param connectors The number of connecting flights.
     */
    public Flight(String company, int id, String departDate,
            String departTime, String arrivalTime, int connectors) {
        super(company, id, departDate, departTime, arrivalTime);
        try {
            if (connectors < 0) {
                throw new IllegalArgumentException("Invalid connectors!");
            } else {
                this.connectors = connectors;
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public String toString() {
        return "Flight," + company + "," + id + "," + departDate + ","
                + departTime + "," + arrivalTime + "," + connectors;
    }
    @Override
    public boolean equals(Object o) {
        boolean equal;
        if (o == null) {
            equal = false;
        } else if (o instanceof Flight) {
            equal = this.company.equals(((Flight) o).company)
                    && (this.id == ((Flight) o).id)
                    && this.departDate.equals(((Flight) o).departDate)
                    && this.departTime.equals(((Flight) o).departTime)
                    && this.arrivalTime.equals(((Flight) o).arrivalTime)
                    && (this.connectors == ((Flight) o).connectors);
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
     * Get connectors.
     * @return connectors.
     */
    public int getConnectors() {
        return this.connectors;
    }
}
