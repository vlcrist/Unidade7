/*

__ Enunciado:

Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, 
crie um vetor do tipo real. Faça o usuário informar valores para as posições deste vetor e 
coloque-as nas posições na sequência informada pelo usuário. Imprima uma tabela contendo cada 
valor diferente e o número de vezes que o valor aparece no vetor.

__ Análise: OK

__ Gordura: Faça um program que

__ Entradas:

double vetorInteiros[] = lerVetor(sc)

lerVetor(sc) {

    double vetorInteiros[] = new double[20]

    Para i < tamanho do vetor, i++ {

        ler(numero)

        ler(posicao)

    }

    retornar vetorInteiros

}

__ Processos:

Uni07Exe08B() {

    Scanner sc = new Scanner(System.in)

    double vetorInteiros[] = lerVetor(sc)

    imprimir("Vetor ordenado pelo usuário:")

    imprimirVetor(vetorInteiros)

    imprimirFrequencia(vetorInteiros)

}

lerVetor(sc) {

    Para i < tamanho do vetor, i++ {

        se vetorInteiros[posicao] == 0 {

            se posicao >= 0 && posicao <= 19 {

                vetorInteiros[posicao] = numero

            } se não {

                imprimir("Posição inválida! Digite o valor e a posição novamente:")

                i--

            }

        } se não {

            imprimir("Posição repetida! Digite o valor e a posição novamente:")

            i--

        }

    }

}

__ Saídas:

imprimirVetor(vetorInteiros[])

imprimirFrequencia(vetorInteiros[]) {

    imprimir("VALOR   //   FREQUÊNCIA")

    Para i < tamanho do vetor, i++ {

        contagemNumero = 0

        contado = false

        Para j < i, j++ {

            se vetorInteiros[i] == vetorInteiros[j] {

                contado = true

            }

        }

        se contado == true {

            continuar

        }

        Para j < tamanho do vetor, j++ {

            se vetorInteiros[i] == vetorInteiros[j] {

                contagemNumero++

            }

        }

        imprimir(vetorInteiros[i] + "    //    " + contagemNumero)

    }

}

*/

import java.util.Scanner;

public class Uni07Exe08B {

    private double[] lerVetor(Scanner sc) {
        double numero = 0;
        int posicao = 0;
        double vetorInteiros[] = new double [20];

        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println("Insira um valor inteiro (maior do que zero):");
            numero = sc.nextInt();
            System.out.println("Insira a posição do número (de 0 à 19):");
            posicao = sc.nextInt();

            if (vetorInteiros[posicao] == 0) {
                if (posicao >= 0 && posicao <= 19) {
                    vetorInteiros[posicao] = numero;
                } else {
                    System.out.println("Posição inválida! Digite o valor e a posição novamente:");
                    i--;
                }
            } else {
                System.out.println("Posição repetida! Digite o valor e a posição novamente:");
                i--;
            }
        }

        return vetorInteiros;
    }

    private void imprimirVetor(double vetorInteiros[]) {
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print("[" + vetorInteiros[i] + "] ");
        }
    }

    private void imprimirFrequencia(double vetorInteiros[]) {
        int contagemNumero = 0;
        boolean contado = false;

        System.out.println("\nVALOR   //   FREQUÊNCIA");

        for (int i = 0; i < vetorInteiros.length; i++) {
            contagemNumero = 0;
            contado = false;
            
            for (int j = 0; j < i; j++) {
                if (vetorInteiros[i] == vetorInteiros[j]) {
                    contado = true;
                }
            }

            if (contado == true) {
                continue;
            } 

            for (int j = 0; j < vetorInteiros.length; j++) {
                if (vetorInteiros[i] == vetorInteiros[j]) {
                    contagemNumero++;
                }
            }
 
            System.out.println(vetorInteiros[i] + "    //    " + contagemNumero);
        }
    }

    public Uni07Exe08B() {
        Scanner sc = new Scanner(System.in);

        double vetorInteiros[] = lerVetor(sc);

        System.out.println("Vetor ordenado pelo usuário:");
        imprimirVetor(vetorInteiros);

        imprimirFrequencia(vetorInteiros);

        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe08B();
    }
}

/*
============================
----= Valores de Teste -----
============================
Caso 01:
* Entradas:
numero = 5
posicao = 0
numero = 3
posicao = 1
numero = 5
posicao = 2
numero = 7
posicao = 3
numero = 3
posicao = 4
numero = 5
posicao = 5
* Saídas:
Vetor ordenado pelo usuário:
[5.0] [3.0] [5.0] [7.0] [3.0] [5.0]
VALOR   //   FREQUÊNCIA
5.0    //    3
3.0    //    2
7.0    //    1
============================
Caso 02:
* Entradas:
numero = 4
posicao = 0
numero = 8
posicao = 0
* Saídas:
Posição repetida! Digite o valor e a posição novamente:
============================
*/