import com.mypack.Service;

public class MainApp {
    public static void main(String[] args) {
        Service s = new Service(); // Allowed: Service is public
        s.execute();

        // InternalHelper h = new InternalHelper(); // Compile Error: not public in mypack
    }
}