import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String cmds = sc.next();
        
        int len = str.length();
        int shift = 0;

        for (int i = 0; i < cmds.length(); i++){
            char cmd = cmds.charAt(i);
            if (cmd == 'L'){
                shift = (shift + 1) % len;
            } else if (cmd == 'R') {
                shift = (shift - 1 + len) % len;
            }
        }
        String result = str.substring(shift) + str.substring(0, shift);
        System.out.print(result);
    }
}