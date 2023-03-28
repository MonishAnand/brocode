import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File("file.txt");
        //f.getAbsolutePath();
        f.getPath();
        /*if (f.exists()){
            System.out.println("file exists");
        }
        else {
            System.out.println("file doesn't exist");
        }*/
    }
}