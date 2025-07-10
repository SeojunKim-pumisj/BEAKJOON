import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == '('){
                    count++;
                } 
                if(str.charAt(j) == ')'){
                    if(count == 0){
                        count = -1;
                        break;
                    }
                    else{
                        count--;
                    }
                } 
            }
            if(count == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            count = 0;
        }
        
    }
}
