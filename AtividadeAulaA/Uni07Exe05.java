/*

__ Enunciado:

Faça um programa que leia várias expressões aritméticas e, com base em subprogramas, escreva: 
a) informe se cada expressão aritmética está correta sintaticamente em relação ao número de parênteses utilizados;
b) para cada expressão aritmética informe o número de divisões e multiplicações utilizadas; 
c) informe a posição do primeiro operador aritmético de cada expressão.



*/

import java.util.Scanner;

public class Uni07Exe05 {

    private String lerExpr(Scanner sc) {
        System.out.println("Insira a expressão aritmética abaixo: ");
        String expr = sc.nextLine();
        return expr;
    }


    private boolean verificaParenteses(String expr) {
        int cont = 0;

        for (int i = 0; i < expr.length(); i++) {

            if (expr.charAt(i) == '(') {
                cont++;
            }

            if (expr.charAt(i) == ')') {
                cont--;

                if (cont < 0) {
                    return false;
                }
            }
        }

        return cont == 0;
    }

    private int contaMultiplicacoes(String expr) {
        int cont = 0;

        for (int i = 0; i < expr.length(); i++) {

            if (expr.charAt(i) == '*') {
                cont++;
            }
        }

        return cont;
    }

    private int contaDivisoes(String expr) {
        int cont = 0;

        for (int i = 0; i < expr.length(); i++) {

            if (expr.charAt(i) == '/') {
                cont++;
            }
        }

        return cont;
    }

    private int primeiroOperador(String expr) {

        for (int i = 0; i < expr.length(); i++) {

            char c = expr.charAt(i);

            if (c == '+' || c == '-' || c == '*' || c == '/') {
                return i;
            }
        }

        return -1;
    }


    public Uni07Exe05 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de análise de expressão aritmética!");
        String expr = lerExpr(sc);
        boolean parenteseCerto = verificaParenteses(expr);
        int contagemMultiplicacoes = contaMultiplicacoes(expr);
        int contagemDivisoes = contaDivisoes(expr);
        int indexPrimeiroOperador = primeiroOperador(expr);

        System.out.println("A expressão: \n" + expr + "\nTem os parenteses corretos? " + parenteseCerto + "\nA contagem de Multiplicações é: " + contagemMultiplicacoes + "\nA contagem de Divisões é: " + contagemDivisoes + "\nA posição do primeiro operador é: " + indexPrimeiroOperador);
        


        sc.close();
    }



    public static void main(String[] args) {
        new Uni07Exe05();
    }
}
