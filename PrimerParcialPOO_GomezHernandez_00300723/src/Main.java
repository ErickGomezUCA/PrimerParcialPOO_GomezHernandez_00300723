import Articles.Article;
import Inventory.Inventory;
import Articles.Phone;
import Articles.Laptop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Inventory inventory = new Inventory();

    // Menus
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
                    showCreateArticleMenu();
                    break;

                case 2: // Show article info
                    showArticleInfoMenu();
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

    private static void showCreateArticleMenu() {
        // Article information
        String name;
        String model;
        String description;
        float price;
        int type;

        // Phone information
        Phone phone;
        float cameraQuality;
        float screenResolution;

        // Laptop information
        Laptop laptop;
        String os;
        int ram;

        // Objects

        System.out.println("Enter article name:");
        name = promptString();

        System.out.println("Enter article model:");
        model = promptString();

        System.out.println("Enter article description:");
        description = promptString();

        System.out.println("Enter article price:");
        price = promptFloat();

        do {
            System.out.println("Enter type of article:\n[1] Phone\n[2] Laptop");
            type = promptInt();

            switch(type) {
                case 1: // Phone
                    System.out.println("Enter camera resolution (in Megapixels):");
                    cameraQuality = promptFloat();

                    System.out.println("Enter phone screen resolution (in Inches):");
                    screenResolution = promptFloat();

                    phone = new Phone(name, model, description, price, cameraQuality, screenResolution);

                    inventory.addArticle(phone);
                    break;

                case 2: // Laptop
                    System.out.println("Enter laptop operative system:");
                    os = promptString();

                    System.out.println("Enter laptop RAM capacity (in GB):");
                    ram = promptInt();

                    laptop = new Laptop(name, model, description, price, os, ram);

                    inventory.addArticle(laptop);
                    break;

                default:
                    System.out.println("Error: Please enter a valid option");
                    break;
            }
        } while (type < 1 || type > 2);

        System.out.println("Article created successfully!");
    }

    private static void showArticleInfoMenu() {
        Article article;

        System.out.println("Enter article name:");
        article = promptArticle();

        if (article == null) {
            System.out.println("Article not found!");
            return;
        }

        inventory.showArticleInformation(article);
    }

    // Prompt methods

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

    private static String promptString() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        boolean flag = true;

        do {
            System.out.print("> ");

            try {
                input = scanner.nextLine();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Expected an integer value.");
                scanner.nextLine();
            }
        } while (flag);

        return input;
    }

    private static float promptFloat() {
        Scanner scanner = new Scanner(System.in);
        float input = 0;
        boolean flag = true;

        do {
            System.out.print("> ");

            try {
                input = scanner.nextFloat();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Expected an integer value.");
                scanner.nextLine();
            }
        } while (flag);

        return input;
    }

    private static Article promptArticle() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Article article = null;
        boolean flag = true;

        do {
            System.out.print("> ");

            try {
                input = scanner.nextLine();
                article = inventory.searchArticle(input);
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Expected an integer value.");
                scanner.nextLine();
            }
        } while (flag);

        return article;
    }
}
