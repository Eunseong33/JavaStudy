import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int[][] arr = new int[n][n];

        int num = 1;
        for (int i = 0; i < a; i++){
            arr[sc.nextInt() - 1][sc.nextInt() - 1] = num++;
        }

        StringBuilder sb = new StringBuilder();
        for (int[] row : arr){
            for (int data : row){
                sb.append(data).append(' ');
            }
                sb.append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}