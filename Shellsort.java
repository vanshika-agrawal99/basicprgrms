/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
    int sort(int arr[])
    {
        int len = arr.length;
        
        for(int gap=len/2;gap>0;gap/=2)
        {
            for(int i=gap;i<len;i+=1)
            {
                int temp=arr[i];
                int j;
                for(j=i;j>=gap&&arr[j-gap]>temp;j-=gap)
                {
                    arr[j]=arr[j-gap];
                }
                arr[j]=temp;
            }
        }
        return 0;
    }
	public static void main(String[] args) {
	    Main ob = new Main();
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	      arr[i]=scan.nextInt();  
	    }
	    System.out.println("sorted array:");
	    ob.sort(arr);
	    for(int i=0;i<n;i++)
	    {
	        System.out.println(arr[i]+" ");
	    }
	    
		
	}
}
