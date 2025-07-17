import java.io.*;
import java.util.*;

public class Main{

    static class ballXY{
        int redX;
        int redY;
        int blueX;
        int blueY;
        int count = 0;

        ballXY(){

        }

        ballXY(int rx, int ry, int bx, int by, int count){
            redX = rx;
            redY = ry;
            blueX = bx;
            blueY = by;
            this.count = count;
        }
    }

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        ballXY ball = new ballXY();

        char[][] map = new char[a][b];

        for(int i = 0 ; i < a; i++){
            String str = br.readLine();
            for(int j = 0 ; j < b; j++){
                map[i][j] = str.charAt(j);
                if(map[i][j] == 'B'){
                    ball.blueX = j;
                    ball.blueY = i;
                }
                else if(map[i][j] == 'R'){
                    ball.redX = j;
                    ball.redY = i;
                }
            }
        }

        boolean[][][][] isVisited = new boolean[a][b][a][b];
        Queue<ballXY> q = new LinkedList<>();
        q.add(ball);

        while(!q.isEmpty()){
            ballXY nextBall = q.poll();
            isVisited[nextBall.redY][nextBall.redX][nextBall.blueY][nextBall.blueX] = true;

            for(int i = 0 ; i < 4; i++){
                int blueCurrentX = nextBall.blueX;
                int blueCurrentY = nextBall.blueY;
                int redCurrentX = nextBall.redX;
                int redCurrentY = nextBall.redY;
                int count = nextBall.count;

                boolean isRedPass = false;
                boolean isbluePass = false;

                if(count >= 10){
                    System.out.println(-1);
                    return;
                }

                while(map[blueCurrentY + dy[i]][blueCurrentX + dx[i]] != '#'){
                    blueCurrentX += dx[i];
                    blueCurrentY += dy[i];
                    
                    if(map[blueCurrentY][blueCurrentX] == 'O'){
                        isbluePass = true;
                        break;
                    }
                }

                while(map[redCurrentY + dy[i]][redCurrentX + dx[i]] != '#'){
                    redCurrentX += dx[i];
                    redCurrentY += dy[i];
                    
                    if(map[redCurrentY][redCurrentX] == 'O'){
                        isRedPass = true;
                        break;
                    }
                }

                if(isbluePass){
                    continue;
                }
                if(isRedPass){
                    System.out.println(count + 1);
                    return;
                }

                if(redCurrentX == blueCurrentX && redCurrentY == blueCurrentY){
                    int redMove = Math.abs(redCurrentX - nextBall.redX) + Math.abs(redCurrentY - nextBall.redY);
                    int blueMove = Math.abs(blueCurrentX - nextBall.blueX) + Math.abs(blueCurrentY - nextBall.blueY);
                    if(redMove < blueMove){
                        blueCurrentX -= dx[i];
                        blueCurrentY -= dy[i];
                    }
                    else{
                        redCurrentX -= dx[i];
                        redCurrentY -= dy[i]; 
                    }
                }

                if(!isVisited[redCurrentY][redCurrentX][blueCurrentY][blueCurrentX]){
                    isVisited[redCurrentY][redCurrentX][blueCurrentY][blueCurrentX] = true;
                    q.add(new ballXY(redCurrentX, redCurrentY, blueCurrentX, blueCurrentY, count+1));
                }
            }
        }
        System.out.println(-1);
    }
}
