import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int constructor = 0;

        boolean hasCon = false;
        for(int i = 0 ; i < n; i++){
            constructor = i;
            int a = i;
            while(a / 10 != 0){
                constructor += a % 10;
                a /= 10;
            }
            constructor += a;
            if(constructor == n){
                hasCon = true;
                constructor = i;
                break;
            }
        }
        if(hasCon){
            System.out.println(constructor);
        }
        else{
            System.out.println(0);
        }
    }
}
