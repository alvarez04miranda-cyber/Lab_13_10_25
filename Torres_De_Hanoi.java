import java.util.Scanner;
public class Torres_De_Hanoi {
    public static void hanoi(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 desde " + origen + " hasta " + destino);
        } else { 
            hanoi(n - 1, origen, destino, auxiliar);
            System.out.println("Mover disco " + n + " desde " + origen + " hasta " + destino);
            hanoi(n - 1, auxiliar, origen, destino);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de discos: ");
        int n = sc.nextInt();
        System.out.println("\nMovimientos para resolver Torres de Hanoi con " + n + " discos:");
        hanoi(n, 'A', 'B', 'C');

        sc.close();
    }
}