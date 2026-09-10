class Outer
{
    static private int length;
    static private int width;
    Outer(int l, int w)
    {
        length = l;
        width = w;
    }
    public int area()
    {
        return length * width;
    }
    static class Inner
    {
        private int rate;
        Inner(int r)
        {
            rate = r;
        }
        public int paremeter()
        {
            return 2 * (length + width) * rate;
        }
    }
}

class StaticNestClass
{
    public static void main(String args[])
    {
        Outer o = new Outer(10, 20);
        System.out.println("Area: " + o.area());
        Outer.Inner i = new Outer.Inner(5);
        System.out.println("Parameter: " + i.paremeter());
    }
}