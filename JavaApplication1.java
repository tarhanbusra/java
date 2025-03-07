/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author TARHAN
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Toplam para miktarini giriniz(kurus kismini virgul ile belirtiniz. örn 55,89):");
        double miktar =input.nextDouble();
        int kalan=(int)(miktar*100);
        
        int tl=kalan/100;
        kalan=kalan%100;
        
        int kurus50=kalan/50;
        kalan=kalan%50;
        
        int kurus25=kalan/25;
        kalan=kalan%25;
        
        int kurus10=kalan/10;
        kalan=kalan%10;
        
        int kurus5=kalan/5;
        kalan=kalan%5;
        
        int kurus1=kalan;
                
        System.out.println(tl + " tane bir tl\n" + kurus50 + " tane 50 kurus\n" + kurus25 + " tane 25 kurus\n" + kurus10 + " tane 10 kurus\n" + kurus5 + " tane 5 kurus\n" + kurus1+" tane 1 kurus");
    
    }
    
}
