
class PackImp
{
    public static void main(String args[])
    {
        packcr.Aids obj = new packcr.Aids();
        obj.showMessage();

        MyInf objinf = new MyInf()
        {
            public void showMessage()
            {
                System.out.println("Inside Interface");
            }
        }

        objinf.showMessage();
    }
}