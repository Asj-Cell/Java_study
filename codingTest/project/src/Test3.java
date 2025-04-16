import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("행성이름을 입력하세요.");
        String input = scanner.nextLine();

        switch (input) {
            case "수성" :
                System.out.println("Mercury");
                break;
            case "금성" :
                System.out.println("Venus");
                break;

            case "지구" :
                System.out.println("Earth");
                break;

            case "화성" :
                System.out.println("Mars");
                break;

            case "목성" :
                System.out.println("Jupiter");
                break;

            case "토성" :
                System.out.println("Saturn");
                break;

            case "천왕성" :
                System.out.println("Uranus");
                break;

            case "해왕성" :
                System.out.println("Neptune");
                break;

        }



    }
}
