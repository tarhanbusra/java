/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;
/**
 *
 * @author TARHAN
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        System.out.print("Kilonuzu giriniz.\n");
        float kilo = input.nextFloat();
        System.out.print("Boyunuzu giriniz.\n");
        float boy = input.nextFloat();
        float bmi = kilo/(boy*boy);
        if(bmi>=30.0){
           System.out.printf("Kisinin BMI degeri= %.2f\n Obese\n",bmi);
        }
        else if(bmi>=25.0) {
            System.out.printf("Kisinin BMI degeri= %.2f\n Overweight\n",bmi);
        }
        else if(bmi>=18.5) {
            System.out.printf("Kisinin BMI degeri= %.2f\n Normal\n",bmi);
        }
        else {
            System.out.printf("Kisinin BMI degeri= %.2f\n Underweight\n",bmi);
        }
        
}
}