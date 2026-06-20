/*

__Enunciado:

Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% 
e os das posições pares sejam aumentados em 2%. Imprima o vetor resultante.

__ Análise: OK

__ Gorduras: Descreva um algoritmo que

__ Entradas:

double vetorReais[] = lerVetor(sc)

lerVetor(sc) {

    double vetorReais[] = new double[12]

    Para i < tamanho do vetor, i++ {

        ler(vetorReais[i])

    }

    retornar vetorReais

}

__ Processos:

Uni07Exe03B() {

    Scanner sc = new Scanner(System.in)

    double vetorReais[] = lerVetor(sc)

    vetorReais = corrigirVetor(vetorReais)

    imprimirVetor(vetorReais)

}

corrigirVetor(vetorReais[]) {

    Para i < tamanho do vetor, i++ {

        se i % 2 == 0 {

            vetorReais[i] = vetorReais[i] * 1.2

        } se não {

            vetorReais[i] = vetorReais[i] * 1.2

        }

    }

    retornar vetorReais

}

__ Saídas:

imprimirVetor(vetorReais[]) {

    Para i < tamanho do vetor, i++ {

        imprimir("[" + vetorReais[i] + "]")

    }

}

*/

import java.util.Scanner;

public class Uni07Exe03B {
    
    private double[] lerVetor(Scanner sc) {
        
        double vetorReais[] = new double[12];

        for (int i = 0; i < vetorReais.length; i++) {
            System.out.println("Insira o número real de indíce " +  i + " no vetor:");
            vetorReais[i] = sc.nextDouble();
        }

        return vetorReais;
    }

    private double[] corrigirVetor(double vetorReais[]) {

        for(int i = 0; i < vetorReais.length; i++) {
            if (i %2 == 0) {
                vetorReais[i] = vetorReais[i] * 1.2;
            } else {
                vetorReais[i] = vetorReais[i] * 1.2;
            }
        }
        return vetorReais;

    }

    private void imprimirVetor(double vetorReais[]) {
        
        for(int i = 0; i < vetorReais.length; i++) {
            System.out.print("[" + vetorReais[i] + "]" + " ");
        }

    }

    public Uni07Exe03B() {
        Scanner sc = new Scanner(System.in);

        double vetorReais[] = lerVetor(sc);
        vetorReais = corrigirVetor(vetorReais);
        imprimirVetor(vetorReais);

        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe03B();
    }

}

/*
================================
------- Valores de teste -------
================================
Caso 01:
* Entradas:
vetor[0] = 1
vetor[1] = 2
vetor[2] = 3
vetor[3] = 4
vetor[4] = 5
vetor[5] = 6
vetor[6] = 7
vetor[7] = 8
vetor[8] = 9
vetor[9] = 10
vetor[10] = 11
vetor[11] = 12

* Saídas:
[1.2] [2.4] [3.5999999999999996] [4.8] [6.0] [7.199999999999999] [8.4] [9.6] [10.799999999999999] [12.0] [13.2] [14.399999999999999]
*/