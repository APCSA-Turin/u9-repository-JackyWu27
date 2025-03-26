package U9T1pt3;

public class Runner {
    public static void main(String[] args) {
        Vehicle a = new Vehicle("SO2981", 7.0, 3);
        Car b = new Car("JL4543", 6.75, 4, true);
        Truck c = new Truck("TB76LX", 15.50, 2, 2, true);
        Taxi d = new Taxi("HB9713", 13.75, 4, true, 2.0);
        a.enter();
        b.enter();
        c.enter();
        d.enter();
                
    }
    
}
