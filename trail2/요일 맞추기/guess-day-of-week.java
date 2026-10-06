import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfTheWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        int day1 = d1;
        int day2 = d2;

        for (int month = 1; month < m1; month++){
            day1 += daysOfMonth[month];
        }
        for (int month = 1; month < m2; month++){
            day2 += daysOfMonth[month];
        }

        int days = day2 - day1;
        int idx = days % 7;

        if (idx < 0){
            idx += 7;
        }

        System.out.print(daysOfTheWeek[idx]);
    }
}