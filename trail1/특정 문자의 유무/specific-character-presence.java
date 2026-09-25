import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.print((input.contains("ee")) ? "Yes " : "No ");
        System.out.print((input.contains("ab")) ? "Yes " : "No ");        
    }
}