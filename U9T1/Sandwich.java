public class Sandwich extends Food{
    private String breadType; 
    public Sandwich (String n, int c, String bread) {
        super(n, c);
        breadType = bread;
    }

    public String getBreadType () {
        return breadType;
    }

    public void breadReplace (String change) {
        breadType = change;
        System.out.println("You just changed the bread to " + change + " bread.");
    }
}
