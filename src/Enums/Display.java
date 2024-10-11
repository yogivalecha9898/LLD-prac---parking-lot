package Enums;

public enum Display {
    FREE_SLOTS("free_slots"),
    FREE_COUNT("free_count"),
    OCCUPIED_SLOTS("occupied_slots");

    private final String value;

    Display(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static Display getDisplay(String stringValue) {
        for(Display display : Display.values()) {
            if(display.getValue().equals(stringValue)) {
                return display;
            }
        }

        return null;
    }
}
