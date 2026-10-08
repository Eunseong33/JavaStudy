import java.util.Scanner;
public class Main {

    static final int OFFSET = 100_000;
    public static int[] line = new int[200_001];
    public static int loc = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            loc(x, d);
        }
        // Please write your code here.
        int wh = 0;
        int blk = 0;
        for (int i = 0; i < line.length; i++){
            if (line[i] == 1){
                wh++;
            } else if (line[i] == 2){
                blk++;
            }
        }
        System.out.println(wh + " " + blk);
    }

    public static void loc(int x, char d){
        int color = (d == 'L') ? 1 : 2;
        int move = (d == 'L') ? -1 : 1;

        for (int i = 0; i < x; i++){
            int pos = loc + OFFSET;

            line[pos] = color;

            if (i != x -1){
                loc += move;
            }
        }
    }
}