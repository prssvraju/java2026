class Farm
{
    int length;
    int width;
    public void setDimention(int x,int y)
    {
        length=x;
        width=y;
    }
    Farm()
    {
        System.out.println("I am constructor");
    }
    Farm(int x)
    {
        length=x;
        width=x;
    }
    Farm(int x,int y)
    {
        length=x;
        width=y;
    }
    public int getArea()
    {
        return length*width;
    }
   

}

class MainCode
{
    public static void main(String args[])
    {
       Farm f1= new Farm();
       //f1.setDimention(20,30);
       System.out.println("Area of F1 : "+f1.getArea());
    
       Farm f2= new Farm(10);
       System.out.println("Area of F2 : "+f2.getArea());

       Farm f3= new Farm(10,20);
       System.out.println("Area of F3 : "+f3.getArea());


    }

}

      