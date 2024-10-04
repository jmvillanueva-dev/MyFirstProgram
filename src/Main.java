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

        // Este ejercicio muestra como contar de un numero n hasta un numero m.
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

        // Imprime tu nombre de forma reiterada.
        System.out.println(">> Ejercicio 2: Imprimir nombre");
        String nombre = scanner.nextLine();
        for (int i = 1; i <= 50; i++) {
            System.out.println(nombre);
        }

        // Imprime los 20 primeros numeros primos.
        System.out.println(">> Ejercicio 3: 20 Primeros numero primos");
        boolean primo;
        for (int i = 1; i <= 20; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}
//