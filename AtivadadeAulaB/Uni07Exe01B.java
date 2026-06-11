/*

import java.util.Scanner;

public class Uni06Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetorInteiros [] = new int[10];

        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println("Insira o valor de indíce " + i + " no vetor de 10 números inteiros:");
            vetorInteiros[i] = sc.nextInt();
        }
        System.out.println("Imprimindo ordem contrária...");
        for (int i = vetorInteiros.length - 1; i >= 0; i--) {
            System.out.println(vetorInteiros[i] + " ");
        }
        sc.close();
    }

}

*/
import java.util.Scanner;

public class Uni07Exe01B {
    
    private int[] lerVetor(Scanner sc) {

        int vetorInteiros [] = new int[10];

        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println("Insira o valor de indíce " + i + " no vetor de 10 números inteiros:");
            vetorInteiros[i] = sc.nextInt();
        }
        return vetorInteiros;
    }

    private void imprimirVetor(int vetorInteiros []) {

        System.out.println("Imprimindo ordem contrária...");
        for (int i = vetorInteiros.length - 1; i >= 0; i--) {
            System.out.print(vetorInteiros[i] + " ");
        }
    }
    

    public Uni07Exe01B () {
        Scanner sc = new Scanner(System.in);
        int vetorInteiros [] = lerVetor(sc);
        imprimirVetor(vetorInteiros);
    }

    public static void main(String[] args) {
        new Uni07Exe01B();
    }
}
