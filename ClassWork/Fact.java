class Cal
{
    public int fact( int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}
class Fact
{
    public static void  main(String args[])
    {
        Cal obj = new Cal();
        System.out.println( "The fact is "+obj.fact(5));
    }
}