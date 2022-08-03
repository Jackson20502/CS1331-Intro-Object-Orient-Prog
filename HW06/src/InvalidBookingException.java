/**
 *
 * @author 14918 Jiacheng Zhang
 * @version 1.0
 */
public class InvalidBookingException extends Exception {
    /**
     * A constructor that takes in String representing the exception's message.
     * @param exceptionMessage A String representing the exception's message.
     */
    public InvalidBookingException(String exceptionMessage) {
        super(exceptionMessage);
    }
    /**
     * A no-args constructor that has default message "Invalid booking type".
     */
    public InvalidBookingException() {
        super("Invalid booking type");
    }
}
