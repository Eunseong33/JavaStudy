import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        System.out.print(exists(m, d) ? "Yes" : "No");
    }

    public static boolean exists(int m, int d) {

        if (m > 12) {
            return false;
        }

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return d <= 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return d <= 30;

            case 2:
                return d <= 28;
        }

        return false;
    }
}
