import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMainMenu();
    }

    private static void showMainMenu() {
        int option;

        System.out.println("Welcome to: ElectroMart!");
        System.out.println("Enter an option:");
        System.out.println("[1] Add article to inventory\n[2] Display article information\n[3] Show all articles\n[4] Modify article information\n[0] Exit");
        option = promptInt();
        
    }

    private static int promptInt() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean flag = true;

        do {
            System.out.print("> ");

            try {
                input = scanner.nextInt();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Expected an integer value.");
                scanner.nextLine();
            }
        } while (flag);

        return input;
    }
}
