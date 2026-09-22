import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        int val = 0;

        for (int j = 0; j < c; j++){            
           if (j % 2 == 0){
            for (int i = 0; i < r; i++){
                    arr[i][j] = val++;
                }
           } else {
                for (int i = r - 1; i >= 0; i--){
                    arr[i][j] = val++;
                }
            }
        }

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){        
                    System.out.print(arr[i][j] + " ");
               
            }
                    System.out.println();
        }
    }
}