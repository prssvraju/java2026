package IO;
import java.io.IOException;
public class StdIODemo {
    public static void main(String[] args)throws IOException {
        System.out.println("Hello World");
        int ch= System.in.read();
        System.out.println("You entered: " + ch);
        System.err.println("This is an error message");
    }
    
}
