/*

__ Enunciado:

Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. 
Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. 
Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. 
Informe para o usuário se este valor informado se encontra cadastrado no vetor.

__ Análise: OK

__ Gorduras: Faça um programa que

__ Entradas:

int numeroIndices = lerNumeroIndices(sc)

double vetorReais[] = lerVetor(sc, numeroIndices)

double valorEncontrar = lerValorEncontrar(sc)

__ Processos:

Uni07Exe06B() {

    Scanner sc = new Scanner(System.in)

    int numeroIndices = lerNumeroIndices(sc)

    double vetorReais[] = lerVetor(sc, numeroIndices)

    double valorEncontrar = lerValorEncontrar(sc)

    boolean encontrado = verificarValor(vetorReais, valorEncontrar)

    imprimirResultado(encontrado, valorEncontrar)

}

verificarValor(vetorReais[], valorEncontrar) {

    boolean encontrado = false

    Para i < tamanho do vetor, i++ {

        se valorEncontrar == vetorReais[i] {

            encontrado = true

            quebrar

        } se não {

            encontrado = false

        }

    }

    retornar encontrado

}

__ Saídas:

imprimirResultado(encontrado, valorEncontrar) {

    se encontrado == true {

        imprimir("Valor " + valorEncontrar + " encontrado no Vetor!")

    } se não {

        imprimir("Valor " + valorEncontrar + " não encontrado no Vetor!")

    }

}

*/

import java.util.Scanner;

public class Uni07Exe06B {

    private int lerNumeroIndices(Scanner sc) {
        System.out.println("Insira a quantidade de indíces do vetor:");
        int numeroIndices = sc.nextInt();

        return numeroIndices;
    }

    private double[] lerVetor(Scanner sc, int numeroIndices) {
        double vetorReais[] = new double[numeroIndices];

        for (int i = 0; i < vetorReais.length; i++) {
            System.out.println("Insira o valor real ao vetor:");
            vetorReais[i] = sc.nextDouble();
        }

        return vetorReais;
    }

    private double lerValorEncontrar(Scanner sc) {
        System.out.println("Digite o valor que deseja encontrar:");
        double valorEncontrar = sc.nextDouble();

        return valorEncontrar;
    }

    private boolean verificarValor(double vetorReais[], double valorEncontrar) {
        boolean encontrado = false;

        for(int i = 0; i < vetorReais.length; i++) {
            if(valorEncontrar == vetorReais[i]) {
                encontrado = true;
                break;
            } else {
                encontrado = false;                                           
            }
        }

        return encontrado;
    }

    private void imprimirResultado(boolean encontrado, double valorEncontrar) {
        if (encontrado == true) {
            System.out.println("Valor " +  valorEncontrar + " encontrado no Vetor!");
        } else {
            System.out.println("Valor " + valorEncontrar + " não encontrado no Vetor!");
        }
    }

    public Uni07Exe06B() {
        Scanner sc = new Scanner(System.in);
        
        int numeroIndices = lerNumeroIndices(sc);
        double vetorReais[] = lerVetor(sc, numeroIndices);
        double valorEncontrar = lerValorEncontrar(sc);
        boolean encontrado = verificarValor(vetorReais, valorEncontrar);
        imprimirResultado(encontrado, valorEncontrar);

        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe06B();
    }
}

/*
============================
----= Valores de Teste -----
============================
Caso 01:
* Entradas:
numeroIndices = 4
vetorReais[i] = 1,5,19,43 
encontrar =  19
* Saídas:
Valor 19.0 encontrado no Vetor!
=============================
Caso 02:
* Entradas:
numeroIndices = 5
vetorReais[i] = 4,5,2,28,34
encontrar = 43
* Saídas:
Valor 43.0 não encontrado no Vetor!
============================
*/