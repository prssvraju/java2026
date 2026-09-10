interface Area
{
    public int area();
}

class AnonymousInterface
{
    public static void main(String args[])
    {
        int length = 10;
        int width = 20;
        Area a = new Area()
        {
            public int area()
            {
                return length * width;
            }
        };
        System.out.println("Area: " + a.area());
    }
}