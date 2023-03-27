import java.util.Scanner;

public class getInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you think? :");
        String input = scanner.nextLine();
        System.out.println("You think about " + input + " , huh ?");
    }
}
