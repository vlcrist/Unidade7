/*

__ Enunciado: 

Dada uma letra minúscula e uma frase em letras minúsculas faça um programa que, 
com base em um subprograma, informe quantas vezes a letra aparece na frase.

__ Análise: OK

__ Gordura: faça um program que

__ Entradas:

ler(letra)
ler(frase)

__ Processos:

subrotina contarLetras (char letra, String frase) {
    int contadorLetra = 0
    para i = 0 até frase.length(), i ++
        se letra == frase.charAt(i) {
            contadorLetra++
        }
}


        

*/

import java.util.Scanner;

public class Uni07Exe01B {
   
    private int contarLetras (char letra, String frase) {
   
        int contadorLetra = 0; 

        for (int i = 0; i < frase.length(); i++) {

            if (letra == frase.charAt(i)) {

                contadorLetra++;
            } 
        }

        return contadorLetra;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite uma letra");
        char letra = sc.next().toUpperCase().charAt(0);

        sc.nextLine(); 

        System.out.println("Digte uma frase");
        String frase = sc.nextLine().toUpperCase();
 
        Uni07Exe01B exercicio = new Uni07Exe01B(); // Oq isso faz?

        int quantidade = exercicio.contarLetras (letra, frase);

        System.out.println("A letra " + letra + " aparece " +
                quantidade + " vezes na frase");

        sc.close();
        
    }
}