/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;
import java.util.Scanner;

/**
 *
 * @author TARHAN
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int[] dizi= new int[10];
        int[] f= new int[10];
        
        System.out.println("1 ile 10 arasında 10 tane sayi giriniz.");
        
        for(int i=0;i<10; i++){
            dizi[i]= input.nextInt();
        }
        
        for(int i=0;i<10; i++){
            f[dizi[i]]++;
        }
        
        for(int i=0;i<10;i++){
            if(f[i]>0){
                System.out.print(i + " ");
            }
        }
    }
    
}
