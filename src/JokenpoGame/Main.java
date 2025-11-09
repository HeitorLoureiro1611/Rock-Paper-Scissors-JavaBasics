package JokenpoGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        char escolha;
        boolean continuarJogando;
        int playerJogada;
        String[] escolhas = {"Pedra", "Papel", "Tesoura"};


        do {
            System.out.println("""
                ————————————
                |-Jokenpô!-|
                ————————————
                """);

                //Menu de escolhas
                System.out.println("""
                    Escolha sua jogada:
                    1 - Pedra
                    2 - Papel
                    3 - Tesoura""");

                //escolha do jogador
                playerJogada = sc.nextInt()-1;
                sc.nextLine(); //lidar com o buffer do nextInt
            System.out.printf("A maquina jogou %s\n", escolhas[playerJogada]);

            //escolha da maquina
            int jogadaMaquina = random.nextInt(3);
            System.out.printf("A maquina jogou %s\n\n", escolhas[jogadaMaquina]);

            //condição de vitoria

            int diferenca = playerJogada - jogadaMaquina;

            if (diferenca == 0){
                System.out.println("Deu empate!!!");
            } else if(diferenca == 1 || diferenca == -2){
                System.out.println("Você ganhou!!!!!!!!!\nparabéns!");
            } else {
                System.out.println("Você perdeu :(\nsinto muito");
            }

            //condição de break do loop do jogo
            System.out.println("\nJogar novamente? \n(Digite 'N' para sair)");
            escolha = sc.nextLine().toUpperCase().charAt(0);

            continuarJogando = escolha == 'N';

        } while (!continuarJogando);
        sc.close();
    }
}
