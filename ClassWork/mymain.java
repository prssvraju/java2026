@FunctionalInterface 
interface test2
{
    public void mul();
}
//this is a class which explains about interface after 1.8
interface test1
{
    public void add();
   public  default  void sub(){
        System.out.println("INside sub");
    }
   
}
class test1imp implements test1{
   
    public void add()
    {
        System.out.println("Inside Add");
    }
   
}
class mymain  
{
    
    public static void main(String args[])
    {
        //  test2 obj = ()->{
        //      System.out.println("Inside mul");
        //  };


        test1 myobj = new test1() {
            
             public void add()
             {
                 System.out.println("Inside Add");
            }
        };

        test2 mylam=()->{
            System.out.println("Inside Mul");
        };

        mylam.mul();
        test2 mylam2 = new test2() {
            @Override
            public void mul() {
                System.out.print("Data");
            }
        };
        


        mylam.mul();

        test2 obj = new test2(){
            public void mul()
            {
                System.out.println("Inside mul");
            }
     
        };
        obj.mul();
        obj.div();



    }
}