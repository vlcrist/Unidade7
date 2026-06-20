/*

__ Enunciado: Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, 
crie um vetor do tipo inteiro. Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, 
até preencher o vetor. Esse número deverá ser armazenado no vetor caso ainda não exista, e se o valor já 
existir deve ser pedido um novo valor. Isto é, se o usuário informar o número 2 e já existir o número 2 
em alguma posição do vetor, o número não deve ser adicionado. Após ter adicionado todos os números dentro 
do vetor, o mesmo deve ser ordenado. Para isso reordene os elementos internos do vetor de modo que este 
fique em ordem crescente, conforme no exemplo:

Vetor origem: [0][4][2][6][3]
Vetor ordenado: [0][2][3][4][6]

__ Análise: OK

__ Gordura: Faça um programa qeu

__ Entradas:

int vetorInteiros[] = lerVetor(sc)

lerVetor(sc) {

    int vetorInteiros[] = new int[20]

    Para i < tamanho do vetor, i++ {

        ler(numero)

    }

    retornar vetorInteiros

}

__ Processos:

Uni07Exe07B() {

    Scanner sc = new Scanner(System.in)

    int vetorInteiros[] = lerVetor(sc)

    imprimir("Vetor Original:")

    imprimirVetor(vetorInteiros)

    vetorInteiros = ordenarVetor(vetorInteiros)

    imprimir("Vetor ordenado:")

    imprimirVetor(vetorInteiros)

}

verificarRepetido(vetorInteiros[], numero, i) {

    boolean repetido = false

    Para j < i, j++ {

        se numero == vetorInteiros[j] {

            repetido = true

            quebrar

        }

    }

    retornar repetido

}

ordenarVetor(vetorInteiros[]) {

    Para i < tamanho do vetor - 1, i++ {

        Para j < tamanho do vetor - 1, j++ {

            se vetorInteiros[j] > vetorInteiros[j + 1] {

                aux = vetorInteiros[j]

                vetorInteiros[j] = vetorInteiros[j + 1]

                vetorInteiros[j + 1] = aux

            }

        }

    }

    retornar vetorInteiros

}

__ Saídas:

imprimirVetor(vetorInteiros[]) {

    Para i < tamanho do vetor, i++ {

        imprimir("[" + vetorInteiros[i] + "]")

    }

}

*/

import java.util.Scanner;

public class Uni07Exe07B {

    private int[] lerVetor(Scanner sc) {
        int vetorInteiros[] = new int[20];

        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println("Digite um número:");
            int numero = sc.nextInt();

            boolean repetido = verificarRepetido(vetorInteiros, numero, i);

            if (repetido  == true) {
                System.out.println("Número já existente! Digite outro.");
                i--;
            } else {
                vetorInteiros[i] = numero;
            }
        }

        return vetorInteiros;
    }

    private boolean verificarRepetido(int vetorInteiros[], int numero, int i) {
        boolean repetido = false;

        for (int j = 0; j < i; j++) {
            if (numero == vetorInteiros[j]) {
                repetido = true;
                break;
            }
        }

        return repetido;
    }

    private int[] ordenarVetor(int vetorInteiros[]) {
        for (int i = 0; i < vetorInteiros.length - 1; i++) {
            for (int j = 0; j < vetorInteiros.length - 1; j++) {
                if (vetorInteiros[j] > vetorInteiros[j + 1]) {
                    int aux = vetorInteiros[j];
                    vetorInteiros[j] = vetorInteiros[j + 1];
                    vetorInteiros[j + 1] = aux;
                }
            }
        }

        return vetorInteiros;
    }

    private void imprimirVetor(int vetorInteiros[]) {
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print("[" + vetorInteiros[i] + "] ");
        }
    }

    public Uni07Exe07B() {
        Scanner sc = new Scanner(System.in);

        int vetorInteiros[] = lerVetor(sc);

        System.out.println("Vetor Original:");
        imprimirVetor(vetorInteiros);

        vetorInteiros = ordenarVetor(vetorInteiros);

        System.out.println("\nVetor ordenado:");
        imprimirVetor(vetorInteiros);

        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe07B();
    }
}

/*
============================
----= Valores de Teste -----
============================
Caso 01:
* Entradas:
numero = 5
numero = 2
numero = 9
* Saídas:
Vetor Original:
[5] [2] [9]....
Vetor ordenado:
[2] [5] [9]...
============================
Caso 02:
* Entradas:
numero = 4
numero = 4
numero = 7
numero = 1
* Saídas:
Número já existente! Digite outro.
Vetor Original:
[4] [7] [1]...
Vetor ordenado:
[1] [4] [7]...
============================
*/