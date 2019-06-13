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
    	public static int searchnum(int a[],int x)
	{
	    int n = a.length;
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]==x)
	        
	            return i;
	        
	    }
	   return -1;	    
	    
	}
	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int n = scan.nextInt();
	   int a[] = new int[n];
	   for(int i=0;i<n;i++)
	   {
	       a[i] = scan.nextInt();
	   }
	   int x = scan.nextInt();
	   int result = searchnum(a,x);
	   if(result==-1)
	   {
	       System.out.println("element not found");
	   }
	   else{
	       System.out.println("element found at"+result);
	   }
	   
	}
