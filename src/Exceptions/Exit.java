package Exceptions;

import Constants.Constants;

public class Exit extends RuntimeException {
    public Exit() {
        super(Constants.SINGLE_SPACE.trim());
    }
}
