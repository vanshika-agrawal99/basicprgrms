import java.util.*;
import java.io.*;
public class BinarySearch{
    public static int BinSearch(int a[],int n,int key)
    {
        int low =1;
        int high = n;
        int mid;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(key==a[mid])
            {
                return mid;
            }
            else if(key<a[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return 0;
    }
    
    
 public static void main (String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int a[] = new int[n];
     for(int i=0;i<n;i++)
     {
         a[i]= scan.nextInt();
         
     }
     int key = scan.nextInt();
     int result = BinSearch(a,n,key);
     if(result==0)
     {
         System.out.println("element not found");
     }
     else{
         System.out.println("element found");
     }
}
}
