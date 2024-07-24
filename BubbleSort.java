import java.util.Scanner;

// o primeiro laço possui 5 iterações e o segundo 4 iterações. Pelo segundo está interno ao primeiro,
// ele será executado 5X4 vezes, totalizando 20 iterações. Independente do cenário, todas as comparações
// serão realizadas. 

public class BubbleSort {
    public static void main(String[] args) {
        int X[] = new int[5];
        int i, n, aux;
        Scanner scanner = new Scanner(System.in);
        
        for  (i = 0; i <= 4; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            X[i] = scanner.nextInt();
        }

        scanner.close();

        for (n = 1; n <= 5; n++) {
            for (i = 0; i <= 3; i++) {
                if (X[i] > X[i+1]) {
                    aux = X[i];
                    X[i] = X[i+1];
                    X[i+1] = aux;
                }
            }
        }

        for (i = 0; i <= 4; i++) {
            System.out.println((i+1) + " número: " + X[i]);
        }
    }
}