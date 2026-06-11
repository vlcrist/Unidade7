/*
        
        // Entradas (criação dos vetores)
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetorSoma[] = new int[10];

        // Processos
        System.out.println("Insirando inteiros no vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Insira o valor de indíce " + i + " no vetor 1");
            vetor1[i] = sc.nextInt();
        }   
        System.out.println("Vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Insira o valor de indíce " + i + " no vetor 2");
            vetor2[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        System.out.println("Vetor 1:");
        System.out.println(Arrays.toString(vetor1));
        System.out.println("Vetor 2:");
        System.out.println(Arrays.toString(vetor2));
        System.out.println("Vetor Somado:");
        System.out.println(Arrays.toString(vetorSoma));

        System.out.println("Fim.");
        sc.close();

*/
import java.util.Scanner;

public class Uni07Exe04B {
    
    private int[] lerVetor(Scanner sc) {

        int vetorInt[] = new int [10];

        System.out.println("Insirando inteiros no vetor:");
        for (int i = 0; i < vetorInt.length; i++) {
            System.out.println("Insira o valor de indíce " + i + " no vetor.");
            vetorInt[i] = sc.nextInt();
        }   

        return vetorInt;
    }

    private void imprimirVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "] ");
        }

    }

    private int[] somarVetores(int vetor1[], int vetor2[]) {
        
        int vetorSoma[] = new int[10];
        
        for(int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        return vetorSoma;
    }

    public Uni07Exe04B () {
        Scanner sc = new Scanner(System.in);
        
        int vetorInt1[] = lerVetor(sc);
        System.out.println("Vetor 1:");
        imprimirVetor(vetorInt1);
        
        int vetorInt2[] = lerVetor(sc);
        System.out.println("\nVetor 2:");
        imprimirVetor(vetorInt2);
        
        int vetorSoma[] = somarVetores(vetorInt1, vetorInt2);
        System.out.println("\nVetor Soma:");
        imprimirVetor(vetorSoma);

        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe04B();
    }

}
