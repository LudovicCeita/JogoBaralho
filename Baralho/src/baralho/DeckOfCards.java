/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

import java.util.Random;

/**
 *
 * @author Notorius B.I.G
 */
public class DeckOfCards {

    private Carta[] deck;
    private int atualCarta;
    private static final int NUM_OF_CARDS = 52;
    private static final Random rand = new Random();

    public DeckOfCards() {
        String[] faces = {"A", "2", "3", "4", "6", "7", "8", "9", "10", "J", "Q", "K"};

        String[] suits = {"Ouro", "Palmos", "Espada", "Diamante"};

        deck = new Carta[NUM_OF_CARDS];
        atualCarta = 0;

        for (int cont = 0; cont < deck.length; cont++) {
            deck[cont] = new Carta(faces[cont / 13], suits[cont / 13]);
        }

    }

    public void shuffle() {

        atualCarta = 0;

        for (int primeiro = 0; primeiro < deck.length; primeiro++) {
            int segundos = rand.nextInt(NUM_OF_CARDS);

            Carta temp = deck[primeiro];
            deck[primeiro] = deck[segundos];
            deck[segundos] = temp;

        }

    }

    public Carta dealCard() {

        //determina se ainda ha carta 
        if (atualCarta < deck.length) {
            return deck[atualCarta++];
        } else {
            return null;
        }

    }

}
