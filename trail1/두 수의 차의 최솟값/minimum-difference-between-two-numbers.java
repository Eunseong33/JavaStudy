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
        
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++){
            int diff = arr[i + 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        System.out.print(minDiff);
    }
}