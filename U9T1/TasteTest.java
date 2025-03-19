public class TasteTest {
    public static void main(String[] args) {
        Food a = new Food("Apple", 110);
        a.omnomnom();
        System.out.println(a.getCalories());
        System.out.println(a.getName());

        Pizza p = new Pizza("Pepperoni Pizza", 912, 8);
        p.omnomnom();
        System.out.println(p.getCalories());
        System.out.println(p.getName());
        p.eatSlice();

        Sandwich s = new Sandwich("Turkey Sandwich", 350, "White");
        s.omnomnom();
        System.out.println(s.getCalories());
        System.out.println(s.getName());
        s.breadReplace("Rye");
    }
}
