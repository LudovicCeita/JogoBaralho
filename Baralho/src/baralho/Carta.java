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
public class Carta {
 
    private String face;
    private String suit;

    public Carta(String face , String suit) {
    
    this.face = face;
    this.suit = suit;
    }
    
    
    @Override
    public String toString(){
        return face + "of" + suit;
    }
    
    
}
