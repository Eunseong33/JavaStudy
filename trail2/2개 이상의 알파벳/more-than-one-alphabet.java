import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        System.out.print(isAtLeastTwoDistinctLetters(A) ? "Yes" : "No");
    }

    public static boolean isAtLeastTwoDistinctLetters(String A){
        int cnt = 0;
        for (int i = 1; i < A.length(); i++){
            if(A.charAt(0) != A.charAt(i)){
               return true;
            }
        }
        return false;
    }
}