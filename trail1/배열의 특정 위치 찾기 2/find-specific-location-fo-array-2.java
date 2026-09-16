import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<arr.length; i+=2){
            oddSum += arr[i];
            evenSum += arr[i+1];
        }
        System.out.println(Math.abs(oddSum - evenSum));
    }
}