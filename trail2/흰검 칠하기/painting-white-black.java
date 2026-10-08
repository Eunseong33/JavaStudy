import java.util.Scanner;

public class Main {
    static final int OFFSET = 100_000;
    public static int[][] line = new int[200_001][3];
        
    public static int loc = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            loc(x, dir);
        }

        int white = 0;
        int black = 0;
        int grey = 0;
        // Please write your code here.
        for (int i = 0; i < line.length; i++){
            if (line[i][2] == 3){
                grey++;
            } else if (line[i][2] == 1){
                white++;
            } else if(line [i][2] == 2){
                black++;
            }
        }

        System.out.print(white + " " + black + " " + grey);

    }


    public static void loc(int x, char dir){
            for(int i = 0; i < x; i++){
                int pos = loc + OFFSET;
                if (line[pos][2] != 3){
        
                    if (dir == 'L'){
            
                        line[pos][0] = Math.min(line[pos][0] + 1, 2);
                        line[pos][2] = 1;
                    } else {
                        line[pos][1] = Math.min(line[pos][1] + 1, 2);
                        line[pos][2] = 2;
                    }
                    if (line[pos][0] >= 2 && line[pos][1] >= 2){
                        line[pos][2] = 3;
                    }
                }

                if (i != x -1){
                    if (dir == 'L'){
                        loc--;
                    } else {
                        loc++;
                    }
                }
            }
    }
}
