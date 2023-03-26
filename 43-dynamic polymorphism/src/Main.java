import java.util.Scanner;

class animal{
    public void speak(){
        System.out.println("animal sounds");
    }
}
class dog extends animal{
    @Override
    public void speak() {
        System.out.println("dog barks");
    }
}
class cat extends animal{
    @Override
    public void speak() {
        System.out.println("cat meows");
    }
}
public class Main {
    public static void main(String[] args) {
        animal a;
        Scanner c = new Scanner(System.in);
        System.out.println("enter 1 for dog"+"\nenter 2 for cat");
        int b = c.nextInt();
        if (b==1){
            a=new dog();
            a.speak();
        } else if (b==2) {
            a=new cat();
            a.speak();
        }
        else {
            a=new animal();
            System.out.println("wrong number");
            a.speak();
        }
    }
}