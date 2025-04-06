/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.Scanner;
        

public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int[] dizi= new int[10];
        int max, i=1, count=1;
        
        System.out.println("10 tane sayi giriniz");
        dizi[0]= input.nextInt();
        max=dizi[0];
        
        for(;i<9; i++){
            dizi[i]=input.nextInt();
            if(dizi[i]>max){
                count=1;
                max=dizi[i];
            }
            else if(max==dizi[i])
                count++;
        }
         
        System.out.println("En buyuk sayi= " + max +", "+ count + " defa girilmistir.");
    }
    
}
