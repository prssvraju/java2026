 class Support
{
    public void display()
    {
        System.out.println("This is a support class.");
    }
}
class SampleFinla extends Support{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Support support = new Support();
        support.display();
    }
}