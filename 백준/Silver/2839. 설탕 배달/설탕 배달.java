import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0, n = 0;
        n = sc.nextInt();
        
        while(n > 0){
            if(n % 5 == 0){
                System.out.println(n / 5);
                break;
            }
            else{
                n -= 3;
                result++;
                if(n % 5 == 0){
                    result += n / 5;
                    System.out.println(result);
                    break;
                }
                if(n <= 2){
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}
