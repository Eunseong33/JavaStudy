import java.util.Scanner;

class ProductCode{
    String id;
    int code;

    public ProductCode(){
        this.id = "";
        this.code = 0;
    }
    public ProductCode(String id, int code){
        this.id = id;
        this.code = code;
    }

    public String toString(){
        return "product " + code + " is " + id;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        ProductCode pCode1 = new ProductCode();
        pCode1.id = "codetree";
        pCode1.code = 50;

        ProductCode pCode2 = new ProductCode(id2, code2);

        System.out.println(pCode1.toString());
        System.out.println(pCode2.toString());
    }
}