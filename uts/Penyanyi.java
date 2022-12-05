/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author oneda
 */
public class Penyanyi extends Pop{
    
    public static void main(String[] args) {
        Pop pop = new Pop("Black Pink", "How You Like That");
        Dangdut dangdut = new dangdut();
        
        Pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.cetakLabel();
        
        dangdut.song("Via Vallen","Kopi Dandut");
        dangdut.cetakLabel();
    }

    private static class dangdut extends Dangdut {

        public dangdut() {
        }
    }
    
}
