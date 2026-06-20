/*

__ Enunciado: 

Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:

“1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
“2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
“3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). 
Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;
“4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. 
A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
“5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
“6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
“7 – Inverter valores”: desafio (ver abaixo);
“8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.
O menu deve-se repetir até que o usuário escolha a opção 8.

__ Análise: OK

__ Gordura: faça um programa que

__ Entradas:

int opcao = lerOpcao(sc)

lerOpcao(sc) {

    ler(opcao)

    retornar opcao

}

__ Processos:

Uni07Exe10B() {

    Scanner sc = new Scanner(System.in)

    faça {

        imprimirMenu()

        int opcao = lerOpcao(sc)

        executarOpcao(sc, opcao)

    } enquanto opcao != 8

}

executarOpcao(sc, opcao) {

    escolha(opcao)

    caso 1:
        incluirValor(sc)

    caso 2:
        pesquisarValor(sc)

    caso 3:
        alterarValor(sc)

    caso 4:
        excluirValor(sc)

    caso 5:
        mostrarValores()

    caso 6:
        ordenarValores()

    caso 7:
        inverterValores()

    caso 8:
        imprimir("Sistema encerrado.")

}

incluirValor(sc) {

    se tamanhoLogico < vetor.length {

        ler(valor)

        vetor[tamanhoLogico] = valor

        tamanhoLogico++

        imprimir("Valor incluído com sucesso.")

    } se não {

        imprimir("Vetor cheio.")

    }

}

pesquisarValor(sc) {

    ler(pesquisar)

    encontrado = false

    Para i < tamanhoLogico, i++ {

        se vetor[i] == pesquisar {

            encontrado = true

        }

    }

    se encontrado {

        imprimir("Valor encontrado.")

    } se não {

        imprimir("Valor não encontrado.")

    }

}

alterarValor(sc) {

    ler(antigo)

    ler(novo)

    alterado = false

    Para i < tamanhoLogico, i++ {

        se vetor[i] == antigo {

            vetor[i] = novo

            alterado = true

            quebrar

        }

    }

    se alterado {

        imprimir("Valor alterado.")

    } se não {

        imprimir("Número não encontrado.")

    }

}

excluirValor(sc) {

    ler(excluir)

    excluido = false

    Para i < tamanhoLogico, i++ {

        se vetor[i] == excluir {

            Para j = i até tamanhoLogico - 1 {

                vetor[j] = vetor[j + 1]

            }

            tamanhoLogico--

            excluido = true

            quebrar

        }

    }

}

ordenarValores() {

    Para i < tamanhoLogico - 1, i++ {

        Para j < tamanhoLogico - 1 - i, j++ {

            se vetor[j] > vetor[j + 1] {

                trocar valores

            }

        }

    }

}

inverterValores() {

    Para i < tamanhoLogico / 2, i++ {

        trocar vetor[i] com vetor[tamanhoLogico - 1 - i]

    }

}

__ Saídas:

imprimirMenu()

imprimir("Valor incluído com sucesso.")

imprimir("Valor encontrado.")

imprimir("Valor alterado.")

imprimir("Valor excluído.")

mostrarValores() {

    imprimir("Valores do vetor:")

    Para i < tamanhoLogico, i++ {

        imprimir(vetor[i])

    }

}

imprimir("Vetor ordenado.")

imprimir("Vetor invertido.")

imprimir("Sistema encerrado.")

*/

import java.util.Scanner;

public class Uni07Exe10B {

    private int vetor[] = new int[50];
    private int tamanhoLogico = 0;

    private void imprimirMenu() {
        System.out.println("\n========= MENU =========");
        System.out.println("1 - Incluir valor");
        System.out.println("2 - Pesquisar valor");
        System.out.println("3 - Alterar valor");
        System.out.println("4 - Excluir valor");
        System.out.println("5 - Mostrar valores");
        System.out.println("6 - Ordenar valores");
        System.out.println("7 - Inverter valores");
        System.out.println("8 - Sair");
        System.out.println("========================");
    }

    private int lerOpcao(Scanner sc) {
        int opcao = sc.nextInt();

        return opcao;
    }

    private void incluirValor(Scanner sc) {
        if (tamanhoLogico < vetor.length) {
            System.out.println("Digite um valor:");
            int valor = sc.nextInt();

            vetor[tamanhoLogico] = valor;
            tamanhoLogico++;

            System.out.println("Valor incluído com sucesso.");
        } else {
            System.out.println("Vetor cheio.");
        }
    }

    private void pesquisarValor(Scanner sc) {
        System.out.println("Digite o valor para pesquisar:");
        int pesquisar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < tamanhoLogico; i++) {
            if (vetor[i] == pesquisar) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado.");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    private void alterarValor(Scanner sc) {
        System.out.println("Digite o valor que deseja alterar:");
        int antigo = sc.nextInt();

        System.out.println("Digite o novo valor:");
        int novo = sc.nextInt();

        boolean alterado = false;

        for (int i = 0; i < tamanhoLogico; i++) {
            if (vetor[i] == antigo) {
                vetor[i] = novo;
                alterado = true;
                break;
            }
        }

        if (alterado) {
            System.out.println("Valor alterado.");
        } else {
            System.out.println("Número não encontrado.");
        }
    }

    private void excluirValor(Scanner sc) {
        System.out.println("Digite o valor para excluir:");
        int excluir = sc.nextInt();

        boolean excluido = false;

        for (int i = 0; i < tamanhoLogico; i++) {
            if (vetor[i] == excluir) {
                for (int j = i; j < tamanhoLogico - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }

                tamanhoLogico--;
                excluido = true;
                break;
            }
        }

        if (excluido) {
            System.out.println("Valor excluído.");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    private void mostrarValores() {
        System.out.println("Valores do vetor:");

        for (int i = 0; i < tamanhoLogico; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
    }

    private void ordenarValores() {
        for (int i = 0; i < tamanhoLogico - 1; i++) {
            for (int j = 0; j < tamanhoLogico - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado.");
    }

    private void inverterValores() {
        for (int i = 0; i < tamanhoLogico / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanhoLogico - 1 - i];
            vetor[tamanhoLogico - 1 - i] = temp;
        }

        System.out.println("Vetor invertido.");
    }

    private void executarOpcao(Scanner sc, int opcao) {
        switch (opcao) {
            case 1:
                incluirValor(sc);
                break;

            case 2:
                pesquisarValor(sc);
                break;

            case 3:
                alterarValor(sc);
                break;

            case 4:
                excluirValor(sc);
                break;

            case 5:
                mostrarValores();
                break;

            case 6:
                ordenarValores();
                break;

            case 7:
                inverterValores();
                break;

            case 8:
                System.out.println("Sistema encerrado.");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    public Uni07Exe10B() {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            imprimirMenu();
            opcao = lerOpcao(sc);
            executarOpcao(sc, opcao);
        } while (opcao != 8);

        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe10B();
    }
}

/*
============================
----= Valores de Teste -----
============================
Caso 01:
* Entradas:
opcao = 1
valor = 10
opcao = 1
valor = 5
opcao = 5
* Saídas:
Valor incluído com sucesso.
Valor incluído com sucesso.
Valores do vetor:
10 5
============================
Caso 02:
* Entradas:
opcao = 1
valor = 8
opcao = 1
valor = 3
opcao = 6
opcao = 5
* Saídas:
Vetor ordenado.
Valores do vetor:
3 8
============================
Caso 03:
* Entradas:
opcao = 1
valor = 4
opcao = 4
excluir = 4
* Saídas:
Valor excluído.
============================
*/