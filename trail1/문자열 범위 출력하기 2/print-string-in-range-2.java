import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < n && i < input.length(); i++){
            System.out.print(input.charAt(input.length() - i - 1));
        }
    }
}