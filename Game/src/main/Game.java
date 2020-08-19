package main;

import javax.swing.*;
import java.util.Random;

public class Game {
    public static void main(String[] args) {

        int vidaHeroi = 100;
        int vidaInimigo = 100;

        System.out.println("Bem-vindo ao jogo!");
        System.out.println("");
        System.out.println("Sua vida = " + vidaHeroi);
        System.out.println("Vida do seu inimigo = " + vidaInimigo);
        System.out.println("");

        Random random = new Random();

            while (vidaHeroi > 0 || vidaInimigo > 0) {

                String escolhaAcao = JOptionPane.showInputDialog("Escolha 1 para atacar ou 2 para curar");
                int numeroAcao = Integer.parseInt(escolhaAcao);

                int escolhaBot = random.nextInt(2);

                if (escolhaBot == 0) {
                    System.out.println("O inimigo atacou");
                    vidaHeroi = vidaHeroi - 10;
                } else if (escolhaBot == 1) {
                    System.out.println("O inimigo curou");
                    vidaInimigo = vidaInimigo + 10;
                }

                if (vidaInimigo == 0) {
                    System.out.println("Você venceu!");
                    break;
                } else if (vidaHeroi == 0) {
                    System.out.println("Você perdeu!");
                    break;
                }

                if (numeroAcao == 1) {
                    vidaInimigo = vidaInimigo - 10;
                    System.out.println("Você atacou");
                    System.out.println("Sua vida = " + vidaHeroi);
                    System.out.println("Vida do seu inimigo = " + vidaInimigo);
                    System.out.println("");
                } else if (numeroAcao == 2) {
                    vidaHeroi = vidaHeroi + 10;
                    System.out.println("Você usou a cura");
                    System.out.println("Sua vida = " + vidaHeroi);
                    System.out.println("Vida do seu inimigo = " + vidaInimigo);
                    System.out.println("");
                } else if (numeroAcao != 1 || numeroAcao != 2) {
                    System.out.println("Você não executou nenhuma ação...");
                    System.out.println("");
                    System.out.println("Sua vida = " + vidaHeroi);
                    System.out.println("Vida do seu inimigo = " + vidaInimigo);
                    System.out.println("");
                }
            }
    }
}

