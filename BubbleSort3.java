import java.util.Scanner;

public class BubbleSort3 {
    public static void main(String[] args) {
        int X[] = new int[5];
        int n, i, aux, troca;
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i <= 4; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            X[i] = scanner.nextInt();
        }
        scanner.close();

        //ordenando de forma decrescente
        //laço com quantidade de elementos do vetor
        //e enquanto tiver troca
        n = 1;
        troca = 1;
        
        while (n <= 5 && troca == 1) {
            troca = 0;
            
            for (i = 0; i <= 3; i++) {
                if (X[i] < X[i + 1]) {
                    troca = 1;
                    aux = X[i];
                    X[i] = X[i + 1];
                    X[i + 1] = aux;
                }
                n = n + 1;
            }
        }

        for (i = 0; i <= 4; i++) {
            System.out.println((i + 1 + " número: " + X[i]));
        }
    }
}
