import java.util.Scanner;
public class Main {

    public static final int OFFSET = 100;
    public static int[][] rect = new int[200][200];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            paintRect(x1, y1, x2, y2);
        }
        int cnt = 0;
        for (int i = 0; i < rect.length; i++){
            for (int j = 0; j < rect[0].length; j++){
                if (rect[i][j] == 1) { cnt++; }
            }
        }
        System.out.print(cnt);
    }

    public static void paintRect(int x1, int y1, int x2, int y2){
        for (int i = x1; i < x2; i++){
            for (int j = y1; j < y2; j++){
                rect[i + OFFSET][j + OFFSET] = 1;
            }
        }
     
    }

}