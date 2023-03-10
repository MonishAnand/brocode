import java.util.ArrayList;

public class Arraylist2d {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> grocery = new ArrayList();
        ArrayList<String>baker = new ArrayList<String>();
        baker.add("pasta");
        baker.add("bread");
        ArrayList<String>produce = new ArrayList<String>();
        produce.add("carrot");
        produce.add("pepper");
        ArrayList<String>drinks= new ArrayList<String>();
        drinks.add("soda");
        drinks.add("tea");
        grocery.add(baker);
        grocery.add(produce);
        grocery.add(drinks);
        System.out.println(grocery);
    }
}