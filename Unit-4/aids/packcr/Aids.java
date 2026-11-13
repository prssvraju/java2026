package packcr;
public class Aids
{
    public void showMessage()
    {
        System.out.println("Hello");
        It obj = new It();
        obj.showMessage();

    }
}
class It
{
    public void showMessage()
    {
        System.out.println("Forom It Hello");
    }
}