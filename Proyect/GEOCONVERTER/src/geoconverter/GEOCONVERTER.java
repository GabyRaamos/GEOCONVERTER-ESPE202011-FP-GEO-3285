/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoconverter;

import java.util.Scanner;

/**
 *
 * @author Fernando
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

            System.out.println("â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–‘â–’*        WELCOME TO GEOCONVERTER       *â–‘â–’â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆ\n"
                    + "â–ˆ                         VERSION 0.1                             â–ˆ\n"
                    + "â–ˆ                       20 JANUARY 2021                           â–ˆ\n"
                    + "â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆ â–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆâ–ˆ\n"
                    + "                   Transformer of units of length                \n"
                    + "_______________________");

            System.out.println("  What would you like to do? ");
            System.out.println("â–’ 1.  Kilometers to meters.");
            System.out.println("â–’ 2.  Meters to centimeters.");
            System.out.println("â–’ 3.  Meters to millimeters");
            System.out.println("â–’ 4.  Meters to nanometers.");
            System.out.println("â–’ 5.  Meters to feet.");
            System.out.println("â–’ 6.  Meters to inches.");
            System.out.println("â–’ 7.  Centimeters to micrometers.");
            System.out.println("▒ 8.  Centimeters to inches.");
            System.out.println("▒ 9.  Millimeters to nanometers.");
            System.out.println("▒ 10. Kilometers to centimeters.");

            System.out.println("Enter your menu option >> ");

            double kilometers;
            double meters;
            double centimeters;
            double millimeters;
            double nanometers;
            double inches;
            double micrometers;
            double feet;
            double gigameters;
            double yard;

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
                case 3:
                    System.out.println("enter enter the data --> ");
                    meters = input.nextDouble();
                    millimeters = meters * 1000;
                    System.out.println(meters + " meters is equal to " + millimeters + " millimeters\n ");
                    break;
                case 4:
                    System.out.println("enter enter the data --> ");
                    meters = input.nextDouble();
                    nanometers = meters * 1000000000;
                    System.out.println(meters + " meters is equal to " + nanometers + " nanometers\n ");
                    break;

                case 5:
                    System.out.println("enter enter the data --> ");
                    meters = input.nextDouble();
                    feet = meters * 3.281;
                    System.out.println(meters + " meters is equal to " + feet + " feet\n ");
                    break;

                case 6:
                    System.out.println("enter enter the data --> ");
                    meters = input.nextDouble();
                    inches = meters * 39.37;
                    System.out.println(meters + " meters is equal to " + inches + " inches\n ");
                    break;

                case 7:
                    System.out.println("enter enter the data --> ");
                    centimeters = input.nextDouble();
                    micrometers = centimeters * 10000000;
                    System.out.println(centimeters + " centimeters is equal to " + micrometers + " micrometers\n ");
                    break;
                case 8:
                    System.out.println("enter enter the data --> ");
                    centimeters = input.nextDouble();
                    inches = centimeters * 0.3937;
                    System.out.println(centimeters + " centimeters is equal to " + inches + " inches\n ");
                    break;

                case 9:
                    System.out.println("enter enter the data --> ");
                    millimeters = input.nextDouble();
                    nanometers = millimeters * 1000000;
                    System.out.println(millimeters + " millimeters is equal to " + nanometers + " nanometers\n ");
                    break;

                case 10:
                    System.out.println("enter enter the data --> ");
                    kilometers = input.nextDouble();
                    centimeters = kilometers * 100000;
                    System.out.println(kilometers + " kilometers is equal to " + centimeters + " centimeters\n ");
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
