import java.util.Scanner;
import java.util.Arrays;

class StuInfo implements Comparable<StuInfo> {
    int height;
    int weight;
    int stuNo;

    public StuInfo (int height, int weight, int stuNo){
        this.height = height;
        this.weight = weight;
        this.stuNo = stuNo;
    }

    //height desc, weight desc, num asc
    @Override
    public int compareTo(StuInfo stuInfo){
        if (stuInfo.height == this.height) {
            if (stuInfo.stuNo == this.stuNo) { return this.stuNo - stuInfo.stuNo; }
            return stuInfo.weight - this.weight;
        }
        return stuInfo.height - this.height;
    }

    public String toString(){
        return height + " " + weight + " " + stuNo;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StuInfo[] stuInfo = new StuInfo[n];
        int[] height = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }
        // Please write your code here.
        for (int i = 0; i < n; i++){
            stuInfo[i] = new StuInfo(height[i], weight[i], i + 1);
        }

        Arrays.sort(stuInfo);
        for (StuInfo data : stuInfo){
            System.out.println(data);
        }
    }
}