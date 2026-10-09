final class Rta
{
    public  void setSpeed(int x)
    {
       int speed=x;
        System.out.println("Speed  Aproved By RTA "+speed);

    }

}
class BvrmRTA extends Rta
{
    public  void setSpeed(int x)
    {
       int speed=x;
       System.out.println("Speed in Bhimavaram "+speed);
    }


}


class FinalExample
{

    public static void main(String args[])
    {
        Rta o = new Rta();
        o.setSpeed(40);

      
  
    

    }
}