/*

__ Enunciado:

Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos.

__ Análise: OK

__ Gordura: Descreva um algoritmo que

__ Entradas:

int vetorInteiros[] = lerVetor(sc)

lerVetor(sc) {

    int vetorInteiros[] = new int[10]

    Para i < tamanho do vetor, i++ {

        ler(vetorInteiros[i])

    }

    retornar vetorInteiros

}

__ Processos:

Uni07Exe01B() {

    Scanner sc = new Scanner(System.in)

    int vetorInteiros[] = lerVetor(sc)

    imprimirVetor(vetorInteiros)

}

__ Saídas:

imprimirVetor(vetorInteiros[]) {

    imprimir("Imprimindo ordem contrária...")

    Para i = tamanho do vetor - 1 até i >= 0 {

        imprimir(vetorInteiros[i])

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

/*
============================
----= Valores de Teste -----
============================
Caso 01:
* Entradas:
vetorInteiros[i] = 1,2,3,4,5,6,7,8,9,10
* Saídas:
Imprimindo ordem contrária...
10 9 8 7 6 5 4 3 2 1
============================
Caso 02:
* Entradas:
vetorInteiros[i] = 15,4,8,20,7,2,11,1,30,9
* Saídas:
Imprimindo ordem contrária...
9 30 1 11 2 7 20 8 4 15
============================
*/