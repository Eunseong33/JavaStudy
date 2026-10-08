import java.util.Scanner;
public class Main {

    public static int[][] rect = new int[200][200];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            paintRect(x1[i], y1[i], x2[i], y2[i], i + 1);
        }
        int cnt = 0;
        for (int i = 0; i < rect.length; i++){
            for (int j = 0; j < rect[0].length; j++){
                if (rect[i][j] > 0 && rect[i][j] % 2 == 0) cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static void paintRect(int x1, int y1, int x2, int y2, int color){
        for (int i = x1; i < x2; i++){
            for (int j = y1; j < y2; j++){
                    rect[i + 100][j + 100] = color;
                }
        }
    }
}
