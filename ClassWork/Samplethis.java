class A
{
    int x;
    A(int x)
    {
        this.x=x;
    }
}
class Samplethis
{
    public static void main(String args[])
    {
        A obj= new A(10);
        System.out.println("The value of x is"+obj.x);
    }
}