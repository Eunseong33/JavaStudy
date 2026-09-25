import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int eeCnt = 0;
        int ebCnt = 0;
        for (int i = 0; i < input.length() - 1; i++){
            String sub = input.substring(i, i + 2);
            if (sub.equals("ee")){
                eeCnt++;
            } else if (sub.equals("eb")){
                ebCnt++;
            }
        }
        System.out.print(eeCnt + " " + ebCnt);
    }
}