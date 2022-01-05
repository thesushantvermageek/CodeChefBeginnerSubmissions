/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();                                       //input for test case
		
		while(t-->0){
		    int num = sc.nextInt();                                 //input for number
		    
		    System.out.println((int)Math.sqrt(num));                //square root of integer formatted in integer
		}
		
	}
}
