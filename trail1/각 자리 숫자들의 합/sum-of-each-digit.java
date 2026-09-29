import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.print(sum);

    }
}