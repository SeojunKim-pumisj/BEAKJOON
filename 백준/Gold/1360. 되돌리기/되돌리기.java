import java.io.*;
import java.util.*;

public class Main{

    static class Command{
        String command;
        String val;
        int t;

        Command(String command, String val, int t){
            this.command = command;
            this.val = val;
            this.t = t;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Command[] commands = new Command[n];

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("type")){
                String c = st.nextToken();
                int t = Integer.parseInt(st.nextToken());
                commands[i] = new Command("type", c, t);
            } else{
                int t = Integer.parseInt(st.nextToken());
                int t2 = Integer.parseInt(st.nextToken());
                commands[i] = new Command("undo", String.valueOf(t), t2);
            }
        }

        boolean[] avail = new boolean[n];
        Arrays.fill(avail, true);

        for (int i = n - 1; i >= 0; i--) {
            if (!avail[i]){
                continue;
            }
            if (commands[i].command.equals("undo")) {
                int time = Integer.parseInt(commands[i].val);
                int end = commands[i].t;
                for (int j = i - 1; j >= 0; j--) {
                    if (!avail[j]){
                        continue;
                    }
                    
                    int dur = end - commands[j].t;
                    if (dur <= time) {
                        avail[j] = false;
                    }
                }

                avail[i] = false;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (avail[i] && commands[i].command.equals("type")) {
                sb.append(commands[i].val);
            }
        }
        System.out.println(sb);
    }
}
