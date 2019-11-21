import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        for (int i = 1; i <= 3; i++) {
//            String input = scanner.nextLine();
//            System.out.println(i+" "+input);
//        }

        int x = 1;
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(x+" "+input);
            x+=1;
        }
    }
}
