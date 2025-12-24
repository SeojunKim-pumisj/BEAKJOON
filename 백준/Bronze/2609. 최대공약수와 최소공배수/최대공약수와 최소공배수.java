import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int result1 = gcd(a, b);
        int result2 = a * b / result1;

        sb.append(result1 + "\n");
        sb.append(result2);

        System.out.println(sb.toString());
    }   

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b, a % b);
        }
    }
}