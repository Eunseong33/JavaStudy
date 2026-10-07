import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        
        int decimal = 0;
        for (int i = 0; i < N.length(); i++){
            decimal = decimal * A + (N.charAt(i) - '0');
        }

        StringBuilder sb = new StringBuilder();

        while (true){
            sb.append(decimal % B);
            decimal /= B;

            if (decimal == 0) break;
        }

        System.out.print(sb.reverse());
        
    }
}