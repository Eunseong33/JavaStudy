import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    
    for (int i = 0; i < 5; i++){
        for (int j = 0; j < 3; j++){
            char ch = Character.toUpperCase(sc.next().charAt(0));
            System.out.print(ch + " ");
        }     
         System.out.println();
    }

    }
}