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
		
		int test = sc.nextInt();
		for(int t=0; t<test; t++) {
		    int num = sc.nextInt();
		    
		    System.out.println(fact(num));
		}
	}
	
	static BigInteger fact(int n) {
	    BigInteger f = BigInteger.ONE;
	    
	    for(int i=2; i<=n; i++) {
	        f = f.multiply(BigInteger.valueOf(i));
	    }
	    
	    return f;
	       
	}
}
