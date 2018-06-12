import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

  private int maxSlots;
  private int parkingLots;
  private Car[][] parkingSlots;

  public ParkingLot(int maxSlots, int parkingLots) {
    this.maxSlots = maxSlots;
    this.parkingLots = parkingLots;
    parkingSlots = new Car[maxSlots][parkingLots];
  }

  public void park(Car car) {
    for(int parkingLotsCtr = 0; parkingLotsCtr < parkingLots ; parkingLotsCtr++){
      for(int slotsCtr = 0; slotsCtr < maxSlots; slotsCtr++){
        if(parkingSlots[parkingLotsCtr][slotsCtr] == null){
          parkingSlots[parkingLotsCtr][slotsCtr] = car;
          car.setParked(true);
          car.setParkSlot(String.valueOf(parkingLotsCtr) + String.valueOf(slotsCtr));
        }
      }
    }
  }

  public void pick(Car car) {
//    if(parkingSlots.contains(car)){
//      parkingSlots.remove(car);
//      car.setParked(false);
//    }
    for(int parkingLotsCtr = 0; parkingLotsCtr < parkingLots ; parkingLotsCtr++){
      for(int slotsCtr = 0; slotsCtr < maxSlots; slotsCtr++){
        if(parkingSlots[parkingLotsCtr][slotsCtr] == car){
          parkingSlots[parkingLotsCtr][slotsCtr] = car;
          car.setParked(false);
        }
      }
    }
  }
}
