/*

__ Enunciado:

Dado um texto qualquer faça um programa que, através de subprogramas: a) forneça o número de vogais do texto. 
b) informe o valor numérico que aparece no início do texto. Informe 0 (zero) se no início não há valor numérico 
(ver exemplos abaixo): 
"27C1" - valor numérico = 27 
"134" - valor numérico = 134 
"XYZ" - valor numérico = 0 
"B21" - valor numérico = 0 
c) forneça a posição de início de uma palavra dentro do texto.

__ Análise: OK

__ Gorduras: faça um programa que

__ Entradas:

__ Processos:

__ Saídas:

*/
import java.util.Scanner;
public class Uni07Exe04 {
    
    private String lerFrase (Scanner sc) {
        System.out.println("Digite um texto qualquer");
        String frase = sc.nextLine().toUpperCase();
        return frase;
    }

     private String lerPalavra (Scanner sc) {
        System.out.println("Digite a palavra a ser encontrada: ");
        String palavra = sc.nextLine().toUpperCase();
        return palavra;
    }

    private int contarVogais(String frase) {
        int contadorVogais = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || 
                frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U') {
                    contadorVogais++;
            } 
        }
        return contadorVogais;
    }

    private int informeNumerico(String frase) {
        int valorNumerico = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i))) {
                // Character.getNumericValue() converte o caractere numérico para seu valor inteiro correspondente
                // Multiplicamos o valor atual por 10 para deslocar os dígitos anteriores para a esquerda e adicionamos o novo dígito
                valorNumerico = valorNumerico * 10 + Character.getNumericValue(frase.charAt(i));
            } else {
                break;
            }
        }
        return valorNumerico;
    }

    private int posicaoInicioPalavra(String texto, String palavra) {

        for (int i = 0; i <= texto.length() - palavra.length(); i++) {

            boolean encontrou = true;

            for (int j = 0; j < palavra.length(); j++) {

                if (texto.charAt(i + j) != palavra.charAt(j)) {
                    encontrou = false;
                    break;
                }
            }

            if (encontrou) {
                return i;
            }
        }

        return -1;
    }
    
    

    public Uni07Exe04 () {
        Scanner sc = new Scanner(System.in);
        String frase = lerFrase(sc);
        int quantidade = contarVogais(frase);
        System.out.println("Quantidade de vogais = " + quantidade);
        int valorNumerico = informeNumerico(frase);
        System.out.println("Valor numérico no início do texto = " + valorNumerico);
        String palavra = lerPalavra(sc);
        posicaoInicioPalavra(frase, palavra);
        System.out.println("Posição de início da palavra no texto = " + posicaoInicioPalavra(frase, palavra));
        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe04();
    }
}
