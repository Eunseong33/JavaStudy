import java.util.Scanner;
public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.print(sumOfA(m));
    }

    public static int sumOfA(int m){
        int sum = 0;
        
        while (true){

            sum += arr[m];

            if (m == 1){
                break;
            }

            if (m % 2 == 0){
                m /= 2;
            } else {
                m -= 1;
            }
        }
            return sum;
    }
}