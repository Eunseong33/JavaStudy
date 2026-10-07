import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.

        char[] ch = binary.toCharArray();

        int cnt = 1;
        int sum = 0;
        for (int i = ch.length - 1; i >= 0; i--, cnt *= 2){
            sum += cnt * (ch[i] - '0');
        }
        System.out.print(sum);
    }
}