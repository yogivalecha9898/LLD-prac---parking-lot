package Services.Strategy;

import Constants.Constants;
import Entities.BruteForceParkingLot;
import Entities.ParkingLots;
import Enums.VehicleType;

import java.util.List;

public class BruteForceAvailability implements Availability {
    private final ParkingLots parkingLots;

    public BruteForceAvailability(ParkingLots parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public Integer getFreeSlotCounts(String vehicle) {
        BruteForceParkingLot bruteForceParkingLot = (BruteForceParkingLot) parkingLots.getParkingLots().get(0);

        if(VehicleType.CAR.name().equals(vehicle)) {
            printSlotsCounts(bruteForceParkingLot, vehicle, 3, bruteForceParkingLot.getLots());
        } else if(VehicleType.BIKE.name().equals(vehicle)) {
            printSlotsCounts(bruteForceParkingLot, vehicle, 1, 3);
        } else {
            printSlotsCounts(bruteForceParkingLot, vehicle, 0, 1);
        }

        return 0;
    }

    @Override
    public List<Integer> getFreeSlots(String vehicle) {
        BruteForceParkingLot bruteForceParkingLot = (BruteForceParkingLot) parkingLots.getParkingLots().get(0);

        if(VehicleType.CAR.name().equals(vehicle)) {
            printAvaiSlots(bruteForceParkingLot, vehicle, 3, bruteForceParkingLot.getLots());
        } else if(VehicleType.BIKE.name().equals(vehicle)) {
            printAvaiSlots(bruteForceParkingLot, vehicle, 1, 3);
        } else {
            printAvaiSlots(bruteForceParkingLot, vehicle, 0, 1);
        }

        return List.of();
    }

    @Override
    public List<Integer> getOccupiedSlots(String vehicle) {
        BruteForceParkingLot bruteForceParkingLot = (BruteForceParkingLot) parkingLots.getParkingLots().get(0);

        if(VehicleType.CAR.name().equals(vehicle)) {
            printOccuSlots(bruteForceParkingLot, vehicle, 3, bruteForceParkingLot.getLots());
        } else if(VehicleType.BIKE.name().equals(vehicle)) {
            printOccuSlots(bruteForceParkingLot, vehicle, 1, 3);
        } else {
            printOccuSlots(bruteForceParkingLot, vehicle, 0, 1);
        }

        return List.of();
    }

    private void printSlotsCounts(BruteForceParkingLot bruteForceParkingLot, String vehicle, int start, int end) {
        for(int i = 0; i < bruteForceParkingLot.getFloors(); i++) {
            int emptyLots = 0;

            for(int j = start; j < end; j++) {
                if(bruteForceParkingLot.getAMap()[i][j].equals(Constants.SINGLE_SPACE.trim())) {
                    emptyLots++;
                }
            }

            String info = String.format("No. of free slots for %s on Floor %s: %s", vehicle, i + 1, emptyLots);

            System.out.println(info);
        }
    }

    private void printAvaiSlots(BruteForceParkingLot bruteForceParkingLot, String vehicle, int start, int end) {
        for(int i = 0; i < bruteForceParkingLot.getFloors(); i++) {
            String slots = Constants.SINGLE_SPACE.trim();

            for(int j = start; j < end; j++) {
                if(bruteForceParkingLot.getAMap()[i][j].equals(Constants.SINGLE_SPACE.trim())) {
                    if(slots.length() >= 1) {
                        slots += "," + (j + 1);
                    } else slots += (j + 1);
                }
            }

            String info = String.format("Free slots for %s on Floor %s: %s", vehicle, i + 1, slots);

            System.out.println(info);
        }
    }

    private void printOccuSlots(BruteForceParkingLot bruteForceParkingLot, String vehicle, int start, int end) {
        for(int i = 0; i < bruteForceParkingLot.getFloors(); i++) {
            String slots = Constants.SINGLE_SPACE.trim();

            for(int j = start; j < end; j++) {
                if(!bruteForceParkingLot.getAMap()[i][j].equals(Constants.SINGLE_SPACE.trim())) {
                    if(slots.length() >= 1) {
                        slots += "," + (j + 1);
                    } else slots += (j + 1);
                }
            }

            String info = String.format("Occupied slots for %s on Floor %s: %s", vehicle, i + 1, slots);

            System.out.println(info);
        }
    }
}
