package Threads;

class A extends Thread
{
  public void run()
    {
        for(int i=1;i<100;i++)
        {
            System.out.println("The value in Class A"+i);
            try
            {
                 sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<100;i++)
        {
            System.out.println("The value in Class B"+i);
                try
            {
                 sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class FirstThread {

    public static void main(String args[]){

        A obja=new  A();
        B objb=new B();
        objb.start();
        obja.start();

    }
    
}
