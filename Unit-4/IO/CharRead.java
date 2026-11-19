package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharRead {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Unit-4/IO/abc.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line=br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
