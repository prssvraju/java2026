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
public class callbyref {
    public static void main(String[] args) {
        Ref r = new Ref(10);
        System.out.println("Before method call: " + r.a);
        r.modifyValue(r);
        System.out.println("After method call: " + r.a);
    }
}
