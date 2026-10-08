import java.util.Scanner;
public class Main {

    static final int OFFSET = 1000;
    static int[][] rect = new int[2000][2000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();
        // Please write your code here.
        paintRect(ax1, ay1, ax2, ay2, 1);
        paintRect(bx1, by1, bx2, by2, 1);
        paintRect(mx1, my1, mx2, my2, 2);

        int cnt = 0;
        for (int i = 0; i < rect.length; i++){
            for (int j = 0; j < rect[0].length; j++){
                if(rect[i][j] == 1) cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static void paintRect(int x1, int y1, int x2, int y2, int color){
        for (int i = x1; i < x2; i++){
            for (int j = y1; j < y2; j++){
                rect[i + OFFSET][j + OFFSET] = color;
            }
        }
    }
}