class LocalClass
{
    public static void main(String args[])
    {
        int length = 10;
        int width = 20;
        class Area
        {
            public int area()
            {
                return length * width;
            }
        }
        Area a = new Area();
        System.out.println("Area: " + a.area());
    }
}