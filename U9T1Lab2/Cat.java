package U9T1Lab2;

public class Cat extends Animal {
    public boolean hasPlayedWith;
    public boolean catnip;

    public Cat (int a, String n, boolean v, boolean p, boolean f, boolean c) {
        super(a, n, v, f);
        hasPlayedWith = p;
        catnip = c;
    }

    public boolean PlayedWith() {
        return hasPlayedWith;
    }
    public void play() {
        hasPlayedWith = true;
    }

    public void meow() {
        System.out.println("Meow");
    }

    public boolean hasCatnip() {
        return catnip;
    }
}
