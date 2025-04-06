/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TARHAN
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int[] dizi= new int[10];
        
        System.out.println("1 ile 10 arasinda 10 tane sayi giriniz.");
        
        for(int i=0;i<10; i++){
            dizi[i]= input.nextInt();
        }
         //1 1 1 2 3 4 
        Arrays.sort(dizi);
        
        System.out.print(Arrays.toString(dizi) + " ");
        System.out.print(dizi[0]+" ");
        
        for(int i=1;i<10;i++){
            if(dizi[i]>dizi[i-1]){
                System.out.print(dizi[i] + " ");
            }
        }
    }
    
}
