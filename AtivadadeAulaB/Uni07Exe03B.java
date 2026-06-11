/*

        Scanner sc = new Scanner(System.in);

        // Entradas (criação do vetor)
        double vetorReais[] = new double[12];

        // Processos
        for (int i = 0; i < vetorReais.length; i++) {
            System.out.println("Insira o número real de indíce " +  i + " no vetor.");
            vetorReais[i] = sc.nextDouble();

            if(i %2 == 0) {
                vetorReais[i] = vetorReais[i] * 1.2;
            } else {
                vetorReais[i] = vetorReais[i] * 1.5;
            }
        }
        System.out.println(Arrays.toString(vetorReais));
        sc.close();

*/
import java.util.Scanner;

public class Uni07Exe03B {
    
    private double[] lerVetor(Scanner sc) {
        
        double vetorReais[] = new double[12];

        for (int i = 0; i < vetorReais.length; i++) {
            System.out.println("Insira o número real de indíce " +  i + " no vetor:");
            vetorReais[i] = sc.nextDouble();
        }

        return vetorReais;
    }

    private double[] corrigirVetor(double vetorReais[]) {

        for(int i = 0; i < vetorReais.length; i++) {
            if (i %2 == 0) {
                vetorReais[i] = vetorReais[i] * 1.2;
            } else {
                vetorReais[i] = vetorReais[i] * 1.2;
            }
        }
        return vetorReais;

    }

    private void imprimirVetor(double vetorReais[]) {
        
        for(int i = 0; i < vetorReais.length; i++) {
            System.out.print("[" + vetorReais[i] + "]" + " ");
        }

    }

    public Uni07Exe03B() {
        Scanner sc = new Scanner(System.in);

        double vetorReais[] = lerVetor(sc);
        vetorReais = corrigirVetor(vetorReais);
        imprimirVetor(vetorReais);

        sc.close();
    }

    public static void main(String[] args) {
        new Uni07Exe03B();
    }

}
