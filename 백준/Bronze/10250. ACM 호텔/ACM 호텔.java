import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] argv) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            
            int num;
            if(m % h == 0){
                num = h * 100 + (m / h);
            }
            else{
                num = m % h * 100 + (m / h + 1);
            }
            System.out.println(num);
        }
    }
}