class MyA
{
    public void getSumOfNumbers()
    {
        System.out.println("Inside A");
    }
}
class MyB extends MyA
{
    
    @Override
    public void getSumOfNumbers()
    {
        System.out.println("Inside B");
    }
}
class MyMainCode
{
    public static void main(String args[])
    {
        MyB obj = new MyB();
        obj.getSumOfNumbers();
    }
}
