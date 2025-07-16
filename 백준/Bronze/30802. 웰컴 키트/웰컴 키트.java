import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int countT = 0;
        int[] shirt = new int[6];
        int penSet = 0;
        int shirtSet = 0; 
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 6; i++){
            shirt[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        shirtSet = Integer.parseInt(st.nextToken());
        penSet = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < 6; i++){
            if(shirt[i] % shirtSet == 0){
                countT += shirt[i] / shirtSet;
            }
            else{
                countT += shirt[i] / shirtSet + 1;
            }
        }
        System.out.println(countT);
        System.out.println(n / penSet + " " + n % penSet);
    }
}
