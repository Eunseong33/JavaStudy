import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
        for (char ch : str.toCharArray()){
            if (ch >= '0' && ch <= '9'){
                sum += (ch - '0');
            }
        }
        System.out.print(sum);
    }
}