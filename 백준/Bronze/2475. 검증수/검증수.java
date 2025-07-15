import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] argv) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int verifyNum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            verifyNum += Math.pow(num, 2); 
        }

        System.out.println(verifyNum % 10);
    }
}