import java.util.Scanner;
public class Main {

    static final int OFFSET = 100;
    public static int[][] rect = new int[201][201];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            printRect(x, y);
        }
        // Please write your code here.
        int cnt = 0;
        for (int i = 0; i < rect.length; i++){
            for (int j = 0; j < rect[0].length; j++){
                if (rect[i][j] == 1) cnt++;
            }
        }
        
        System.out.print(cnt);

    }

    public static void printRect(int x1, int y1){
        int x2 = x1 + 8;
        int y2 = y1 + 8;

        for (int i = x1; i < x2; i++){
            for (int j = y1; j < y2; j++){
                rect[i + OFFSET][j + OFFSET] = 1;
            }
        }
    }
}