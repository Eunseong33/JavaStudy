import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int cnt = 0;
        while (sum > 0){
            if (sum % 10 == 1){
                cnt++;
            }
            sum /= 10;
        }
        System.out.println(cnt);
    }
}