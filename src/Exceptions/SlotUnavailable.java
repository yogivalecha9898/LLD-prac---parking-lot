package Exceptions;

public class SlotUnavailable extends RuntimeException {
    public SlotUnavailable(String message) {
        super(message);
    }
}
