package IO;
import java.io.*;
public class ByteRead {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Unit-4/IO/abc.txt");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.println((char) b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
