import java.util.Scanner;

/**
 * Programa: FibonacciRecursivo.java
 * Autor: [Tu Nombre]
 * Descripción: Calcula la serie Fibonacci de manera recursiva.
 */

public class Fibonacci_Recursivo {

    // Método recursivo para obtener el n-ésimo número de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) { // Caso base
            return n;
        } else { // Caso recursivo
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos de la serie Fibonacci: ");
        int n = sc.nextInt();

        System.out.println("\nSerie Fibonacci de " + n + " términos:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}