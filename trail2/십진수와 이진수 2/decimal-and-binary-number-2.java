import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++){
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        decimal *= 17;
        
        int[] b = new int[20];
        int cnt = 0;
        while (decimal > 0){
          b[cnt++] = decimal % 2;
          decimal /= 2;
        } 
        for (int i = cnt - 1; i >= 0; i--){
            System.out.print(b[i]);
        }
    }
}