package ies.tierno.org;


import java.util.Scanner;

public class refactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Opt;
        do {
        System.out.println("Elige una opción:");
        System.out.println("1. Sumatorio");
        System.out.println("2. Media");
        System.out.println("3. Salir");
        Opt = scanner.nextInt();
        scanner.nextLine();

            if (Opt == 1) {
            int chisme;
            do {
                    System.out.print("Introduce un entero positivo: ");
                    chisme = scanner.nextInt();
                    scanner.nextLine();
                } while (chisme <= 0);

                int La_suma = 0;
                for (int i = 1; i <= chisme; i++) {
                    La_suma += i;
                }

                System.out.println("El sumatorio es " + La_suma);
            } else if (Opt == 2) {
                int _zzzz;
                do {
                    System.out.print("Introduce un entero positivo: ");_zzzz = scanner.nextInt();
                    scanner.nextLine();
                } while (_zzzz <= 0);

                int sum = 0;
                for (int cosa = 0; cosa < _zzzz; cosa++) {
                    System.out.print("Introduce un número:");
                    sum += scanner.nextInt();
                    scanner.nextLine();
                }

                System.out.println("La media es " + (sum / _zzzz));
            } else if (Opt == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }

        } while (Opt != 3);}}
