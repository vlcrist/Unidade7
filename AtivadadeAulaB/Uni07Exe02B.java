/*

__ Enunciado: 

Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Imprima quais valores desses informados são maiores que a média dos valores. F

__ Análise: OK

__ Gordura: Descreva um algoritmo que

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

Uni07Exe02B() {

    Scanner sc = new Scanner(System.in)

    double vetorReais[] = lerVetor(sc)

    double somaVetores = somarVetor(vetorReais)

    double mediaVetor = calcularMediaVetor(vetorReais, somaVetores)

    imprimir("A média de valores do vetor é: " + mediaVetor)

    imprimirValores(mediaVetor, vetorReais)

}

somarVetor(vetorReais[]) {

    double somaVetores = 0

    Para i < tamanho do vetor, i++ {

        somaVetores = somaVetores + vetorReais[i]

    }

    retornar somaVetores

}

calcularMediaVetor(vetorReais[], somaVetores) {

    double mediaVetor = somaVetores / vetorReais.length

    retornar mediaVetor

}

__ Saídas:

imprimir("A média de valores do vetor é: " + mediaVetor)

imprimirValores(mediaVetor, vetorReais[]) {

    Para i < tamanho do vetor, i++ {

        se vetorReais[i] > mediaVetor {

            imprimir("O valor " + vetorReais[i] + " de indíce " + i + " é maior que a média.")

        }

    }

}

*/

import java.util.Scanner;

public class Uni07Exe02B {
    
    private double[] lerVetor(Scanner sc) {
        
        double vetorReais[] = new double[12];

        for (int i = 0; i < vetorReais.length; i++) {
            System.out.println("Insira o valor real de indíce " + i + " no vetor de números reais:");
            vetorReais[i] = sc.nextDouble();
        }

        return vetorReais;
    }

    private double somarVetor(double vetorReais[]) {

        double somaVetores = 0;

        for (int i = 0; i < vetorReais.length; i++) {
            somaVetores = (somaVetores + vetorReais[i]);
        }
        return somaVetores;
    }

    private double calcularMediaVetor(double vetorReais[], double somaVetores) {

        double mediaVetor = somaVetores / vetorReais.length;
        
        return mediaVetor;
    }

    private void imprimirValores(double mediaVetor, double vetorReais[]) {

        for (int i = 0; i < vetorReais.length; i++ )
            if (vetorReais[i] > mediaVetor)
                System.out.println("O valor " + vetorReais[i] + " de indíce " + i + " é maior que a média.");

    }

    public Uni07Exe02B () {
        Scanner sc = new Scanner(System.in);
        double vetorReais [] = lerVetor(sc);
        double somaVetores = somarVetor(vetorReais);
        double mediaVetor = calcularMediaVetor(vetorReais, somaVetores);
        System.out.println("A média de valores do vetor é: " + mediaVetor);
        imprimirValores(mediaVetor, vetorReais);
    }

    public static void main(String[] args) {
        new Uni07Exe02B();
    }
}

/*
============================
----= Valores de Teste -----
============================
Caso 01:
* Entradas:
vetorReais[i] = 1,2,3,4,5,6,7,8,9,10,11,12
* Saídas:
A média de valores do vetor é: 6.5
O valor 7.0 de indíce 6 é maior que a média.
O valor 8.0 de indíce 7 é maior que a média.
O valor 9.0 de indíce 8 é maior que a média.
O valor 10.0 de indíce 9 é maior que a média.
O valor 11.0 de indíce 10 é maior que a média.
O valor 12.0 de indíce 11 é maior que a média.
============================
Caso 02:
* Entradas:
vetorReais[i] = 5,5,5,5,5,5,5,5,5,5,5,5
* Saídas:
A média de valores do vetor é: 5.0
============================
*/