class AEx
{
    public void AddingNumbers(int a,int b)
    {
        System.out.println("INside AEx class method");
    }

}

class BEx extends AEx
{
    //Overriding the method of AEx class sdflk
    
    @Override 
    public void AddingNumbers(int a,int b)
    {
        
        System.out.println("INside BEx class method");
    }
}
class anoex
{
    public static void main(String args[])
    {
        BEx obj = new BEx();
        obj.AddingNumbers(10,20);
    }
}