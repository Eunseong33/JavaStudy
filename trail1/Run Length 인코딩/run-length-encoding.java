import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (int i = 0; i < input.length(); i++){
            if (i == input.length() - 1 || input.charAt(i) != input.charAt(i + 1)) {
                sb.append(input.charAt(i)).append(cnt);
                cnt = 1;
            } else {
                cnt++;
            }
        }
        System.out.println(sb.length());
        System.out.println(sb);
    }
}