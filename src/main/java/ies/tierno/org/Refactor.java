package ies.tierno.org;

import java.util.Scanner;

public class Refactor {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    calculateSummation();
                    break;
                case 2:
                    calculateAverage();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (option != 3);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Elige una opción:");
        System.out.println("1. Sumatorio");
        System.out.println("2. Media");
        System.out.println("3. Salir");
    }

    private static void calculateSummation() {
        int number = askNumber("Introduce un entero positivo: ");
        int sum = calculateSum(number);
        System.out.println("El sumatorio es " + sum);
    }

    private static void calculateAverage() {
        int count = askNumber("Introduce la cantidad de numeros: ");
        int sum = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Introduce un número: ");
            sum += scanner.nextInt();
            scanner.nextLine();
        }

        double average = (double) sum / count;
        System.out.println("La media es " + average);
    }

    private static int askNumber(String menssage) {
        int number;
        do {
            System.out.print(menssage);
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number <= 0);

        return number;
    }

    private static int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}