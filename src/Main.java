import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("aa.txt");
        if (!file.exists()) {
            System.out.println("!exits");
            file.mkdir();
        }
        File file1 = new File("aa.txt/bb.txt");
        if (!file1.exists()) {
            file1.mkdirs();
            System.out.println("file1 is not exits");
        }
    }
}
