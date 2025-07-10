import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        
        int n = Integer.parseInt(st.nextToken());
        int iter = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        Arrays.fill(arr, 0);
        for(int i = 0 ; i < iter; i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());
            for(int k = first; k <= end; k++){
                arr[k] = number;
            }
        }

        for(int i = 1; i < n+1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
