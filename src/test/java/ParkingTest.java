import org.junit.Assert;
import org.junit.Test;

public class ParkingTest {

  final static int MAX_PARKING_LOTS = 2;
  final static int MAX_SLOTS = 2;

  @Test
  public void carA_parks_successfully(){
    Car carA = new Car();
    ParkingLot parking = new ParkingLot(MAX_SLOTS, MAX_PARKING_LOTS);

    parking.park(carA);
    Assert.assertTrue(carA.isParked());
  }

  @Test
  public void carC_parks_but_parking_full(){
    Car carA = new Car();
    Car carB = new Car();
    Car carC = new Car();
    ParkingLot parking = new ParkingLot(MAX_SLOTS, MAX_PARKING_LOTS);
    parking.park(carA);
    parking.park(carB);
    parking.park(carC);
    Assert.assertFalse(carC.isParked());
  }

  @Test
  public void carA_picks_car(){
    Car carA = new Car();
    ParkingLot parking = new ParkingLot(MAX_SLOTS, MAX_PARKING_LOTS);

    parking.park(carA);
    parking.pick(carA);

    Assert.assertFalse(carA.isParked);
  }

  @Test
  public void carB_parks_in_taken_slot(){
    Car carA = new Car();
    Car carB = new Car();

    ParkingLot parking = new ParkingLot(MAX_SLOTS, MAX_PARKING_LOTS);
    parking.park(carA);
    parking.park(carB);
  }

  @Test
  public void carD_parks_in_first_slot_available(){
    ParkingLot parking = new ParkingLot(MAX_SLOTS, MAX_PARKING_LOTS);
    Car carA = new Car();
    Car carB = new Car();
    Car carC = new Car();
    Car carD = new Car();
    parking.park(carA);
    parking.park(carB);
    parking.park(carC);
    parking.pick(carA);
    parking.park(carD);

    Assert.assertEquals(carD.getParkSlot(), "00");
  }

  //TODO: CarA parks in slot 1
  //TODO: CarC parks but parking is full
  //TODO: CarA picks car from slot
  //TODO: CarB parks in taken slot
  //TODO: CarD parks in first vacant slot
}
