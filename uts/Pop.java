/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author oneda
 */
public class Pop {
    
    String penyanyi = "Raisa";
    String lagu = "Kali Kedua";
    
    Pop(){
        
    }
    
    Pop(String penyanyi, String Lagu) {
        this.penyanyi = penyanyi;
        this.lagu = Lagu;
        System.out.println(this.penyanyi+" <=> "+this.lagu);
    }
    
    public static void singer(String penyanyi) {
        this.penyanyi = penyanyi;        
    }
    
    
}
