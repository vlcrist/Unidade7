import java.util.Scanner;

public class Uni07Exe01 {

    
    private int contarLetras (char letra, String frase) {
   
        int contadorLetra = 0; 

        for (int i = 0; i < frase.length(); i++) {

            if (letra == frase.charAt(i)) {

                contadorLetra++;
            } 
        }

        return contadorLetra;
    }


    private char lerLetra (Scanner sc) {
        System.out.println("Digite uma letra");
        char letra = sc.next().charAt(0);
        sc.nextLine();
        return letra;
    }

    private String lerFrase (Scanner sc) {
        System.out.println("Digte uma frase");
        String frase = sc.nextLine();
        return frase;
    }

    private void exibirResultado (char letra, String frase, int quantidade) {
        System.out.println("A letra " + letra + " aparece " + quantidade + " vezes na frase");
    }

    public Uni07Exe01() {
        Scanner sc = new Scanner (System.in);

        char letra = lerLetra(sc);
        String frase = lerFrase(sc);

        int quantidade = contarLetras(letra, frase);

        exibirResultado(letra, frase, quantidade);

        sc.close();
    }

    public static void main(String[] args) {

        new Uni07Exe01();

    }
}
