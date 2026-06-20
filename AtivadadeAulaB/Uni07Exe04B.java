/*

__ Enunciado:

Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas 
dos vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9].
Exiba, ao final, os três vetores na tela.

__ Análise: OK

__ Gorduras: Faça um programa para 

__ Entradas:

int vetorInt1[] = lerVetor(sc)

int vetorInt2[] = lerVetor(sc)

lerVetor(sc) {

    int vetorInt[] = new int[10]

    imprimir("Insirando inteiros no vetor:")

    Para i < tamanho do vetor, i++ {

        ler(vetorInt[i])

    }

    retornar vetorInt

}

__ Processos:

Uni07Exe04B() {

    Scanner sc = new Scanner(System.in)

    int vetorInt1[] = lerVetor(sc)

    imprimir("Vetor 1:")

    imprimirVetor(vetorInt1)

    int vetorInt2[] = lerVetor(sc)

    imprimir("Vetor 2:")

    imprimirVetor(vetorInt2)

    int vetorSoma[] = somarVetores(vetorInt1, vetorInt2)

    imprimir("Vetor Soma:")

    imprimirVetor(vetorSoma)

}

somarVetores(vetor1[], vetor2[]) {

    int vetorSoma[] = new int[10]

    Para i < tamanho do vetorSoma, i++ {

        vetorSoma[i] = vetor1[i] + vetor2[i]

    }

    retornar vetorSoma

}

__ Saídas:

imprimirVetor(vetor[]) {

    Para i < tamanho do vetor, i++ {

        imprimir("[" + vetor[i] + "]")

    }

}

*/

import java.util.Scanner;

public class Uni07Exe04B {
    
    private int[] lerVetor(Scanner sc) {

        int vetorInt[] = new int [10];

        for (int i = 0; i < vetorInt.length; i++) {
            System.out.println("Insira o valor inteiro de indíce " + i + " no vetor.");
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

/*
==========================
---- Valores de Teste ----
==========================
Caso 01:
* Entradas:
vetor1[i] = 1,2,3,4,5,6,7,8,9,10
vetor2[i] = 10,9,8,7,6,5,4,3,2,1
* Saídas:
Vetor 1:
[1] [2] [3] [4] [5] [6] [7] [8] [9] [10]
Vetor 2:
[10] [9] [8] [7] [6] [5] [4] [3] [2] [1]
Vetor Soma:
[11] [11] [11] [11] [11] [11] [11] [11] [11] [11]
==========================
*/