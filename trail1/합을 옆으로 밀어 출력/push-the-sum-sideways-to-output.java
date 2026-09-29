import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += sc.nextInt();
        }
        String result = Integer.toString(sum);
        System.out.println(result.substring(1)+ result.charAt(0));
    }
}