import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()){
            String str = sc.next();
            if (str.equals("END")) { break; }

            sb.append(new StringBuilder(str).reverse()).append('\n');
        }
        System.out.print(sb);
    }
}