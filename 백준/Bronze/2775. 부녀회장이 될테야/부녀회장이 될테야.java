import java.io.*;
import java.util.*;


public class Main{   
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] table = new int[15][15];

        for(int i = 0 ; i < 15 ; i++){
            table[0][i] = i + 1;
        }
        for(int i = 0 ; i < 15 ; i++){
            table[i][0] = 1;
        }

        for(int i = 1 ; i < 15 ; i++){
            for(int j = 1; j < 15; j++){
                table[i][j] = table[i - 1][j] + table[i][j - 1];
            }
        }

        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < n ; i++){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine()) - 1;

            sb.append(table[a][b] + "\n");
        }

        System.out.println(sb.toString());
    }
}