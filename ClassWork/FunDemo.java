interface IFunDemo
{
    void DisplayMessage(int x);
}

class FunDemo 
{
    public static void main(String[] args) 
    {
        IFunDemo demo = (int x) -> System.out.println("Hello, this is a fun demo using lambda expressions! The value is: " + x);
        demo.DisplayMessage(5);
    }

}