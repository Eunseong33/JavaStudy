import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        String result = isPalindrome(input);
        System.out.print(result);
    }

    public static String isPalindrome(String input){
        for (int i = 0; i < input.length() / 2; i++){  
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)){
                return "No";
            } 
        }
            return "Yes";
    }
}