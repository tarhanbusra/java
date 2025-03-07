/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author TARHAN
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("bir sayi giriniz.\n");
        int sayi=input.nextInt();
        int sayac=0;
        
        if(sayi%2==0)
           sayac++;
        
        if(sayi%3==0)
            sayac++;
        
        if(sayac==0)
            System.out.print("girdiginiz sayi ne 2'ye ne de 3'e tam bölünmüyor.\n");
        
        if(sayac==1)
            System.out.print("Girdiğiniz sayi 2 veya 3'e tam bölünüyor.\n");
        
        if(sayac==2)
            System.out.print("Girdiğiniz sayi hem 2'ye hem 3'e tam bölünüyor.\n");
    }
    
}
