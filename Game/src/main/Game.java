package main;

import javax.swing.*;
import java.util.Random;

public class Game {
   public static void main(String[] args) {

        int vidaHeroi = 100;
        int vidaInimigo = 100;
        int vidaJogadorUm = 100;
        int vidaJogadorDois = 100;

        System.out.println("Bem-vindo ao jogo!");
        System.out.println("Guerreiros têm mais dano, e Magos possuem mais cura, qual você escolhe?");

        String escolhaModo = JOptionPane.showInputDialog("Contra a Máquina (1) Duelo Local (2)");
        int numeroModo = Integer.parseInt(escolhaModo);

        String escolhaClasse = JOptionPane.showInputDialog("Guerreiro (1) Mago (2)");
        int numeroClasse = Integer.parseInt(escolhaClasse);

        String escolhaClasseInimigo = JOptionPane.showInputDialog("Guerreiro (1) Mago (2)");
        int numeroClasseInimigo = Integer.parseInt(escolhaClasseInimigo);
        int numeroClasseDois = numeroClasseInimigo;

        for (int i = 0; i < 7; ++i)
            System.out.println();

        Random random = new     Random();

        if (numeroModo == 1) {

            int constanteDeDano = 0;
            int constanteDeCura = 0;

            if (numeroClasse == 1) {
                constanteDeDano = 16;
                constanteDeCura = 11;
            } else if (numeroClasse == 2) {
                constanteDeDano = 11;
                constanteDeCura = 16;
            }

            int constanteDeDanoInimigo = 0;
            int constanteDeCuraInimigo = 0;

            if (numeroClasseInimigo == 1) {
                constanteDeDanoInimigo = 16;
                constanteDeCuraInimigo = 11;
            } else if (numeroClasseInimigo == 2) {
                constanteDeDanoInimigo = 11;
                constanteDeCuraInimigo = 16;
            }

            System.out.println("Sua vida = " + vidaHeroi);
            System.out.println("Vida do seu inimigo = " + vidaInimigo);
            System.out.println("");
            for (int i = 0; i < 7; ++i)
                System.out.println();

            while (vidaHeroi > 0 || vidaInimigo > 0) {

                String escolhaAcao = JOptionPane.showInputDialog("Escolha 1 para atacar ou 2 para curar");
                int numeroAcao = Integer.parseInt(escolhaAcao);
                int escolhaBot = random.nextInt(1);

                if (vidaInimigo <= 0) {
                    System.out.println("Você venceu!");
                    break;
                } else if (vidaHeroi <= 0) {
                    System.out.println("Você perdeu!");
                    break;
                }

                if (escolhaBot == 0) {
                    int geraDano = random.nextInt(constanteDeDanoInimigo);
                    vidaHeroi = vidaHeroi - geraDano;
                    System.out.println("O inimigo atacou");
                } else if (escolhaBot == 1) {
                    int geraCura = random.nextInt(constanteDeCuraInimigo);
                    vidaInimigo = vidaInimigo + geraCura;
                    System.out.println("O inimigo curou");
                } else {
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
                    int geraDano = random.nextInt(constanteDeDano);
                    vidaInimigo = vidaInimigo - geraDano;
                    System.out.println("Você atacou");
                    System.out.println("Sua vida = " + vidaHeroi);
                    System.out.println("Vida do seu inimigo = " + vidaInimigo);
                    System.out.println("");
                    for (int i = 0; i < 7; ++i)
                        System.out.println();
                } else if (numeroAcao == 2) {
                    int geraCura = random.nextInt(constanteDeCura);
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

                if (vidaInimigo <= 0) {
                    System.out.println("Você venceu!");
                    break;
                } else if (vidaHeroi <= 0) {
                    System.out.println("Você perdeu!");
                    break;
                }
            }
        } else if (numeroModo == 2) {

            int cooldownCuraUm = 1;
            int cooldownCuraDois = 1;

            boolean cansadoUm = false;
            boolean cansadoDois = false;

            int maximoDanoUm = 0;
            int maximoDanoUmCansado = 0;
            int maximoCuraUm = 0;

            if (numeroClasse == 1) {
                maximoDanoUm = 16;
                maximoDanoUmCansado = 10;
                maximoCuraUm = 11;
            } else if (numeroClasse == 2) {
                maximoDanoUm = 11;
                maximoCuraUm = 16;
            }

            int maximoDanoDois = 0;
            int maximoDanoDoisCansado = 0;
            int maximoCuraDois = 0;

            if (numeroClasseDois == 1) {
                maximoDanoDois = 16;
                maximoDanoDoisCansado = 10;
                maximoCuraDois = 11;
            } else if (numeroClasseDois == 2) {
                maximoDanoDois = 11;
                maximoCuraDois = 16;
            }

            System.out.println("Vida Player I = " + vidaJogadorUm);
            System.out.println("Vida Player II = " + vidaJogadorDois);
            System.out.println("");
            for (int i = 0; i < 7; ++i)
                System.out.println();

            while (vidaHeroi > 0 || vidaInimigo > 0) {

                String escolhaAcaoUm = JOptionPane.showInputDialog("Escolha 1 para atacar ou 2 para curar");
                int numeroAcaoUm = Integer.parseInt(escolhaAcaoUm);

                if (vidaJogadorDois <= 0) {
                    System.out.println("Player I venceu!");
                    break;
                } else if (vidaJogadorUm <= 0) {
                    System.out.println("Player II venceu!");
                    break;
                }

                if (numeroAcaoUm == 1) {

                    if(!cansadoUm) {

                        int geraDano = random.nextInt(maximoDanoUm);
                        vidaJogadorDois = vidaJogadorDois - geraDano;

                        if (geraDano >= 12) {

                            System.out.println("Um atacou e ficou cansado!");
                            System.out.println("Vida Player I = " + vidaJogadorUm);
                            System.out.println("Vida Player II = " + vidaJogadorDois);
                            System.out.println("");
                            cansadoUm = true;
                            for (int i = 0; i < 7; ++i)
                                System.out.println();

                        } else if (geraDano < 12) {
                            System.out.println("Um atacou");
                            System.out.println("Vida Player I = " + vidaJogadorUm);
                            System.out.println("Vida Player II = " + vidaJogadorDois);
                            System.out.println("");
                            cansadoUm = false;
                            for (int i = 0; i < 7; ++i)
                                System.out.println();
                        }

                    } else if(cansadoUm) {

                            int geraDano = random.nextInt(maximoDanoUmCansado);
                            vidaJogadorDois = vidaJogadorDois - geraDano;
                            System.out.println("Um atacou");
                            System.out.println("Vida Player I = " + vidaJogadorUm);
                            System.out.println("Vida Player II = " + vidaJogadorDois);
                            System.out.println("");
                            cansadoUm = false;
                            for (int i = 0; i < 7; ++i)
                                System.out.println();

                    }
                } else if (numeroAcaoUm == 2 ) {

                    if (cooldownCuraUm == 1 ) {
                        int geraCura = random.nextInt(maximoCuraUm);
                        vidaJogadorUm = vidaJogadorUm + geraCura;
                        cooldownCuraUm = cooldownCuraUm + 1;
                        System.out.println("Um curou");
                        System.out.println("Vida Player I = " + vidaJogadorUm);
                        System.out.println("Vida Player II = " + vidaJogadorDois);
                        System.out.println("");
                        for (int i = 0; i < 7; ++i)
                            System.out.println();

                    } else if (cooldownCuraUm == 2) {
                        System.out.println("Um está recarregando a cura..");
                        cooldownCuraUm = cooldownCuraUm - 1;
                        System.out.println("Vida Player I = " + vidaJogadorUm);
                        System.out.println("Vida Player II = " + vidaJogadorDois);
                        System.out.println("");
                        for (int i = 0; i < 7; ++i)
                            System.out.println();
                    }
                }

                if (vidaJogadorDois <= 0) {
                    System.out.println("Player I venceu!");
                    break;
                } else if (vidaJogadorUm <= 0) {
                    System.out.println("Player II venceu!");
                    break;
                }

                String escolhaAcaoDois = JOptionPane.showInputDialog("Escolha 1 para atacar ou 2 para curar");
                int numeroAcaoDois = Integer.parseInt(escolhaAcaoDois);

                if (numeroAcaoDois == 1) {

                    if(!cansadoDois) {

                        int geraDano = random.nextInt(maximoDanoDois);
                        vidaJogadorUm = vidaJogadorUm - geraDano;

                        if (geraDano >= 12) {

                            System.out.println("Dois atacou e ficou cansado!");
                            System.out.println("Vida Player I = " + vidaJogadorUm);
                            System.out.println("Vida Player II = " + vidaJogadorDois);
                            System.out.println("");
                            cansadoDois= true;
                            for (int i = 0; i < 7; ++i)
                                System.out.println();

                        } else if (geraDano < 12) {

                            System.out.println("Dois atacou");
                            System.out.println("Vida Player I = " + vidaJogadorUm);
                            System.out.println("Vida Player II = " + vidaJogadorDois);
                            System.out.println("");
                            cansadoDois = false;
                            for (int i = 0; i < 7; ++i)
                                System.out.println();
                        }

                    } else if(cansadoDois) {

                        int geraDano = random.nextInt(maximoDanoDoisCansado);
                        vidaJogadorUm = vidaJogadorUm - geraDano;
                        System.out.println("Dois atacou");
                        System.out.println("Vida Player I = " + vidaJogadorUm);
                        System.out.println("Vida Player II = " + vidaJogadorDois);
                        System.out.println("");
                        cansadoUm = false;
                        for (int i = 0; i < 7; ++i)
                            System.out.println();
                    }
                } else if (numeroAcaoDois == 2) {
                    if (cooldownCuraDois == 1 ) {
                        int geraCura = random.nextInt(maximoCuraDois);
                        vidaJogadorDois = vidaJogadorDois + geraCura;
                        cooldownCuraDois = cooldownCuraDois + 1;
                        System.out.println("Dois curou");
                        System.out.println("Vida Player I = " + vidaJogadorUm);
                        System.out.println("Vida Player II = " + vidaJogadorDois);
                        System.out.println("");
                        for (int i = 0; i < 7; ++i)
                            System.out.println();
                    } else if (cooldownCuraDois == 2) {
                        System.out.println("Dois está recarregando a cura..");
                        cooldownCuraDois = cooldownCuraDois - 1;
                        System.out.println("Vida Player I = " + vidaJogadorUm);
                        System.out.println("Vida Player II = " + vidaJogadorDois);
                        System.out.println("");
                        for (int i = 0; i < 7; ++i)
                            System.out.println();
                    }
                }
                if (vidaJogadorDois <= 0) {
                    System.out.println("Player I venceu!");
                    break;
                } else if (vidaJogadorUm <= 0) {
                    System.out.println("Player II venceu!");
                    break;
                }
            }
        }
    }
}
