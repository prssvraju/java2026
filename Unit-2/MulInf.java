interface A
{
    int x=10;
    void MethodA();
     static void methodc()
    {
       int z=x+10;
        System.out.println("Default method implementation");
    }
   

}
interface B
{
    void MethodB();
  
}

class MulInf implements A,B
{
    int y;
    public void MethodA()
    {
        System.out.println("Method A implementation");
    }
    public void MethodB()
    {
        System.out.println("Method B implementation");
    }
    public static void main(String args[])
    {
        MulInf obj = new MulInf();
        obj.MethodA();
        obj.MethodB();
        obj.methodc();
    }
}