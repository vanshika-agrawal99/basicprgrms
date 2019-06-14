/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
    void Bubblesort(int a[])
    {
        int len =a.length;
        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp;
                }
            }
        }
    }
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    Main ob = new Main();
	    int n = scan.nextInt();
	    int a[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=scan.nextInt();
	    }
	    ob.Bubblesort(a);
	    System.out.println("sorted array");
	    for(int i=0;i<n;i++)
	    {
	        System.out.println(a[i]+" ");
	        
	    }
		
	}
}
