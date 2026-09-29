import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int num1 = extractNumber(str1);
        int num2 = extractNumber(str2);

        System.out.print(num1 + num2);
    }
        private static int extractNumber(String str){
            int num = 0;
            for (int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                if (ch <= '9' && ch >= '0'){
                    num = num * 10 + (ch - '0');
                }
            }
            return num;
        }
    }
