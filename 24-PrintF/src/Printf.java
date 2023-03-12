public class Printf {
    public static void main(String[] args) {
        boolean b = true;
        char c ='@';
        int i = 20;
        double d = 1000;
        String s = "hi";
        System.out.printf("is %b \n",b);
        System.out.printf("%c gmail.com \n",c);
        System.out.printf("hello %-20s \n",s);
        System.out.printf("%010d \n",i);
        System.out.printf("%,f \n",d);

    }
}