public class Food {
    String name;
    Food(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        Food[] r = new Food[3];
        Food s1 = new Food("idly");
        Food s2 = new Food("dosa");
        Food s3 = new Food("vada");
        r[0]=s1;
        r[1]=s2;
        r[2]=s3;
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);

    }
}