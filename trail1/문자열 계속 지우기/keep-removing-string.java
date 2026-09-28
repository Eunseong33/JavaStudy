import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        String str = sc.next();

        int idx;
        while ((idx = sb.indexOf(str)) != -1){
            sb.delete(idx, (idx + str.length()));
        }
        System.out.print(sb);
    }
}