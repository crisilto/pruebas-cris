package PruebasGit;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la ciudad donde vives: ");
        String ciudad = scanner.nextLine();

        scanner.close();

        System.out.println("¡Hola, " + nombre + "! Vives en " + ciudad + ".");
    }
}
