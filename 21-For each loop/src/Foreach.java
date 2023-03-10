import  java.util.*;
public class Foreach {
    public static void main(String[] args) {
        ArrayList<String> animals =new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");
        for (String i : animals){
            System.out.println(i);
        }
    }
}