package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*
        String nombre;
        double edad;

        System.out.println("Ingrese su nombre y su edad: ");
        System.out.printf("Nombre:" + "\n");
        nombre = scanner.nextLine();

        System.out.printf("Edad:");
        edad = scanner.nextDouble();

        System.out.println(nombre + " " + edad);
        */

        /*
        System.out.println("Ejercicios en clase:");

        System.out.println("> Ejercicio 1: Conteo de n a m con un salto de i");
        int n,m,salto;
        System.out.printf("Ingrese el valor de INICIO: ");
        n = scanner.nextInt();
        System.out.printf("Ingrese el valor de FIN: ");
        m = scanner.nextInt();
        System.out.printf("Ingrese el salto deseado: ");
        salto = scanner.nextInt();

        for (int i = n; i <= m; i+=salto) {
            System.out.println(" >>" + i);
        }
        */
        /*
        PrintStream printf = System.out.println(">> Ejercicio 2: Imprimir nombre");
        for (int i = 1; i <= 50; i++) {
            System.out.println("Jhonny Villanueva M.");
        }
        */
        System.out.println(">> Ejercicio 3: 20 Primeros numero primos");
        int divisores = 0;
        for (int i = 1; i <= 20; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) divisores++;
                if (divisores == 1) System.out.println(i);
            divisores = 0;
            }
        }

    }
}