import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String sub = sc.next();

        int cnt = 0;
        int idx = 0;
        
        while ((idx = input.indexOf(sub, idx)) != -1){
            cnt++;
            idx++;
        }
        System.out.print(cnt);
    }
}