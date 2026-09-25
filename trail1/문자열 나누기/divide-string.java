import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine().replace(" ", "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            if (i % 5 == 0 && i != 0){
                sb.append('\n');
            }
            sb.append(input.charAt(i));
        }
        System.out.print(sb);
    }
}