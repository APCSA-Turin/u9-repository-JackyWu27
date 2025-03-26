package U9T1pt3;

public class GamingLaptop extends Computer{
    private boolean monitorIncluded;
    private String graphicsCard;
    public GamingLaptop (int screenSize, int memory, String g) {
        super(screenSize, memory);
        monitorIncluded = true;
        graphicsCard = g;
    }

    public void updateGraphicsCard (String g) {
        graphicsCard = g;
    }

    public boolean isMonitorIncluded() {
        return monitorIncluded;
    }

    public void replaceTowerCasing() {
        System.out.println("Replaced tower case!");
    }
}

