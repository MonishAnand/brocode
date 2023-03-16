class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String basic(){
        return this.name+"\n"+this.age;
    }
}
class hero extends person{
    String power;
    hero(String name,int age,String power){
      super(name,age);
      this.power=power;
    }
    public String next(){
        return super.basic()+"\n"+this.power;
    }
}
public class Main {
    public static void main(String[] args) {
        hero h = new hero("batman",45,"$$$");
        System.out.println(h.next());
    }
}