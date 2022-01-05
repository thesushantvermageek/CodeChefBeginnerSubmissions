/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();                                   //Array Size
		List<Integer> arr = new ArrayList<Integer>(n);          //Array list declaration
		for(int i=0; i<n; i++)                               //loop to take array data
		    arr.add(sc.nextInt());
		    
		Collections.sort(arr);                                  //Sorting array using collection inbuilt function
		
		for(int i=0; i<n; i++)
		    System.out.println(arr.get(i));
		
	}
}
