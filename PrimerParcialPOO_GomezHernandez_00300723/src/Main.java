import Inventory.Inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Inventory inventory = new Inventory();

    public static void main(String[] args) {
        showMainMenu();
    }

    private static void showMainMenu() {
        int option;

        System.out.println("Welcome to: ElectroMart!");

        do {
            System.out.println("Enter an option:");
            System.out.println("[1] Add article to inventory\n[2] Display article information\n[3] Show all articles\n[4] Modify article information\n[0] Exit");
            option = promptInt();

            switch (option) {
                case 0: // Exit
                    System.out.println("Exiting... Thanks for using our services!");
                    break;

                case 1: // Create article
                    break;

                case 2: // Show article info
                    break;

                case 3: // Show all articles
                    break;

                case 4: // Update article
                    break;

                default:
                    System.out.println("Error: Please enter a valid option");
                    break;
            }
        } while (option != 0);
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
