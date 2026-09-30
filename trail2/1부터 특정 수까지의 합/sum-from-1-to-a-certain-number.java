import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int result = sumFromOneToN(n);
        System.out.println(result);
    }

    public static int sumFromOneToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        int result = sum / 10;
        return result;
    }
}