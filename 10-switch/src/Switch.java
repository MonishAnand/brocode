import  java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String day = c.next();
        switch(day){
            case"sunday": System.out.println("its sunday");
            break;
            case"monday": System.out.println("its monday");
            break;
            case"tuesday": System.out.println("its tuesday");
            break;
            case"wednesday": System.out.println("its wednesday");
            break;
            case"thursday": System.out.println("its thursday");
            break;
            case"friday": System.out.println("its friday");
            break;
            case"saturday": System.out.println("its saturday");
            break;
            default:
                System.out.println("thats not a day");

        }
    }
}