package Entities;

public class ParkingLot {
    private final String id;
    private final Integer floors;
    private final Integer lots;

    public ParkingLot(String id, Integer floors, Integer lots) {
        this.id = id;
        this.floors = floors;
        this.lots = lots;
    }

    public Integer getFloors() {
        return this.floors;
    }

    public Integer getLots() {
        return this.lots;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "id='" + id + '\'' +
                ", floors=" + floors +
                ", lots=" + lots +
                '}';
    }
}
