import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int start = 1;
        while(start < n){
            start += 6 * count;
            count++;
        }

        System.out.println(count);
    }
}
