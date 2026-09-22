import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        final int SIZE = sc.nextInt();

        int[][] arr = new int[SIZE][SIZE];
        int val = 1;
        for (int j =  SIZE - 1; j >= 0; j--){
            if (((SIZE - 1 - j) % 2) == 0){
                for (int i = SIZE - 1; i >= 0; i--){
                    arr[i][j] = val++;
                }
            }
             else {
                for (int i = 0; i < SIZE; i++){
                    arr[i][j] = val++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        sc.close();
    }
}