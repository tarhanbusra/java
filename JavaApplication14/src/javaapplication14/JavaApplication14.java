/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import java.util.Scanner;
/**
 *
 * @author TARHAN
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int x, max, count=0;
        System.out.println("10 tane sayi giriniz.");
        x= input.nextInt();
        max=x;
        count=1;
        
        for(int i=0;i<9;i++){
            x=input.nextInt();
            if(x>max){
                max=x;
                count=1;
               }
            else if(x==max)
                count++;
        }
        System.out.println("En buyuk sayi= " + max +", "+ count + " defa girilmistir.");
        
    }
    
}
