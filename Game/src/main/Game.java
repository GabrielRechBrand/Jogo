package main;

import javax.swing.*;

public class Game {
    public static void main(String[] args) {

        int vidaHeroi = 10;
        int vidaInimigo = 10;

        System.out.println("Bem-vindo ao jogo!");
        System.out.println("Sua vida = " + vidaHeroi);
        System.out.println("Vida do seu inimigo = " + vidaInimigo);
        System.out.println("");

        boolean buffVida;

        for (buffVida=true; (vidaHeroi >= 1 && vidaHeroi <= 98);) {
            vidaHeroi = vidaHeroi + 2;

        }
        System.out.println("Sua vida = " + vidaHeroi);
        System.out.println("Vida do seu inimigo = " + vidaInimigo);
    }
}
