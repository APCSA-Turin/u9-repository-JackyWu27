package U9T1pt3;


public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    
    public Vehicle(String licensePlate, double tollFee, int passengers) {
      this.licensePlate = licensePlate;
      this.tollFee = tollFee;
      this.passengers = passengers;
    }
  
    public String getLicensePlate() {
      return licensePlate;
    }
  
    public double getTollFee() {
      return tollFee;
    }
  
    public int getPassengers() {
      return passengers;
    }
  
    public double calculateTollPrice() {
      return tollFee * passengers;
    }

    public void setPassengers(int num) {
      passengers = num;
    }
    public void setToll(double num) {
      tollFee = num;
    }

    public void printInfo () {
      System.out.println("License Plate: " + licensePlate);
      System.out.println("Toll Fee: " + tollFee);
      System.out.println("Passengers: " + passengers);
    }

    public void enter () {
      System.out.println("You enter the driver's seat.");
    }
  }
