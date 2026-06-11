/*

___ Enunciado: 

Dada uma frase, onde cada palavra é separada por no mínimo um espaço em branco, faça um programa que, 
com base em um subprograma, imprima a frase e cada palavra da frase juntamente com o número de caracteres 
da palavra (veja exemplo a seguir): ISTO É UM TESTE ISTO 4 É 1 UM 2 TESTE 5

__ Análise: OK

__ Gordura: faça um programa que

__ Entradas:

metodo privado com retorno de string lerFrase(com scanner sc como parametro) {
    ler(frase);
    retorne frase;
}

__ Processos:

metodo privado com retorno de int contarLetrasPalavras(com string frase como parametro) {
    contadorLetra = 0;
    String[] palavras = frase.split(" ");

    Para (int i = 0; i menor que palavras.length; i++){
        contadorLetra = palavras[i].length();
        imprimir(palavras[i] + " " + contadorLetra + " ");
    }
}

__ Saídas:

**impressão realizada dentro do metodo**

*/

import java.util.Scanner;
public class Uni07Exe03 {

    private String lerFrase (Scanner sc) {
        System.out.println("Digite a frase:");
        String frase = sc.nextLine().toUpperCase();
        return frase;
    }

    private void contarLetrasPalavras(String frase) {
        int contadorLetra = 0;
        String[] palavras = frase.split(" ");

        for (int i = 0; i < palavras.length; i++) {
            contadorLetra = palavras[i].length();
            System.out.print(palavras[i] + " " + contadorLetra + " " );
            
        }

    }
    
    public Uni07Exe03() {
        Scanner sc = new Scanner(System.in);
        String frase = lerFrase(sc);
        System.out.println(frase);
        contarLetrasPalavras(frase);
        sc.close();

    }
    
    public static void main(String[] args) {
        new Uni07Exe03();
    }
}
