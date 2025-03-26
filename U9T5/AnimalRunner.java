package U9T5;

import java.util.ArrayList;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal thing = new Animal("Thing");
        Cow marge = new Cow("Marge");
        Dog penny = new Dog("Penny");
        Puppy spot = new Puppy("Spot");
        ArrayList<Animal> a = new ArrayList<>();
        a.add(thing);
        a.add(marge);
        a.add(penny);
        a.add(spot);
        Vet v = new Vet("Soup");
        for (Animal c : a) {
            System.out.println(v.addClient(c));
        }
        v.printClientList();
    }
}
