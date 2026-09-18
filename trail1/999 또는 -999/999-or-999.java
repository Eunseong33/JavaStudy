import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true){
            int num = sc.nextInt();

            if (num == 999 || num == -999){
                break;
            }

            if (num > max){
                max = num;
            }
            
            if (num < min) {
                min = num;
            }

        }

        System.out.print(max + " " + min);
    }
}