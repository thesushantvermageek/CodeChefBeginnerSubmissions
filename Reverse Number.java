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
		int test = sc.nextInt();
		
		for(int t=0; t<test; t++) {
		    int num = sc.nextInt();
		    
		    int res = rev(num);
		    
		    System.out.println(res);
		}
	}
	
	static int rev(int n) {
	    int r = 0;
	    
	    while(n!=0) {
	        r = (r*10) + (n%10);
	        n=n/10;
	    }
	    
	    return r;
	}
}
