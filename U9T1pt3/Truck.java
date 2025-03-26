package U9T1pt3;

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

    public void printInfo() {
      super.printInfo();
      System.out.println("Axles " + axles);
      System.out.println("Has Trailer?: " + hasTrailer);
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

    public double calculateTollPrice() {
      if (hasTrailer) {
        return getTollFee() * axles * 2;
      }
      return getTollFee() * axles;
    }
  }