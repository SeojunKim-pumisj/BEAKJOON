import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] argv) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        QUEUE q = new QUEUE();

        StringTokenizer st = null;

        for(int i = 0 ; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")){
                q.push(Integer.parseInt(st.nextToken()));
            }
            else if(str.equals("pop")){
                System.out.println(q.pop());
            }
            else if(str.equals("size")){
                System.out.println(q.size());
            }
            else if(str.equals("empty")){
                if(q.empty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(str.equals("front")){
                System.out.println(q.front());
            }
            else if(str.equals("back")){
                System.out.println(q.back());
            }
        }

    }
}

class NODE{
    NODE next;
    int value;

    public NODE(){
        this.next = null;
        this.value = 0;
    }

    public NODE(int value){
        this.next = null;
        this.value = value;
    }
}

class QUEUE{
    NODE f, r;
    
    public QUEUE(){
        this.f = null;
        this.r = null;
    }

    public void push(int x){
        if(f == null){
            f = new NODE();
            r = f;
        }
        else{
            r.next = new NODE();
            r = r.next;
        }
        r.value = x;
    }

    public int pop(){
        if(empty()){
            return -1;
        }
        
        int value = f.value;
        f = f.next;

        return value;
    }

    public int size(){
        if(empty()){
            return 0;
        }
        
        int count = 0;
        QUEUE q = new QUEUE();
        q.f = f;

        while(q.f != r){
            count++;
            q.f = q.f.next;
        }

        return ++count;
    }

    public boolean empty(){
        if(f == null){
            return true;
        }
        else{
            return false;
        }
    }

    public int front(){
        if(!empty()){
            return f.value;
        }
        else{
            return -1;
        }
    }

    public int back(){
        if(!empty()){
            return r.value;
        }
        else{
            return -1;
        }
    }
}