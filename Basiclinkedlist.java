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
	public static void main(String[] args) {
		LinkedList<String> object = new LinkedList<String>();
		Scanner scan = new Scanner(System.in);
		// inserting elements in linked list
		object.add("A");
		object.add("B");
		object.addFirst("C");
		object.add("D");
		object.addLast("F");
		object.add("E");
		System.out.println("LinkedList:"+object);
		//deleting elements in linked list
		object.remove("F");
		object.removeFirst();
		object.remove("D");
		System.out.println("After Deleting LinkedList:"+object);
	
	}
}
