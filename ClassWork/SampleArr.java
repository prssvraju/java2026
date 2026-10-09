  import java.util.*;
  public class SampleArr 
  {  
    public static void main(String[] args) 
    {  
        int [] intArray = new int[]{5,7,2,1,8,6,8,9};
        char [] charArray = new char [] {'u','y', 't','a', 'm','f'}; 
        float [] fArray = new float[] {3.4f,2.5f,8.5f,6.4f,9.5f,3.2f};
        System.out.println("Elements of intArray: ");
        for(int x: intArray)
        {
            System.out.print(x);
        }
        Arrays.sort(intArray);
        System.out.println("\nElements of intArray after sorting: ");
        for(int x: intArray)
        {
            System.out.print(x);
        }
    }  
}
