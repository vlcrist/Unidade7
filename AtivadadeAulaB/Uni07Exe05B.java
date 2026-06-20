/*

__ Enunciado: Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça 
cada um respondeu um questionário com 5 perguntas, como por exemplo:

Gosta de música sertaneja?
Gosta de futebol?
Gosta de seriados?
Gosta de redes sociais?
Gosta da Oktoberfest?
A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é medido da seguinte maneira:

se ambos deram a mesma resposta soma-se 3 pontos ao índice;
se um respondeu IND e o outro SIM ou NÃO soma-se 1;
se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.

Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas da moça. 
Por fim, escreva a afinidade considerando os seguintes intervalos

Afinidade   Mensagem
15          “Casem!
10 a 14     “Vocês têm muita coisa em comum!”
5 a 9       “Talvez não dê certo :(”
0 a 4       “Vale um encontro.”
-1 a -9     “Melhor não perder tempo”
-10         “Vocês se odeiam!”

__ Análise: OK

__ Gordura: *null

__ Entradas:

String vetorRespostasHomem[] = new String[5]

String vetorRespostasMulher[] = new String[5]

lerRespostas(sc, vetorRespostasHomem, vetorRespostasMulher)

__ Processos:

Uni07Exe05B() {

    Scanner sc = new Scanner(System.in)

    String vetorRespostasHomem[] = new String[5]

    String vetorRespostasMulher[] = new String[5]

    lerRespostas(sc, vetorRespostasHomem, vetorRespostasMulher)

    int valorAfinidade = calcularAfinidade(vetorRespostasHomem, vetorRespostasMulher)

    imprimirResultado(valorAfinidade)

}

calcularAfinidade(vetorRespostasHomem[], vetorRespostasMulher[]) {

    int valorAfinidade = 0

    Para i < tamanho do vetor, i++ {

        vetorRespostasHomem[i] = vetorRespostasHomem[i].toUpperCase()

        vetorRespostasMulher[i] = vetorRespostasMulher[i].toUpperCase()

        se vetorRespostasHomem[i].equals(vetorRespostasMulher[i]) {

            valorAfinidade = valorAfinidade + 3

        } se não se vetorRespostasHomem[i].equals("IND") &&
        (vetorRespostasMulher[i].equals("SIM") ||
        vetorRespostasMulher[i].equals("NAO")) {

            valorAfinidade = valorAfinidade + 1

        } se não se vetorRespostasMulher[i].equals("IND") &&
        (vetorRespostasHomem[i].equals("SIM") ||
        vetorRespostasHomem[i].equals("NAO")) {

            valorAfinidade = valorAfinidade + 1

        } se não {

            valorAfinidade = valorAfinidade - 2

        }

    }

    retornar valorAfinidade

}

__ Saídas:

imprimirResultado(valorAfinidade) {

    imprimir("Baseando-se nas suas respostas seu nível de afinidade é:")

    imprimir(valorAfinidade + "!")

    se valorAfinidade <= -10 {

        imprimir("Vocês se odeiam!")

    } se não se valorAfinidade >= -9 && valorAfinidade <= -1 {

        imprimir("Melhor não perder tempo")

    } se não se valorAfinidade >= 0 && valorAfinidade <= 4 {

        imprimir("Vale um encontro")

    } se não se valorAfinidade >= 5 && valorAfinidade <= 9 {

        imprimir("Vocês tem muita coisa em comum!")

    } se não {

        imprimir("Casem!")

    }

}

*/

import java.util.Scanner;

public class Uni07Exe05B {

    private void lerRespostas(Scanner sc, String vetorRespostasHomem[], String vetorRespostasMulher[]) {
        System.out.println("Bem vindo ao programa de cálculo de afinidade!");
        System.out.println("Para cada Pergunta, responda com: Sim, Nao (sem acento) ou Ind (Indiferente)");

        System.out.println("Primeira pergunta:");
        System.out.println("Gosta de música Sertaneja?");
        System.out.println("Resposta do homem:");
        vetorRespostasHomem[0] = sc.next();
        System.out.println("Resposta da mulher:");
        vetorRespostasMulher[0] = sc.next();

        System.out.println("Segunda pergunta:");
        System.out.println("Gosta de futebol?");
        System.out.println("Resposta do homem:");
        vetorRespostasHomem[1] = sc.next();
        System.out.println("Resposta da mulher:");
        vetorRespostasMulher[1] = sc.next();

        System.out.println("Terceira pergunta:");
        System.out.println("Gosta de seriados?");
        System.out.println("Resposta do homem:");
        vetorRespostasHomem[2] = sc.next();
        System.out.println("Resposta da mulher:");
        vetorRespostasMulher[2] = sc.next();

        System.out.println("Quarta pergunta:");
        System.out.println("Gosta de redes sociais?");
        System.out.println("Resposta do homem:");
        vetorRespostasHomem[3] = sc.next();
        System.out.println("Resposta da mulher:");
        vetorRespostasMulher[3] = sc.next();

        System.out.println("Última pergunta:");
        System.out.println("Gosta da Oktoberfest?");
        System.out.println("Resposta do homem:");
        vetorRespostasHomem[4] = sc.next();
        System.out.println("Resposta da mulher:");
        vetorRespostasMulher[4] = sc.next();
    }

    private int calcularAfinidade(String vetorRespostasHomem[], String vetorRespostasMulher[]) {
        int valorAfinidade = 0;

        for (int i = 0; i < vetorRespostasHomem.length; i++) {
            vetorRespostasHomem[i] = vetorRespostasHomem[i].toUpperCase();
            vetorRespostasMulher[i] = vetorRespostasMulher[i].toUpperCase();

            if (vetorRespostasHomem[i].equals(vetorRespostasMulher[i])) {
                valorAfinidade = valorAfinidade + 3;

            } else if (vetorRespostasHomem[i].equals("IND") && 
            (vetorRespostasMulher[i].equals("SIM") || vetorRespostasMulher[i].equals("NAO"))) {
                valorAfinidade = valorAfinidade + 1;

            } else if (vetorRespostasMulher[i].equals("IND") && 
            (vetorRespostasHomem[i].equals("SIM") || vetorRespostasHomem[i].equals("NAO"))) {
                valorAfinidade = valorAfinidade + 1;

            } else {
                valorAfinidade = valorAfinidade - 2;
            }
        }

        return valorAfinidade;
    }

    private void imprimirResultado(int valorAfinidade) {
        System.out.println("Baseando-se nas suas respostas seu nível de afinidade é:");
        System.out.println(valorAfinidade + "!");

        if (valorAfinidade <= -10) {
            System.out.println("Vocês se odeiam!");
        } else if (valorAfinidade >= - 9 && valorAfinidade <= -1) {
            System.out.println("Melhor não perder tempo");
        } else if (valorAfinidade >= 0 && valorAfinidade <= 4) {
            System.out.println("Vale um encontro");
        } else if (valorAfinidade >= 5 && valorAfinidade <= 9) {
            System.out.println("Vocês tem muita coisa em comum!");
        } else {
            System.out.println("Casem!");
        }
    }

    public Uni07Exe05B() {
        Scanner sc = new Scanner(System.in);

        String vetorRespostasHomem[] = new String[5];
        String vetorRespostasMulher[] = new String[5];

        lerRespostas(sc, vetorRespostasHomem, vetorRespostasMulher);

        int valorAfinidade = calcularAfinidade(vetorRespostasHomem, vetorRespostasMulher);

        imprimirResultado(valorAfinidade);

        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe05B();
    }
}

/*
============================
----= Valores de Teste -----
============================
Caso 01:
* Entradas:
Homem:
SIM
SIM
SIM
SIM
SIM
Mulher:
SIM
SIM
SIM
SIM
SIM
* Saídas:
Baseando-se nas suas respostas seu nível de afinidade é:
15!
Casem!
============================
Caso 02:
* Entradas:
Homem:
SIM
NAO
SIM
NAO
SIM
Mulher:
NAO
SIM
NAO
SIM
NAO
* Saídas:
Baseando-se nas suas respostas seu nível de afinidade é:
-10!
Vocês se odeiam!
============================
Caso 03:
* Entradas:
Homem:
SIM
IND
SIM
NAO
IND
Mulher:
SIM
SIM
IND
NAO
NAO
* Saídas:
Baseando-se nas suas respostas seu nível de afinidade é:
11!
Casem!
============================
*/