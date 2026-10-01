import java.util.Scanner;

public class Main {
    static String text;
    static String pattern;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        // Please write your code here.
        System.out.print(startingIndex());
    }

    public static boolean isSub(int start){
            for (int j = 0; j < pattern.length(); j++){
                if (text.charAt(start + j) != pattern.charAt(j)){
                    return false;
                }
            }
        return true;
    }

    public static int startingIndex(){
        for (int i = 0; i <= text.length() - pattern.length(); i++){
            if (isSub(i)){
                return i;
            } 
        }
            return -1;
    }
}