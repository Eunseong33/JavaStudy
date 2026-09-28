import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        char target = 'e';
        int idx = sb.indexOf(String.valueOf(target));
        if (idx != -1){
            sb.deleteCharAt(idx);
        }
        System.out.print(sb);
    }
}