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
    
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        LinkedList<String> object = new LinkedList<String>();
	        object.add("1");
	        object.add("2");
	        object.add("3");
	        object.addFirst("4");
	        object.addLast("6");
	        object.add("5");
	        object.add("7");
	        //find the element in the linked list
	        boolean result = object.contains("6");
	        if(result){
	            System.out.println("Element 6 found");
	        }
	        else{
	            System.out.println("Element 6 not found");
	        }
	        
	        object.remove();
	        object.remove();
	        
	        
	        //size of linked list
	        int size = object.size();
	        System.out.println("size of linked list:"+size);
	        
	        //get and set element in linked list
	        Object element=object.get(4);
	        System.out.println("element is "+element);
	        object.set(1,"8");
	        object.set(2,"10");
	        System.out.println("Linked list after change: "+object);
	        
	        
	}
}
