import java.util.Scanner;
import java.util.Arrays;

class Member {
    String name;
    int height;
    double weight;

    public Member(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String toString(){
        return name + " " + height + " " + weight + "\n";
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
        }
        // Please write your code here.
        Member[] members = new Member[n];
        for (int i = 0; i < n; i++){
            members[i] = new Member(names[i], heights[i], weights[i]);
        }

        Member[] byName = members.clone();
        Member[] byHeight = members.clone();

        StringBuilder sb = new StringBuilder();
        Arrays.sort(byName, (a, b) -> a.name.compareTo(b.name));
        sb.append("name").append("\n");
        for (Member data : byName) { sb.append(data); }
        sb.append("\n");

        Arrays.sort(byHeight, (a, b) -> Integer.compare(b.height, a.height));
        sb.append("height").append("\n");
        for (Member data : byHeight) { sb.append(data); }
        System.out.print(sb);
    }
}