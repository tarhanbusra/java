/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author TARHAN
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = (int)(Math.random()*100);
        Scanner input = new Scanner (System.in);
        System.out.print("Tahmininizi giriniz.\n");
        int tahmin=input.nextInt();
        int n1=number/10;
        int n2=number%10;
        int t1=tahmin/10;
        int t2=tahmin%10;
        
        if(number==tahmin){
            System.out.println("Tam isabet.");
        }
        else if((n1==t1 && n2!=t2)||(n1!=t1 && n2==t2))
            System.out.println("Tam isabet degil ama basamaklardan bir tanesi tam isabet. Akılda tutulan sayi =" + number);
        else
            System.out.println("isabet yok, akilda tutulan sayi= " +number);
    }
    
}
