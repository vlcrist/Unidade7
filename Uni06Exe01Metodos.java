import java.util.Scanner;

public class Uni06Exe01Metodos {

    private void ler (Scanner sc, int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor de indíce " + i);
            vetor[i] = sc.nextInt();
            // Sem necessidade de retorno pelo fato de não ser uma variável primitiva
        }
    }

    private void exibir (int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            // Sem necessidade de retorno pelo fato de não ser uma variável primitiva
        }
    }


    public Uni06Exe01Metodos() {
        int vetor[] = new int[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Lendo vetor...");
        ler(sc, vetor);
        System.out.println("Exibindo vetor...");
        exibir(vetor);

    }

    public static void main(String[] args) {
        new Uni06Exe01Metodos();
    }
}
