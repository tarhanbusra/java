/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author TARHAN
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] numbers = {105, 678, 9876, 105, 9999, 678, 123, 105, 45, 9876, 1000};
        
        System.out.println("3 veya 4 basamaklı sayıların frekansı:");

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num >= 100 && num <= 9999) { // 3-4 basamaklı mı?
                int count = 1; 

                // Daha önce sayıldı mı kontrol et
                boolean countedBefore = false;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == num) {
                        countedBefore = true;
                        break;
                    }
                }
                if (countedBefore) continue;

                // Kaç kez tekrar ettiğini bul
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] == num) {
                        count++;
                    }
                }
                System.out.println(num + " -> " + count + " kez");
            }
        }
    }
}
    
