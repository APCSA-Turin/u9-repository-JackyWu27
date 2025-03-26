package U9T1pt3;

public class Taxi extends Car{
    private double fareCollected;
    public Taxi (String licensePlate, double tollFee, int passengers, boolean electric, double f) {
        super(licensePlate, tollFee, passengers, electric);
        fareCollected = f;  // default value
      }

      public double getFareCollected () {
        return fareCollected;
      }

      public void printInfo() {
        super.printInfo();
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

      public boolean chargeAndDropOffRiders (double farePerRider) {
        fareCollected += farePerRider * (getPassengers() - 1);
        return dropOffPassengers(getPassengers() - 1);
      }

      public void enter () {
        System.out.println("You enter the passenger's seat and pay the driver.");
      }
}
