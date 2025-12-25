import java.io.*;
import java.util.*;


public class Main{   
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        count = (v - a) / (a - b);
        if((v - a) % (a - b) != 0) count++;

        System.out.println(count + 1);
    }
}