import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] input = new String[10];

        for (int i = 0; i < input.length; i++){
            input[i] = sc.next();            
        }
        
        char ch = sc.next().charAt(0);
        boolean exists = false;

        for (String str : input){
            if (str.charAt(str.length() - 1) == ch) {
                System.out.println(str);
                exists = true;
            } 
        }

        if (!exists){
            System.out.print("None");
        }

    }
}