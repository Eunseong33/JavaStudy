import java.util.Scanner;

class BombDefusal {
    String uCode;
    char lColor;
    int time;

    public BombDefusal(String uCode, char lColor, int time){
        this.uCode = uCode;
        this.lColor = lColor;
        this.time = time;
    }

    public String toString(){
        return "code : " + uCode + "\n"
            + "color : " + lColor + "\n"
            + "second : " + time + "\n"; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        BombDefusal bd = new BombDefusal(uCode, lColor, time);
        System.out.print(bd.toString());
    }
}