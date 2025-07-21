import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String str = br.readLine();
        long sum = 0;
        long r = 1;
        for(int i = 0 ; i < str.length(); i++){
            sum += (long)(((long)str.charAt(i) - 96) * r);
            r = (r * 31) % 1234567891;
        }

        System.out.println(sum % 1234567891);
    }
}
