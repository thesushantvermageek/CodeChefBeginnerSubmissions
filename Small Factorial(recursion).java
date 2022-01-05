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
		
		int t = sc.nextInt();
		
		while(t-->0) {
		    int num = sc.nextInt();
		    
		    System.out.println(fact(num));
		}
	}
	
	static long fact(int n) {
	    if(n==0 || n==1)
	        return 1;
        else if(n==2)
            return 2;
        else
            return n*fact(n-1);
	}
}
