public class Overloaded {
    public static void main(String[] args) {
        int x = add(10,20,30,40);
        System.out.println(x);
    }
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
}