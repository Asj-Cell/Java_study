import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        int result = math(3, 4);
        System.out.println("result = " + result);
    }

    public static int math(int num1, int num2) {
        int result =1;
        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        return result;
    }
}
