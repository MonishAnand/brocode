import  java.util.*;
public class Method {
    public static int add(int x,int y){
        int z = x+y;
        return z;
    }

    public static void main(String[] args) {
        int a = add(10,20);
        int b = add(30,40);
        System.out.println(a);
        System.out.println(b);
    }
}