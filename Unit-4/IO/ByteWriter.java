package IO;
import java.io.*;

public class ByteWriter {
    public static void main(String[] args) {
        String message="Hello World";
        try {
            FileOutputStream fout=new FileOutputStream("Unit-4/IO/abc.txt");
            fout.write(message.getBytes());
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}
