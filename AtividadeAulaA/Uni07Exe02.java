/*

__ Enunciado:

Dada uma frase e uma palavra faça um programa que, com base em um subprograma, 
informe quantas vezes a palavra aparece na frase. Desconsidere o uso de pontuação na frase.

__ Análise: OK

__ Gordura: faça um programa que

__ Entradas:

metodo privado com retorno de string lerFrase(com Scanner sc como parametro) {
    ler(frase);
    retorne frase;
}

metodo privado com retorno de string lerPalavra(com Scanner sc como parametro) {
    ler(palavra);
    retorne palavra;
}

__ Processos:

metodo privado com retorno de inteiro contarPalavras(com string palavra e string frase como parametros) {
    contadorPalavra = 0;
    palavras = frase.split(" ");
    para i de 0 ate palavras.length faca {
        se palavra.equals(palavras[i]) entao {
            contadorPalavra++;
        }
    }
    retorne contadorPalavra;
}

__ Saídas:

metodo privado sem retorno exibirResultado(com string palavra, string frase e inteiro quantidade como parametros) {
    imprimir("A palavra " + palavra + " aparece " + quantidade + " vezes na frase");
}
*/

import java.util.Scanner;
public class Uni07Exe02 {

    private String lerFrase (Scanner sc) {
        System.out.println("Digite a frase:");
        String frase = sc.nextLine().toUpperCase();
        return frase;
    }

    private String lerPalavra (Scanner sc) {
        System.out.println("Digite a palavra:");
        String palavra = sc.nextLine().toUpperCase();
        return palavra;
    }

    private int contarPalavras (String palavra, String frase) {
        int contadorPalavra = 0;
        // Utilizando o .split (divide a string em um vetor de strings, utilizando o parametro dentro do () como divisor)
        String[] palavras = frase.split(" ") ;

        for (int i = 0; i < palavras.length; i++) {
            if (palavra.equals(palavras[i])) {
                contadorPalavra++;
            }
        }

        return contadorPalavra;
    }

    private void exibirResultado (String palavra, String frase, int quantidade) {
        System.out.println("A palavra " + palavra + " aparece " + quantidade + " vezes na frase");
    }

    public Uni07Exe02() {
        Scanner sc = new Scanner(System.in);
        String frase = lerFrase(sc);
        String palavra = lerPalavra(sc);
        int quantidade = contarPalavras(palavra, frase);
        exibirResultado(palavra, frase, quantidade);
        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe02();
    }

}
