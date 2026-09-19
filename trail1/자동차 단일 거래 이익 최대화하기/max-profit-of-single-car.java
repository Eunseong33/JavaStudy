import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n - 1; i++){    
            for (int j = i + 1; j < n; j++){

                int a = arr[i];
                int b = arr[j];

             int profit = b - a;

                if (max < profit) {            
                        max = profit;
                }

            }
        }
        System.out.print(max);

    }
}