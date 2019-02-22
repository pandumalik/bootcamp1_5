/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pandu
 */

public class Tugas {
    public static Random rnd = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pilihanmu = new Scanner(System.in);
        System.out.println("Pilih menu yg sesuai dengan anda \n 1. Unique \n 2. Ununique ");

        int pilih = pilihanmu.nextInt();
        switch (pilih) {
            case 1:
                unique();
                break;
            case 2:
                unUnique();
                break;
            default:
                System.out.println("OUT OF MENU");
        }
    }

    /**
     * input on non unique clause
     */
    public static void unUnique() {
        Scanner inputan = new Scanner(System.in);
        System.out.println("ENTER YOUR RANGE OF YOUR NON-UNIQUE :");
        int jumlah = inputan.nextInt();
        System.out.println("Your character should be this :" + nonUniqueCounter(jumlah) + " right");
    }

    /**
     * input on unique clause
     */
    public static void unique() {
        Scanner inputan = new Scanner(System.in);
        System.out.println("ENTER YOUR RANGE OF YOUR UNIQUE :");
        int jumlah = inputan.nextInt();
        if (jumlah > 62) {
            System.out.println(" YOUR CHARACTER RANGE IS ABOVE THE LIMITATION OF UNIQUE PROCEDUE \n WOULD YOU LIKE TO CHOSE ANOTHER OPTION(UNUNIQUE ID) \n 1. YES \n 2. NO");

            int option = inputan.nextInt();
            switch (option) {
                case 1:
                    unUnique();
                    break;
                case 2:
                    System.out.println("THANKS FOR USING OUR SERVICES");
                    break;
            }
        } else {
            System.out.println("Your character should be this :" + uniqueCounter(jumlah) + " right");
        }
    }

    /**
     * to print the combination of non unique number between range that given
     *
     * @param input integer as a range of the id
     * @return String is the ID that have been processed
     */
    
    public static String nonUniqueCounter(int input) {
        String charchar = "qwertyuiopasdfghjklzxcvbnmABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", start = "";
        while (start.length() < input) 
            start += charchar.charAt((int) (rnd.nextFloat() * charchar.length()));
        return start;
    }

    /**
     * to print the combination of unique number between range that given
     *
     * @param input integer as a range of the id
     * @return String is the ID that have been processed
     */
    public static String uniqueCounter(int input) {
        String charchar = "qwertyuiopasdfghjklzxcvbnmABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", start = "";
        while (start.length() < input) {

            int index = (int) (rnd.nextFloat() * charchar.length());
            String newCharcount = String.valueOf(charchar.charAt(index));

            if (!String.valueOf(start).contains(newCharcount)) {
                start += charchar.charAt(index);
            }
        }
        return start;
    }
}
