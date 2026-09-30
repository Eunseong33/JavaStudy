import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.print(power(a, b));
    }

    public static int power(int a, int b) {
        int val = 1;
        for (int i = b; i >= 1; i--){
            val *= a;
        }
        return val;
    }
}