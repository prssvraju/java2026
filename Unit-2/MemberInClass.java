class Outer
{
    private int length;
    private int width;
    Outer(int l, int w)
    {
        length = l;
        width = w;
    }
    public int area()
    {
        return length * width;
    }
    public void diaplayOuter()
    {
        Inner i = new Inner(5);
        System.out.println("Parameter: " + i.paremeter());
    }
    class Inner
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

class MemberInClass
{
    public static void main(String args[])
    {
        Outer o = new Outer(10, 20);
        o.diaplayOuter();
        System.out.println("Area: " + o.area());
      
    }
}