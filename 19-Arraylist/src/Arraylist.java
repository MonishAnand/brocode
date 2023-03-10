import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList <String> food = new ArrayList<String>();
        food.add("poori");
        food.add("idly");
        food.add("dosa");
        food.set(0,"pizza");
        food.remove(2);
        food.clear();
        for (int i =0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}