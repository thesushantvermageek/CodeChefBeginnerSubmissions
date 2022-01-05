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
		    long n = sc.nextLong();
		    int count = 0;
		    while(n!=0) {
		        if(n%10 == 4)
		            count++;
                n = n/10;
		    }
		    System.out.println(count);
		}
	}
}
