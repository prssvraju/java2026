abstract class Shape
{
    public abstract int area();
}

class AnonymousAbs
{
    public static void main(String args[])
    {
        Shape s = new Shape()
        {
            public int area()
            {
                return 10 * 20;
            }
        };
        System.out.println("Area: " + s.area());
    }
}