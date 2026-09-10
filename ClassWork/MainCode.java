class Farm
{
    private int length;
    int width;
    public void setLength(int x)
    {
        length=x;
    }
    public int getLength()
    {
        return length;
    }
    private int area()
    {
        return length*width;
    }
    public int getArea()
    {
        return area();
    }

}

class MainCode
{
    public static void main(String args[])
    {
       Farm f1= new Farm();
       f1.width=10;
       f1.setLength(20);
       System.out.println("Area of F1 is "+ f1.getArea());
       System.out.println("Length of from "+f1.getLength());
       System.out.println("Length of from "+f1.width);
    }
}