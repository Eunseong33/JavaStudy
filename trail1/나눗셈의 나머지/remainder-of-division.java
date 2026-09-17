import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] remainder = new int[10];
 
        int count = 0;
        while (true){
            if(a <= 1){
                break;
            }

            remainder[a % b]++;
            a = a/b;
          
        }

        int result =0;
        for (int i =0; i< remainder.length; i++){
            result += remainder[i] * remainder[i];
        }

          System.out.print(result);
    }
}