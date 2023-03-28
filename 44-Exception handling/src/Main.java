import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try{
        Scanner c = new Scanner(System.in);
        System.out.println("enter numbers to divide");
        int a =c.nextInt();
        int b =c.nextInt();
        System.out.println(a/b);
    }
       catch (ArithmeticException e){
           System.out.println("you cant divide by 0 you dumb ass");
       }
       catch (InputMismatchException e){
           System.out.println("you cant use another datatype u idiot");
       }
       catch (Exception e){
           System.out.println("some error occurred");
       }
       finally {
           System.out.println("this will always be printed");
       }
    }
}