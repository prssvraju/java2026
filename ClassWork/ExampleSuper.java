class ExampleSuperA
{
    public void hello()
    {
        System.out.println("Hello from ExampleSuperA");
    }
}
class ExampleSuper extends ExampleSuperA{

    public void hello()
    {
        super.hello(); // Call the method from the superclass
        //System.out.println("Hello from ExampleSuper");
    }

    public static void main(String[] args) {
        ExampleSuper exampleSuper = new ExampleSuper();
        exampleSuper.hello();
    }
}