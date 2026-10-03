import java.util.Scanner;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.print(f(n));
    }

    public static int f(int n){
        if (n == 1) return arr[0];
        return lcm(f(n - 1), arr[n-1]);
    }

    public static int lcm(int a, int b){
        return a / gcd(a, b) * b;
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}