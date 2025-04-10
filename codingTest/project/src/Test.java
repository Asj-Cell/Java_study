import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str= "Javascript strings are primitive and immutable: All string methods produce a new string without altering the original string.";
        String[] split = str.split(" ");

        for (String s : split) {
            if (s.indexOf("string") != -1) {
                int i = s.indexOf("string");
                return i;
            }
        }
        return -1;
    }
}
