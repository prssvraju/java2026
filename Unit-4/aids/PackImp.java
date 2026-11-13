import packcr.*;
class PackImp
{
    public static void main(String args[])
    {
        Aids obj = new Aids();
        obj.showMessage();
        MyInf objinf = new MyInf(){
            public void showMessage(){
                System.out.println("Hello from MyInf");
            }   
        };
        objinf.showMessage();
    }

}