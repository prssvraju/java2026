package IO;

import java.io.FileWriter;

public class CharWriter {
    public static void main(String[] args) {
        String message = "Hello World AIDS";
        try {
            FileWriter writer = new FileWriter("Unit-4/IO/CharStream.txt");
            writer.write(message);
            writer.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
