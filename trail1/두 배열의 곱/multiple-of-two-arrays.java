import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        final int SIZE = 3;
        int[][] arr1 = new int[SIZE][SIZE];
        int[][] arr2 = new int[SIZE][SIZE];
        
        try(Scanner sc = new Scanner(System.in)){
            for (int i = 0; i < SIZE; i++){
                for (int j = 0; j < SIZE; j++){
                    arr1[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < SIZE; i++){
                for (int j = 0; j < SIZE; j++){
                arr2[i][j] = sc.nextInt();     
                }
            }
        }

        StringBuilder sb = new StringBuilder();
          for (int i = 0; i < SIZE; i++){
                for (int j = 0; j < SIZE; j++){
                    sb.append(arr1[i][j] * arr2[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.print(sb);
        }
}