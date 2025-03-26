package U9T1pt3;

public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    public void printInfo() {
      super.printInfo();
      System.out.println("Is Electric?: " + electric);
      System.out.println("Has Discount?: " + discountApplied);
    }

    public boolean dropOffPassengers(int num) {
      if (num < getPassengers()) {
        setPassengers(getPassengers() - num);
        return true;
      }
      return false;
    }

    public void applyDiscount() {
      if (isElectric() && !discountApplied) {
        setToll(getTollFee() / 2);
        discountApplied = true;
      }
    }

    public boolean getDiscountApplied() {
      return discountApplied;
    }

    public void setDiscountApplied(boolean b) {
      discountApplied = b;
    }

    public double calculateTollPrice() {
      if (getPassengers() > 3) {
        return getTollFee() * 4;
      }
      return getTollFee() * getPassengers();
    }
  }