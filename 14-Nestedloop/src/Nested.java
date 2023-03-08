import java.util.*;
public class Nested {
    public static void main(String[] args) {
        int rows;
        int cols;
        String symbol ="";
        Scanner c = new Scanner(System.in);
        System.out.print("enter no of rows");
        rows=c.nextInt();
        System.out.print("enter no of columns");
        cols=c.nextInt();
        System.out.print("enter symbol");
        symbol=c.next();
        for (int i =1;i<=rows;i++){
            System.out.println();
            for (int j=1;j<=cols;j++){
                System.out.print(symbol);
            }
        }
    }
}