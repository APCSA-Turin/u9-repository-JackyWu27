public class Truck extends Vehicle{
    private int oil;
    public Truck (String name, int wheels, int oil) {
        super(name, wheels);
        this.oil = oil;
    }
    public int getOil () {
        return oil;
    }
    public void Explode () {
        System.out.println("Explosion.sfx");
    }
}
