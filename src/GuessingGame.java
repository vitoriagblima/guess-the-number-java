import java.util.Scanner;

public class GuessingGame{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numeroSecreto;
        int palpite;
        int tentativas;
        int maxTentativas;
        boolean acertou;

        numeroSecreto = (int)(Math.random() * 50) + 1;
        tentativas = 0;
        maxTentativas = 7;
        acertou = false;

        System.out.println("=========================");
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 50.");
        System.out.println("Você tem: "+ maxTentativas + " tentativas");
        System.out.println("=========================");

        while ((acertou == false) && (tentativas < maxTentativas)){
            System.out.print("\nDigite seu palpite: ");
            palpite = sc.nextInt();

            tentativas = tentativas + 1;

            if (palpite == numeroSecreto){
                acertou = true;
            } else if (palpite < numeroSecreto){
                System.out.println("O número secreto é MAIOR que " + palpite + ".");
            } else if (palpite > numeroSecreto){
                System.out.println("O número secreto é MENOR que " + palpite + ".");
            } else {
                System.out.println("Digite um número válido");
            }

            System.out.println("Tentativas restantes: "+  (maxTentativas - tentativas));
            System.out.println("----------------------------------");

        }

        if (acertou){
            System.out.println("\nParabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas!");
        } else {
            System.out.println("\nQue pena! Suas chances acabaram.");
            System.out.println("O número secreto era: " + numeroSecreto);
        }

        sc.close();
    }
}
