package U9T1Lab2;

public class Animal {
    private int age;
    private String name;
    private boolean vaccinated = false;
    private boolean fed;

    public Animal (int a, String n, boolean v, boolean f) {
        age = a;
        name = n;
        vaccinated = v;
        fed = f;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public boolean getVaccinate() {
        return vaccinated;
    }

    public boolean hasBeenFed() {
        return fed;
    }

    public void feed() {
        System.out.println(name + " has been feed.");
        fed = true;
    }

    public void adopt() {
        System.out.println(name + " has been adopted.");
    }

    public void vaccinate() {
        vaccinated = true;
    }
}
