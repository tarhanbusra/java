/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author TARHAN
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sentinel,sayi,min,max=0;
        Scanner input = new Scanner (System.in);
        System.out.println("bir sentinel deger giriniz.");
        sentinel= input.nextInt();
       
        do{
            System.out.println("Klavyeden sentinel deger girene kadar pozitif tam sayi giriniz");
            sayi=input.nextInt();
            
            if(sayi<0){
                System.out.println("Lutfen pozitif bir sayi giriniz.");
            }
            else if(sayi==sentinel)
                System.out.println("Hic gecerli deger girilmedi.");
     
        }while(sayi<0);
        
        min=sayi;
                
        while(sayi!=sentinel){
            System.out.println("Klavyeden  sentinel deger girene kadar pozitif tam sayi giriniz");
            sayi=input.nextInt();
            if(sayi<=0){
                System.out.println("Pozitif bir sayi giriniz.");
            }
            else if(sayi>max && sayi>sentinel)
                max=sayi;
            else if(sayi<min && sayi<sentinel)
                min=sayi;
        }
        System.out.println("Girilen en buyuk sayi="+ max);
        System.out.println("Girilen en kucuk sayi="+ min);    
        
        
    }
    
}
