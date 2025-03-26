package U9T5;

import java.util.ArrayList;

public class Vet {
    private String vetName;
    private ArrayList<Animal> arr;

    public Vet (String name) {
        vetName = name;
        arr = new ArrayList<Animal>();
    }

    public boolean addClient (Animal a) {
        if (arr.contains(a)) {
            System.out.println(a.getName() + " is already a client of " + vetName);
            return false;
        }
        System.out.println("Welcome to " + vetName + " office, " + a.getName());
        arr.add(a);
        return true; 
    }

    public void printClientList () {
        for (Animal c : arr) {
            System.out.println(c.getName() + ": " + c.getClass());
        }
    }
}
