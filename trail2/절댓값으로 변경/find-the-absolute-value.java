import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        convertToAbs(arr);
        for (int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void convertToAbs(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.abs(arr[i]);
        }
    }
}