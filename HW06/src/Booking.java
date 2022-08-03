import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class Booking {
    /**
     * Takes in a String object representing the file name to read from.
     * @param readFileName A String object representing the file name.
     * @return an ArrayList of Transportation objects.
     * @throws FileNotFoundException FileNotFoundException.
     * @throws InvalidBookingException Check if it is an invalid booking type.
     */
    public static ArrayList<Transportation> outputBookings(String readFileName)
            throws FileNotFoundException, InvalidBookingException {
        ArrayList<Transportation> transportation = new ArrayList<Transportation>();
        File myFile;
        if (readFileName == null) {
            throw new FileNotFoundException("Invalid file!");
        } else {
            myFile = new File(readFileName);
        }
        if (myFile == null || !myFile.exists()) {
            throw new FileNotFoundException("Invalid file!");
        } else {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String subString = str.substring(0, str.length());
                String[] tranStr = subString.split(",");
                if (tranStr[0].equals("Flight")) {
                    Transportation trans = new Flight(tranStr[1], Integer.parseInt(tranStr[2]),
                            tranStr[3], tranStr[4], tranStr[5], Integer.parseInt(tranStr[6]));
                    transportation.add(trans);
                } else if (tranStr[0].equals("Bus")) {
                    Transportation trans = new Bus(tranStr[1], Integer.parseInt(tranStr[2]),
                            tranStr[3], tranStr[4], tranStr[5], Integer.parseInt(tranStr[6]));
                    transportation.add(trans);
                } else {
                    throw new InvalidBookingException();
                }
            }
        }
        return transportation;
    }
    /**
     * Takes in a String object representing the file name to write to.
     * Takes in an ArrayList of Transportation objects.
     * @param writeFileName A String object representing the file name.
     * @param transportationAL An ArrayList of Transportation objects.
     * @return a boolean value based on if the write is successful (true) or not (false).
     */
    public static boolean writeBookings(String writeFileName,
            ArrayList<Transportation> transportationAL) {
        boolean successful = false;
        File outFile = new File(writeFileName);
        PrintWriter printWriter = null;
        try {
            if (outFile.exists()) {
                outputBookings(writeFileName).addAll(transportationAL);
            }
            printWriter = new PrintWriter(outFile);
            Scanner scanner = new Scanner(outFile);
            for (int i = 0; i < transportationAL.size(); i++) {
                if (transportationAL.get(i).getCompany() == null
                        || transportationAL.get(i).getCompany().equals("")
                        || transportationAL.get(i).getDepartDate() == null
                        || transportationAL.get(i).getDepartDate().equals("")
                        || transportationAL.get(i).getDepartTime() == null
                        || transportationAL.get(i).getDepartTime().equals("")
                        || transportationAL.get(i).getArrivalTime() == null
                        || transportationAL.get(i).getArrivalTime().equals("")
                        || transportationAL.get(i).getId() < 0
                        || transportationAL.get(i).getId() < 10000
                        || transportationAL.get(i).getId() > 99999) {
                    throw new IllegalArgumentException();
                } else {
                    printWriter.println(transportationAL.get(i).toString());
                    successful = true;
                }
            }
        } catch (IllegalArgumentException ex) {
            successful = false;
            System.out.println(ex.getMessage());
        } catch (FileNotFoundException ex) {
            successful = false;
            System.out.println(ex.getMessage());
        } catch (InvalidBookingException ex) {
            successful = false;
            System.out.println(ex.getMessage());
        } finally {
            printWriter.close();
        }
        return successful;
    }
    /**
     * Takes in a String object representing the file name to read from.
     * Takes in a Transportation object.
     * @param readFileName A String object representing the file name.
     * @param transportation A Transportation object.
     * @return an ArrayList of Integer objects.
     * @throws FileNotFoundException FileNotFoundException.
     * @throws InvalidBookingException InvalidBookingException.
     */
    public static ArrayList<Integer> readBookings(String readFileName,
            Transportation transportation)
            throws FileNotFoundException, InvalidBookingException {
        int lineNum = 0;
        ArrayList<Integer> integer = new ArrayList<Integer>();
        File myFile;
        if (readFileName == null) {
            throw new FileNotFoundException("Invalid file!");
        } else {
            myFile = new File(readFileName);
        }
        if (myFile == null || !myFile.exists()) {
            throw new FileNotFoundException("Invalid file!");
        } else {
            int i = 0;
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine() && i < outputBookings(readFileName).size()) {
                lineNum++;
                Integer transform = Integer.valueOf(lineNum);
                if (outputBookings(readFileName).get(i).equals(transportation)) {
                    integer.add(transform);
                }
                i++;
            }
            System.out.println(integer);
            if (integer.isEmpty()) {
                throw new InvalidBookingException();
            }
        }
        return integer;
    }
    /**
     * Main method (Test).
     * @param args args.
     * @throws FileNotFoundException FileNotFoundException.
     * @throws InvalidBookingException InvalidBookingException.
     */
    public static void main(String[] args) throws FileNotFoundException, InvalidBookingException {
        Flight f1 = new Flight("Delta", 12345, "10-26-2021", "1524", "1721", 0);
        Flight f2 = new Flight("American", 11111, "09-23-2021", "0231", "0924", 1);
        Bus b1 = new Bus("Greyhound", 97823, "12-01-2021", "2243", "1023", 6);
        Bus b2 = new Bus("Bolt", 87643, "05-09-2021", "1133", "1418", 2);
        ArrayList<Transportation> transportationAL = new ArrayList<Transportation>();
        transportationAL.add(f1);
        transportationAL.add(f2);
        transportationAL.add(b1);
        transportationAL.add(b2);
//        outputBookings("Book.csv");
//        outputBookings(null);
        writeBookings("TestBooking.csv", transportationAL);
        outputBookings("Booking.csv");
        for (int i = 0; i < outputBookings("Booking.csv").size(); i++) {
            System.out.println(outputBookings("Booking.csv").get(i).toString());
        }
        Flight f3 = new Flight("SouthWest", 32174, "09-21-2021", "1231", "1524", 1);
        Bus b3 = new Bus("Marta", 20001, "09-21-2021", "1021", "1453", 8);
        transportationAL.add(f3);
        writeBookings("TestBooking.csv", transportationAL);
        transportationAL.add(b3);
        System.out.println(writeBookings("TestBooking.csv", transportationAL));
        readBookings("Booking.csv", f1);
    }
}
