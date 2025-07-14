import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] argv) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int lowerBound = 0;
        int upperBound = 0;

        for(int i = 0; i < m; i++){
            int front = 0, back = n;
            int num = Integer.parseInt(st.nextToken());
            while(front < back){
                int mid = (front + back) / 2;
                if(num >= arr[mid]){
                    front = mid + 1;
                }
                else{
                    back = mid;
                }
            }
            upperBound = front;

            front = 0;
            back = n;
            while(front < back){
                int mid = (front + back) / 2;
                if(num <= arr[mid]){
                    back = mid;
                }
                else{
                    front = mid + 1;
                }
            }
            lowerBound = front;
            sb.append(upperBound - lowerBound + " ");
        }
        

        System.out.println(sb);
    }
}