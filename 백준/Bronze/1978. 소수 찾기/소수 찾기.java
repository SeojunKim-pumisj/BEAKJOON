import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0 ; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(num == 1){
                continue;
            }
            if(num == 2 || num == 3){
                count++;
            }
            else{
                for(int j = 2 ; j < Math.sqrt(num); j++){
                    if(num % j == 0){
                        break;
                    }
                    if(j == Math.floor(Math.sqrt(num))){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
