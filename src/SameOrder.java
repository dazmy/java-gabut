import java.util.Scanner;

public class SameOrder {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        getOrder();
    }

    public static boolean getOrder() {
        System.out.print("Do you following me on facebook ? (y/n) : ");
        String isFollow = scanner.nextLine();
        doSameThing(isFollow.equals("y"));
        return true;
    }

    public static void doSameThing(boolean thing) {
        if (thing) {
            return;
        }

        doSameThing(getOrder());
    }
}
