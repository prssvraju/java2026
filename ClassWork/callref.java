class Ref {
    int a;
    Ref(int i) {
        a = i;
    }
    public  void modifyValue(Ref r) {
        r.a = r.a * 2;
        System.out.println("Inside method: " + r.a);
    }
}
public class callref {
    public static void main(String[] args) {
        Ref n = new Ref(10);
        System.out.println("Before method call: " + n.a);
        n.modifyValue(n);
        System.out.println("After method call: " + n.a);
    }
}