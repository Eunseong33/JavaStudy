import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < a; i++){
            arr[sc.nextInt() - 1][sc.nextInt() - 1] = 1;
        }
        for (int[] row : arr){
            for (int data : row){
                System.out.print(data + " ");
            }
            System.out.println();
        }
            sc.close();
    }
}