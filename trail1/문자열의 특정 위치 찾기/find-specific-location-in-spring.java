import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char ch = sc.next().charAt(0);
        
        int idx = input.indexOf(ch);
        if (idx != -1){
                System.out.print(idx);
        } else {
                System.out.print("No");
        }

    }
}