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
   void Selectionsort(int a[])
    {
        int len = a.length;
        for(int i=0;i<len-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<len;j++)
            {
                if(a[j]<a[min_index])
                {
                    min_index=j;
                }
            }
            int temp = a[min_index];
            a[min_index]=a[i];
            a[i]=temp;
        }
    }

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    Main ob = new Main();
	    int n =scan.nextInt();
	    int a[]= new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=scan.nextInt();
	    }
	    ob.Selectionsort(a);
	    System.out.println("sorted array");
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(a[i]+" ");
	    }

	  
	}
}
