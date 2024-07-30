import java.util.Scanner;

public class BubbleSort2 {
    public static void main(String[] args) {
        int X[] = new int[5];
        int i, j, aux;
        Scanner scanner = new Scanner(System.in);
        
        for  (i = 0; i <= 4; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            X[i] = scanner.nextInt();
        }

        scanner.close();

        //ordenando de forma crescente
        //laço com quantidade de elementos do vetor -1
        for (j = 1; j <= 4; j++) {
            //laço que percorre a ultima posição do vetor j
            for (i = 4; i >= j; i--) {
                if (X[i] < X[i - 1]) {
                    aux = X[i];
                    X[1] = X[i - 1];
                    X[i - 1] = aux;
                }
            }
        }

        for (i = 0; i <= 4; i++) {
            System.out.println((i + 1) + " número: " + X[i]);
        }
    }
}
