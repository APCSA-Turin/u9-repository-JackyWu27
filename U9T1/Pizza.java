public class Pizza extends Food {
    private int slices;
    public Pizza(String n, int c, int slices) {
        super(n, c);
        this.slices = slices;
    }

    public int getSlices() {
        return slices;
    }

    public void eatSlice () {
        System.out.println("You have consumed " + getCalories() / (getSlices() * 1.0) + " calories.");
    }
}
