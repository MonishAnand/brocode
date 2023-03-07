import java.util.Random;
public class Randomnumber {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(6)+1;
        System.out.println(x);
    }
}