package U9T2;

public class Taxi extends Car{
    private double fareCollected;
    public Taxi (String licensePlate, double tollFee, int passengers, boolean electric, double f) {
        super(licensePlate, tollFee, passengers, electric);
        fareCollected = f;  // default value
      }

      public double getFareCollected () {
        return fareCollected;
      }

      public void printTaxi() {
        printCar();
        System.out.println("Fare Collected: " + fareCollected);
      }

      public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += farePerRider * numRiders;
        if (!getDiscountApplied() && getPassengers() > 3) {
          setToll(getTollFee() / 2);
          setDiscountApplied(true);
        }

      }
}
