package Threads;
class A extends Thread  
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(" Value In A Class"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(" Value In B Class "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }   
    }
}

public class FistThread {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.start();
        b.start(); 
    }
    
}
