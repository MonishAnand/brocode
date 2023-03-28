import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("poem.txt");
            w.write("roses are red\nviolets are blue\ni am new");
            w.append("\n(by monish)");
            w.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}