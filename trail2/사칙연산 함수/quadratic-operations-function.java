import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        System.out.print(calc(a, o, c));
    }

    public static String calc(int a, char o, int c) {
        int result;

        switch (o) {
            case '+' :
                result = a + c;
                break;
            case '-' :
                result = a - c;
                break;
            case '/' :
                result = a / c;
                break;
            case '*' :
                result = a * c;
                break;
            default : 
                return "False";
        }
                return a + " " + o + " " + c + " = " + result;
    }
}