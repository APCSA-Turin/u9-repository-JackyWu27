package U9T2;

public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    public void printTruck() {
      System.out.print("The license plate is " + getLicensePlate() + " and the toll fee is " + getTollFee() + ". There are " + getPassengers() + " passengers and the truck has " + getAxles() + " axles.");
      System.out.print(" It does");
      if (!hasTrailer()) {
        System.out.print(" not");
      }
      System.out.println(" have a trailer.");
    }

    public boolean validateLicensePlate() {
      if (hasTrailer) {
        if (axles > 4) {
          if (getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX")) {
            return true;
          }
          return false;
        } else {
          if (getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX")) {
            return true;
          }
          return false;
        }
      }
      return true;
    }
  }