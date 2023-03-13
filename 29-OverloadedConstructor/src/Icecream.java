public class Icecream {
    String flavor;
    String topping;
    Icecream(){

    }
    Icecream(String flavor){
        this.flavor=flavor;
    }
    Icecream(String flavor,String topping){
        this.flavor=flavor;
        this.topping=topping;
    }
    public static void main(String[] args) {
        Icecream i1 = new Icecream("vanilla","chocochip");
        Icecream i2 = new Icecream("strawberry");
        Icecream i3 = new Icecream();
        System.out.println(i1.flavor+" with "+i1.topping);
        System.out.println(i2.flavor);
        System.out.println(i3.flavor+i3.topping);
    }
}