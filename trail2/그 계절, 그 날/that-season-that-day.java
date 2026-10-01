import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        System.out.print(printTheSeason(y, m, d));
    }

    public static String printTheSeason(int y, int m, int d) {
        if (!exists(y, m, d)) { return "-1"; }

            switch (m) {
                case 12:
                case 1:
                case 2:
                    return "Winter";
                case 3:
                case 4:
                case 5:
                    return "Spring";
                case 6:
                case 7:
                case 8:
                    return "Summer";
                case 9:
                case 10:
                case 11:
                    return "Fall";
            }
        
        return "-1";
    }

    public static boolean exists(int y, int m, int d){
        int maxDay;
        
      switch (m) {
        case 2:
            maxDay = isALeapYear(y) ? 29 : 28;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            maxDay = 30;
            break;
        default:
            maxDay = 31;
      }
      return d <= maxDay;
    }

    public static boolean isALeapYear(int y){
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }
}