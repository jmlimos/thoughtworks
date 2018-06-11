import org.junit.Assert;
import org.junit.Test;

public class ParkingTest {

  @Test
  public void carA_parks_successfully(){
    Car carA = new Car();
    ParkingLot parking = new ParkingLot();

    parking.park(carA);
    Assert.assertTrue(carA.isParked());
  }

  @Test
  public void carC_parks_but_parking_full(){
    Car carA = new Car();
    Car carB = new Car();
    Car carC = new Car();
    ParkingLot parking = new ParkingLot();
    parking.park(carA);
    parking.park(carB);
    parking.park(carC);
    Assert.assertFalse(carC.isParked());
  }

  @Test
  public void carA_picks_car(){
    Car carA = new Car();
    ParkingLot parking = new ParkingLot();

    parking.park(carA);
    parking.pick(carA);

    Assert.assertFalse(carA.isParked);
  }

  @Test
  public void carB_parks_in_taken_slot(){
    Car carA = new Car();
    Car carB = new Car();
    ParkingLot parking = new ParkingLot();
    parking.park(carA);
    parking.park(carB);
  }

  //TODO: CarA parks in slot 1
  //TODO: CarC parks but parking is full
  //TODO: CarA picks car from slot
  //TODO: CarB parks in taken slot

}
