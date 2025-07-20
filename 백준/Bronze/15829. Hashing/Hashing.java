import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String str = br.readLine();
        int sum = 0;
        for(int i = 0 ; i < str.length(); i++){
            sum += (int)(((int)str.charAt(i) - 96) * Math.pow(31, i));
        }

        System.out.println(sum);
    }
}
