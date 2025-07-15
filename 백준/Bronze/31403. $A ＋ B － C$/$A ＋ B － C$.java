import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] argv) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int justNum = 0;
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        justNum = arr[0] + arr[1] - arr[2];
        System.out.println(justNum);
        sb.append(arr[0] + "" + arr[1]);
        System.out.println(Integer.parseInt(sb.toString()) - arr[2]);
    }
}