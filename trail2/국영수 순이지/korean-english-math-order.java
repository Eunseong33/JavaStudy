import java.util.Scanner;
import java.util.Arrays;

class Score implements Comparable<Score> {
    String name;
    int korean;
    int english;
    int math;

    public Score(String name, int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Score score){
        if(this.korean == score.korean) {
            if (this.english == score.english) { return score.math - this.math; }
            return score.english - this.english;
            }
        return score.korean - this.korean;
    }

    public String toString(){
        return name + " " + korean + " " + english + " " + math;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
        }
        // Please write your code here.
        Score[] scores = new Score[n];
        for (int i = 0; i < n; i++){
            scores[i] = new Score(names[i], korean[i], english[i], math[i]);
        }
        Arrays.sort(scores);
        for (Score data : scores){
            System.out.println(data);
        }
    }
}