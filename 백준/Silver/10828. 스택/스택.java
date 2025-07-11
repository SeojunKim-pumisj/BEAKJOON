import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s1 = new Stack<>(); 

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")){
                push(s1, Integer.parseInt(st.nextToken()));
            }
            else if(str.equals("pop")){
                pop(s1);
            }
            else if(str.equals("size")){
                size(s1);
            }
            else if(str.equals("empty")){
                empty(s1);
            }
            else{
                top(s1);
            }
        }
    }

    public static void push(Stack<Integer> s, int num){
        s.push(num);
    }

    public static void pop(Stack<Integer> s){
        if(s.isEmpty()){
            System.out.println(-1);
        }
        else{
            System.out.println(s.pop());
        }
    }

    public static void size(Stack<Integer> s){
        System.out.println(s.size());
    }

    public static void empty(Stack<Integer> s){
        if(s.empty()){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        
    }

    public static void top(Stack<Integer> s){
        if(s.empty()){
            System.out.println(-1);
        }
        else{
            System.out.println(s.peek());
        }
       
    }
}
