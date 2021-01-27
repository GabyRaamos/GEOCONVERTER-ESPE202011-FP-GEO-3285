/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoconverter;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GEOCONVERTER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {

            System.out.println("███████░▒*        WELCOME TO GEOCONVERTER       *░▒███████\n"
                    + "█                         VERSION 0.1                             █\n"
                    + "█                       20 JANUARY 2021                           █\n"
                    + "████████████████████ ███████████████████████\n"
                    + "                   Transformer of units of length                \n"
                    + "_______________________");

            System.out.println("  What would you like to do? ");
            System.out.println("▒ 1.  Kilometers to meters.");
	    System.out.println("▒ 2.  Meters to centimeters.");
            System.out.println("▒ 3.  Meters to millimeters");
            System.out.println("▒ 4.  Meters to nanometers.");

            System.out.println("Enter your menu option >> ");

            double kilometers;
            double meters;
	    double centimeters;
            double millimeters;
            double nanometers;

            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("enter enter the data --> ");
                    kilometers = input.nextDouble();
                    meters = kilometers * 1000;
                    System.out.println(kilometers + " Kilometers is equal to " + meters + " meters\n ");
                    break;
		case 2:
                    System.out.println("enter enter the data --> ");
                    meters = input.nextDouble();
                    centimeters = meters * 100;
                    System.out.println(meters + " meters is equal to " + centimeters + " centimeters\n ");
                    break;

                case 14:
                    System.out.println(" ** GOOD BYE USER ** ");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
        } while (option != 14);
    }

}
