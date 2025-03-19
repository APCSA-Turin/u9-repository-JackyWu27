package U9T1Lab2;

public class Dog extends Animal {
    public boolean hasBeenWalked;
    public boolean bone;

    public Dog (int a, String n, boolean v, boolean p, boolean f, boolean b) {
        super(a, n, v, f);
        hasBeenWalked  = p;
        bone = b;
    }

    public boolean Walked () {
        return hasBeenWalked ;
    }
    public void walk() {
        hasBeenWalked  = true;
    }

    public void bark() {
        System.out.println("bork");
    }

    public boolean hasBone () {
        return bone;
    }
}
