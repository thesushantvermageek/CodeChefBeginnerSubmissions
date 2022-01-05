import java.util.*;
import java.io.*;

class sum {

    public static void main(String[] args) throws Exception {
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int test = 0; test < T; test++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int sum = a+b;
            System.out.println(sum);
        }
    }
}
