/*

__ Enunciado: Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. 
Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), 
uma nota para o cinema (zero até dez, valor inteiro) e a idade.

Baseado nisto faça um programa que informe:

qual a nota média recebida pelo cinema;
qual a nota média atribuída pelos homens;
qual a nota atribuída pela mulher mais jovem;
quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz).

__ Análise: OK

__ Gordura: faca um programa que

__ Entradas:

int sexo[] = new int[30]

int nota[] = new int[30]

int idade[] = new int[30]

lerDados(sc, sexo, nota, idade)

__ Processos:

Uni07Exe09B() {

    Scanner sc = new Scanner(System.in)

    int sexo[] = new int[30]

    int nota[] = new int[30]

    int idade[] = new int[30]

    lerDados(sc, sexo, nota, idade)

    double mediaCinema = calcularMediaCinema(nota)

    double mediaHomens = calcularMediaHomens(sexo, nota)

    int notaMulherMaisJovem = encontrarNotaMulherMaisJovem(sexo, nota, idade)

    int qtdMulheres50 = contarMulheres50(sexo, nota, idade, mediaCinema)

    imprimirResultados(mediaCinema, mediaHomens, notaMulherMaisJovem, qtdMulheres50)

}

__ Saídas:

imprimirResultados(mediaCinema, mediaHomens, notaMulherMaisJovem, qtdMulheres50) {

    imprimir("Média geral do cinema: " + mediaCinema)

    imprimir("Média das notas dos homens: " + mediaHomens)

    imprimir("Nota da mulher mais jovem: " + notaMulherMaisJovem)

    imprimir("Mulheres acima de 50 com nota acima da média: " + qtdMulheres50)

}

*/

import java.util.Scanner;

public class Uni07Exe09B {

    private void lerDados(Scanner sc, int sexo[], int nota[], int idade[]) {
        for (int i = 0; i < 30; i++) {
            System.out.println("Pessoa " + (i + 1));

            System.out.println("Sexo (1=feminino 2=masculino):");
            sexo[i] = sc.nextInt();

            System.out.println("Nota do cinema (0 a 10):");
            nota[i] = sc.nextInt();

            System.out.println("Idade:");
            idade[i] = sc.nextInt();

            System.out.println();
        }
    }

    private double calcularMediaCinema(int nota[]) {
        double somaCinema = 0;

        for (int i = 0; i < 30; i++) {
            somaCinema += nota[i];
        }

        double mediaCinema = somaCinema / 30;

        return mediaCinema;
    }

    private double calcularMediaHomens(int sexo[], int nota[]) {
        double somaHomens = 0;
        int qtdHomens = 0;

        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 2) {
                somaHomens += nota[i];
                qtdHomens++;
            }
        }

        double mediaHomens = somaHomens / qtdHomens;

        return mediaHomens;
    }

    private int encontrarNotaMulherMaisJovem(int sexo[], int nota[], int idade[]) {
        int menorIdadeMulher = Integer.MAX_VALUE;
        int notaMulherMaisJovem = 0;

        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 1) {
                if (idade[i] < menorIdadeMulher) {
                    menorIdadeMulher = idade[i];
                    notaMulherMaisJovem = nota[i];
                }
            }
        }

        return notaMulherMaisJovem;
    }

    private int contarMulheres50(int sexo[], int nota[], int idade[], double mediaCinema) {
        int qtdMulheres50 = 0;

        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 1 &&
                idade[i] > 50 &&
                nota[i] > mediaCinema) {

                qtdMulheres50++;
            }
        }

        return qtdMulheres50;
    }

    private void imprimirResultados(double mediaCinema, double mediaHomens, int notaMulherMaisJovem, int qtdMulheres50) {
        System.out.println("Média geral do cinema: " + mediaCinema);
        System.out.println("Média das notas dos homens: " + mediaHomens);
        System.out.println("Nota da mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Mulheres acima de 50 com nota acima da média: " + qtdMulheres50);
    }

    public Uni07Exe09B() {
        Scanner sc = new Scanner(System.in);

        int sexo[] = new int[30];
        int nota[] = new int[30];
        int idade[] = new int[30];

        lerDados(sc, sexo, nota, idade);

        double mediaCinema = calcularMediaCinema(nota);
        double mediaHomens = calcularMediaHomens(sexo, nota);
        int notaMulherMaisJovem = encontrarNotaMulherMaisJovem(sexo, nota, idade);
        int qtdMulheres50 = contarMulheres50(sexo, nota, idade, mediaCinema);

        imprimirResultados(mediaCinema, mediaHomens, notaMulherMaisJovem, qtdMulheres50);

        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe09B();
    }
}

/*
============================
----= Valores de Teste -----
============================
Caso 01:
* Entradas:
sexo = 1
nota = 8
idade = 20
sexo = 2
nota = 6
idade = 35
...
* Saídas:
Média geral do cinema: 7.0
Média das notas dos homens: 6.0
Nota da mulher mais jovem: 8
Mulheres acima de 50 com nota acima da média: 2
============================
*/