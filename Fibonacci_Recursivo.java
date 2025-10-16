import java.util.Scanner;

public class Fibonacci_Recursivo {
    public static int fibonacci(int n) {
        if (n <= 1) { 
            return n;
        } else { 
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
