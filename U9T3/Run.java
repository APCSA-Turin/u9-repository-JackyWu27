package U9T3;

public class Run {
    public static void main(String[] args) {
        Agent amy = new Agent("Amy Higgins", "646-555-5555");
        Dancer morgan = new Dancer ("Morgan", 31, amy, 11);
        System.out.println(morgan.getName());
    }
}
