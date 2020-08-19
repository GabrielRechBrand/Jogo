package main;

import javax.swing.*;
import java.util.Random;

public class Game {
    public static void main(String[] args) {

        int vidaHeroi = 100;
        int vidaInimigo = 100;

        System.out.println("Bem-vindo ao jogo!");
        System.out.println("Guerreiros têm mais dano, e Magos possuem mais cura, qual você escolhe?");

        String escolhaClasse = JOptionPane.showInputDialog("Guerreiro (1) Mago (2)");
        int numeroClasse = Integer.parseInt(escolhaClasse);
        for (int i = 0; i < 7; ++i)
            System.out.println();

        System.out.println("Sua vida = " + vidaHeroi);
        System.out.println("Vida do seu inimigo = " + vidaInimigo);
        System.out.println("");

        for (int i = 0; i < 7; ++i)
            System.out.println();

        Random random = new Random();

        while (vidaHeroi > 0 || vidaInimigo > 0) {

            String escolhaAcao = JOptionPane.showInputDialog("Escolha 1 para atacar ou 2 para curar");
            int numeroAcao = Integer.parseInt(escolhaAcao);
            int escolhaBot = random.nextInt(2);

            if (escolhaBot == 0) {
                int geraDano = random.nextInt(11);
                vidaHeroi = vidaHeroi - geraDano;
                System.out.println("O inimigo atacou");
            } else if (escolhaBot == 1) {
                int geraCura = random.nextInt(11);
                vidaInimigo = vidaInimigo + geraCura;
                System.out.println("O inimigo curou");
            } else if (escolhaBot == 2) {
                System.out.println("O inimigo errou o golpe");
            }

            if (vidaInimigo <= 0) {
                System.out.println("Você venceu!");
                break;
            } else if (vidaHeroi <= 0) {
                System.out.println("Você perdeu!");
                break;
            }
            if (numeroAcao == 1) {
                    int geraDano = random.nextInt(16);
                    vidaInimigo = vidaInimigo - geraDano;
                    System.out.println("Você atacou");
                    System.out.println("Sua vida = " + vidaHeroi);
                    System.out.println("Vida do seu inimigo = " + vidaInimigo);
                    System.out.println("");
                    for (int i = 0; i < 7; ++i)
                        System.out.println();
            } else if (numeroAcao == 2) {
                    int geraCura = random.nextInt(11);
                    vidaInimigo = vidaInimigo - geraCura;
                    System.out.println("Você usou a cura");
                    System.out.println("Sua vida = " + vidaHeroi);
                    System.out.println("Vida do seu inimigo = " + vidaInimigo);
                    System.out.println("");
                    for (int i = 0; i < 7; ++i)
                        System.out.println();
            } else if (numeroAcao != 1 || numeroAcao != 2) {
                    System.out.println("Você não executou nenhuma ação...");
                    System.out.println("");
                    System.out.println("Sua vida = " + vidaHeroi);
                    System.out.println("Vida do seu inimigo = " + vidaInimigo);
                    System.out.println("");
                    for (int i = 0; i < 71; ++i)
                        System.out.println();

            }
        }
    }
}

