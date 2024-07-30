
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
            int X[] = new int [5];
            int i, j, eleito;
            Scanner scanner = new Scanner(System.in);
            
            for (i = 0; i <= 4; i++) {
                System.out.println("Digite o " + (i + 1) + " número: ");
                X[i] = scanner.nextInt();
            }
            
            //ordena de forma crescente
            //laço com quantidade de elementos - 1

            for (i = 1; i <= 4; i++) {
                eleito = X[i];
                j = i - 1;
                
                //laço que percorre os elemntos à esquerda 
                //do número eleito ou até encontrar a posição para
                //recolocação do número eleito respeitando a ordenação

                while (j >= 0 && X[j] > eleito) {
                    X[j + 1] = X[j];
                    j = j - 1;
                }

                X[j + 1] = eleito;
            }

            for (i = 0; i <= 4; i++) {
                System.out.println((i + 1) + " número: " + X[i]);
            }

            scanner.close();
    }       
}           //o pior caso ocorre quando a entrada possui valores na ordem inversa onde resulta em O(n²)
            //o melhor caso é quando o vetor possui elementos já ordenados onde resulta em O(n-1) já 
            //que se tem n-1 valores para j.
