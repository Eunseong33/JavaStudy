import java.util.Scanner;
import java.util.Arrays;

class Point{
    int x;
    int y;
    int number;

    public Point(int x, int y, int number){
        this.x = x;
        this.y = y;
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        // Please write your code here.
        Point[] pts = new Point[n];

        for (int i = 0; i < n; i++){
            pts[i] = new Point(points[i][0], points[i][1], i + 1);
        }

        Arrays.sort(pts, (a, b) -> {
            int distanceA = Math.abs(a.x) + Math.abs(a.y);
            int distanceB = Math.abs(b.x) + Math.abs(b.y);

            if (distanceA == distanceB) {
                return Integer.compare(a.number, b.number);
            }
            return Integer.compare(distanceA, distanceB);
        });

        for (Point data : pts){
            System.out.println(data.number);
        }   
    }
}