import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(input1, 0, 2).append(input2, 2, input2.length());
        System.out.print(sb);
    }
}