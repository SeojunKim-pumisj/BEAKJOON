import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList();

        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        
        int i = 0;

        while(q.size() > 1){
            i++;
            if(i % 2 == 0){
                q.add(q.poll());
            }
            else if(i % 2 == 1){
                q.remove();
            }
        }
        System.out.println(q.peek());
    }
}
