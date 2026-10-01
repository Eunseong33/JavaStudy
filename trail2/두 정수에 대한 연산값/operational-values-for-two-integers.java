import java.util.Scanner;

class IntWrapper{
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        IntWrapper aWrapper = new IntWrapper(a);
        IntWrapper bWrapper = new IntWrapper(b);        
        operationOnTwoIntegers(aWrapper, bWrapper);
        System.out.print(aWrapper.value + " " + bWrapper.value);
    }

    public static void operationOnTwoIntegers(IntWrapper a, IntWrapper b){
        if(a.value > b.value){ 
            a.value += 25;
            b.value *= 2;
        } else {
            b.value += 25;
            a.value *= 2;
        }
    }
}