import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int num = Integer.parseInt(str.nextToken());
        int[] m = new int[n];
        int approximate = 0;

        str = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n; i++){
            m[i] = Integer.parseInt(str.nextToken());
        }

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1 ; j < n - 1; j++){
                for(int k  = j + 1; k < n; k++){
                    if(m[i] + m[j] + m[k] > approximate && m[i] + m[j] + m[k] <= num){
                        approximate = m[i] + m[j] + m[k];
                    }
                }
            }
        }
        System.out.println(approximate);
    }
}
