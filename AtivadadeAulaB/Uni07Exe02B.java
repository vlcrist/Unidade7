/*

        double somaVetores = 0;
        double mediaVetor = 0;
        Scanner sc = new Scanner(System.in);

        double vetorReais[] = new double[12];
        
        for (int i = 0; i < vetorReais.length; i++) {
            System.out.println("Insira o valor real de indíce " + i + " no vetor de números reais:");
            vetorReais[i] = sc.nextDouble();
            somaVetores = (somaVetores + vetorReais[i]);
        }

        mediaVetor = somaVetores / vetorReais.length;
        System.out.println("Média do vetor: " + mediaVetor);

        for (int i = 0; i < vetorReais.length; i++ )
            if (vetorReais[i] > mediaVetor)
                System.out.println("O valor " + vetorReais[i] + " de indíce " + i + " é maior que a média.");
        sc.close();

*/

import java.util.Scanner;

public class Uni07Exe02B {
    
    private double[] lerVetor(Scanner sc) {
        
        double vetorReais[] = new double[12];

        for (int i = 0; i < vetorReais.length; i++) {
            System.out.println("Insira o valor real de indíce " + i + " no vetor de números reais:");
            vetorReais[i] = sc.nextDouble();
        }

        return vetorReais;
    }

    private double somarVetor(double vetorReais[]) {

        double somaVetores = 0;

        for (int i = 0; i < vetorReais.length; i++) {
            somaVetores = (somaVetores + vetorReais[i]);
        }
        return somaVetores;
    }

    private double calcularMediaVetor(double vetorReais[], double somaVetores) {

        double mediaVetor = somaVetores / vetorReais.length;
        
        return mediaVetor;
    }

    private void imprimirValores(double mediaVetor, double vetorReais[]) {

        for (int i = 0; i < vetorReais.length; i++ )
            if (vetorReais[i] > mediaVetor)
                System.out.println("O valor " + vetorReais[i] + " de indíce " + i + " é maior que a média.");

    }

    public Uni07Exe02B () {
        Scanner sc = new Scanner(System.in);
        double vetorReais [] = lerVetor(sc);
        double somaVetores = somarVetor(vetorReais);
        double mediaVetor = calcularMediaVetor(vetorReais, somaVetores);
        System.out.println("A média de valores do vetor é: " + mediaVetor);
        imprimirValores(mediaVetor, vetorReais);
    }

    public static void main(String[] args) {
        new Uni07Exe02B();
    }
}
