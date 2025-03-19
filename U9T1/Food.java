public class Food {
    private String name;
    private int calories;

    public Food (String n, int c) {
        name = n;
        calories = c;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public void omnomnom() {
        System.out.println("You have consumed an entire " + name);
    }
}
