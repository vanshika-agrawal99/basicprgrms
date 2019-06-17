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
    void sort(int a[]){
        int len = a.length;
        for(int i=1;i<len;i++)
        {
        int key = a[i];
        int j= i-1;
        while(j>=0&&a[j]>key){
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=key;
    }
    }
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        Main ob = new Main();
	        int n = scan.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=scan.nextInt();
	        }
	        ob.sort(a);
	        System.out.println("sorted array:");
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(a[i]+" ");
	        }
	      
	}
}
