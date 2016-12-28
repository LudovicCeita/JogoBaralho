/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

/**
 *
 * @author Notorius B.I.G
 */
public class Baralho {

    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        for (int i = 1; i < 52; i++) {
            System.out.printf("%-19s", deck.dealCard());

            if (i % 4 == 0)//imprime uma nova linha a cada 4 cartas 
            {
                System.out.println();
            }
        }

    }

}
