import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        int val = 1;

        for(int k = 0; k <= r + c - 2; k++){
            for (int i = 0; i < r; i++){
                int j = k - i;

                if (j >= 0 && j < c){
                    arr[i][j] = val++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                  sb.append(arr[i][j]).append(" ");
            }
                sb.append("\n");
        }
        sc.close();
        System.out.print(sb);
    }
}