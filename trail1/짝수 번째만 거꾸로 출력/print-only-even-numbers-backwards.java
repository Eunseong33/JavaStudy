import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < input.length(); i += 2){
                sb.append(input.charAt(i));
        }
        System.out.print(sb.reverse());
    }
}