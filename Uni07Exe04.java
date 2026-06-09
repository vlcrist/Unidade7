/*

__ Enunciado:

Dado um texto qualquer faça um programa que, através de subprogramas: a) forneça o número de vogais do texto. 
b) informe o valor numérico que aparece no início do texto. Informe 0 (zero) se no início não há valor numérico 
(ver exemplos abaixo): "27C1" - valor numérico = 27 "134" - valor numérico = 134 "XYZ" - valor numérico = 0 "B21" - valor numérico = 0 
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
    
    

    public Uni07Exe04 () {
        Scanner sc = new Scanner(System.in);
        String frase = lerFrase(sc);
        int quantidade = contarVogais(frase);
        System.out.println("Quantidade de vogais = " + quantidade);


        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe04();
    }
}
