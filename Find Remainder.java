import java.util.*;
import java.lang.*;
import java.io.*;
class remainder{
    
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        for(int t = 0; t<test; t++) {
            int a =  sc.nextInt();
            int b =  sc.nextInt();
            
            int rem = a%b;
            
            System.out.println(rem);
        }
    }
}
