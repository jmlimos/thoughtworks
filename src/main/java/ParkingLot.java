import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

  private int parkingLotMax = 2;
  private List<Car> parkingSlots = new ArrayList<>();

  public void park(Car car) {
    if(parkingSlots.size() < parkingLotMax){
      parkingSlots.add(car);
      car.setParked(true);
    }
  }

  public void pick(Car car) {
    if(parkingSlots.contains(car)){
      parkingSlots.remove(car);
      car.setParked(false);
    }
  }
}
