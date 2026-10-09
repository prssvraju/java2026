class AB
{
    AB obj;
    AB(AB obj)
    {
        this.obj= obj;
    }
}
class ThisCon
{
     public static void main(String args[])
    {
        AB obj= new AB();
        obj.m();
    }
}