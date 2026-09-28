import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < n; i++){
            int q = sc.nextInt();

            switch (q){
                case 1:
                    char firstChar = sb.charAt(0);
                    sb.deleteCharAt(0);
                    sb.append(firstChar);
                    break;
                case 2:
                    char lastChar = sb.charAt(sb.length() - 1);
                    sb.deleteCharAt(sb.length() - 1);
                    sb.insert(0, lastChar);
                    break;
                case 3:
                    sb.reverse();
                    break;
            }
            sb2.append(sb).append('\n');
        }        
        System.out.print(sb2);
    }
}