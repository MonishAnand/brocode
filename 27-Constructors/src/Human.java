public class Human{

        int age;
        String name;
        Human(int age,String name){
            this.name=name;
            this.age=age;

    }

    public static void main(String[] args) {
        Human h1 = new Human(19,"monish");
        Human h2 = new Human(18,"luffy");
        System.out.print(h1.name);
        System.out.println(" "+h1.age);
        System.out.print(h2.name);
        System.out.println(" "+h2.age);
    }
    }

