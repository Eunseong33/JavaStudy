import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();

        if (rect2_x1 <= rect1_x1 &&
            rect2_x2 >= rect1_x2 &&
            rect2_y1 <= rect1_y1 &&
            rect2_y2 >= rect1_y2) {
            
            System.out.print(0);
            return;
            }

       boolean left = rect2_x1 <= rect1_x1
                && rect2_x2 >= rect1_x1
                && rect2_y1 <= rect1_y1
                && rect2_y2 >= rect1_y2;

        boolean right = rect2_x1 <= rect1_x2
                && rect2_x2 >= rect1_x2
                && rect2_y1 <= rect1_y1
                && rect2_y2 >= rect1_y2;

        boolean bottom = rect2_y1 <= rect1_y1
                && rect2_y2 >= rect1_y1
                && rect2_x1 <= rect1_x1
                && rect2_x2 >= rect1_x2;

        boolean top = rect2_y1 <= rect1_y2
                && rect2_y2 >= rect1_y2
                && rect2_x1 <= rect1_x1
                && rect2_x2 >= rect1_x2;

        int x1 = rect1_x1;
        int x2 = rect1_x2;
        int y1 = rect1_y1;
        int y2 = rect1_y2;

        if (left) x1 = rect2_x2;
        if (right) x2 = rect2_x1;
        if (bottom) y1 = rect2_y2;
        if (top) y2 = rect2_y1;

        System.out.print((x2 - x1) * (y2 - y1));
    }
}