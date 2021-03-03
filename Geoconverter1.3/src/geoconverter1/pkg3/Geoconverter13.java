package geoconverter1.pkg3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author GROUP 8
 */
public class Geoconverter13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {

            printConvertionMenu();

            option = input.nextInt();

            switch (option) {

                case 1:

                    System.out.println("enter the data in Kilometers : ");
                    double[] Kilometers = new double[1];
                    double meters;
                    for (int i = 0; i < 1; i++) {
                        Kilometers[i] = input.nextDouble();
                    }
                    System.out.println(Arrays.toString(Kilometers) + "kilometers is equal to " + transformKmToM(Kilometers) + " meters\n ");

                    break;

                case 2:

                    System.out.println("enter the data in Meters : ");
                    double[] Meters = new double[1];
                    double centimeters;
                    for (int i = 0; i < 1; i++) {
                        Meters[i] = input.nextDouble();
                    }
                    System.out.println(Arrays.toString(Meters) + "meters is equal to " + transformMToCm(Meters) + " centimeters\n ");

                    break;

                case 3:

                    System.out.println("enter the data in Meters : ");
                    double[] Meters2 = new double[1];
                    double millimeters;
                    for (int i = 0; i < 1; i++) {
                        Meters2[i] = input.nextDouble();
                    }

                    System.out.println(Arrays.toString(Meters2) + "meters is equal to " + transformMToMm(Meters2) + " millimeters\n ");

                    break;

                case 4:
                    System.out.println("enter  the data in Nanometers");
                    double[] Nanometers = new double[1];
                    double meters2;
                    for (int i = 0; i < 1; i++) {
                        Nanometers[i] = input.nextDouble();
                    }
                    System.out.println(Arrays.toString(Nanometers) + "nanometers is equal to " + transformMtoNano(Nanometers) + " meters\n");

                    break;

                case 5:
                    System.out.println("enter  the data in Feet");
                    double[] Feet = new double[1];
                    double meters3;
                    for (int i = 0; i < 1; i++) {
                        Feet[i] = input.nextDouble();
                    }
                    System.out.println(Arrays.toString(Feet) + "feet is equal to " + transformMtoFeed(Feet) + " meters\n");

                    break;

                case 6:
                    transformerMtoIn(input);
                    break;

                case 7:
                    transformerCmtoMc(input);
                    break;
                case 8:
                    transformerCmtoIn(input);
                    break;

                case 9:
                    transformerMmToNano(input);
                    break;

                case 10:
                    transformerKmToCm(input);
                    break;
                case 11:
                    transformerMiToM(input);
                    break;

                case 12:
                    transformerMtoYd(input);
                    break;

                case 13:
                    transformGmToM(input);
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

    private static void printConvertionMenu() {
        System.out.println("███████░▒*      WELCOME TO GEOCONVERTER         *░▒███████\n"
                + "█                          VERSION 1.3                            █\n"
                + "█                        03  MARCH  2021                          █\n"
                + "████████████████████ ███████████████████████\n"
                + "                   Transformer of units of length                \n"
                + "                     _______________________         \n");

        System.out.println("  What you need to transform? ");
        System.out.println("▒ 1.  Kilometers to meters.");
        System.out.println("▒ 2.  Meters to centimeters.");
        System.out.println("▒ 3.  Meters to millimeters");
        System.out.println("▒ 4.  Nanometers to meters.");
        System.out.println("▒ 5.  Feet to meters.");
        System.out.println("▒ 6.  Inches to meters.");
        System.out.println("▒ 7.  Centimeters to micrometers.");
        System.out.println("▒ 8.  Centimeters to inches.");
        System.out.println("▒ 9.  Millimeters to nanometers.");
        System.out.println("▒ 10. Kilometers to centimeters.");
        System.out.println("▒ 11. Miles to meters.");
        System.out.println("▒ 12. Meters to yards.");
        System.out.println("▒ 13. Gigameters to meters.");
        System.out.println("█ 14. Exit");

        System.out.println("Enter your menu option >> ");
    }

    private static double transformKmToM(double[] Kilometers) {
        double meters = 0;
        for (int i = 0; i < Kilometers.length; i++) {
            meters = (Kilometers[i] * 1000);

        }
        return meters;
    }

    private static double transformMToCm(double[] Meters) {
        double centimeters = 0;
        for (int i = 0; i < Meters.length; i++) {
            centimeters = (Meters[i] * 100);
        }
        return centimeters;
    }

    private static double transformMToMm(double[] Meters2) {
        double millimeters = 0;
        for (int i = 0; i < Meters2.length; i++) {
            millimeters = (Meters2[i] * 1000);
        }
        return millimeters;

    }

    private static double transformMtoNano(double[] Nanometers) {
        double meters2 = 0;
        for (int i = 0; i < Nanometers.length; i++) {
            meters2 = (Nanometers[i] * 1000000);
        }
        return meters2;
    }

    private static double transformMtoFeed(double[] Feet) {
        double meters3 = 0;
        for (int i = 0; i < Feet.length; i++) {
            meters3 = (Feet[i] * 3.281);
        }
        return meters3;
    }

    private static void transformGmToM(Scanner input) {
        double gigameters;
        double meters;
        System.out.println("enter enter the data --> ");
        gigameters = input.nextDouble();
        meters = gigameters * 1000000000;
        System.out.println(gigameters + " gigameters is equal to " + meters + " meters\n ");
    }

    private static void transformerMtoYd(Scanner input) {
        double meters;
        double yard;
        System.out.println("enter enter the data --> ");
        meters = input.nextDouble();
        yard = meters * 1.09361;
        System.out.println(meters + " meters is equal to " + yard + " yard\n ");
    }

    private static void transformerMiToM(Scanner input) {
        double miles;
        double meters;
        System.out.println("enter enter the data --> ");
        miles = input.nextDouble();
        meters = miles * 1609.344;
        System.out.println(miles + "miles is equal to " + meters + " meters\n ");
    }

    private static void transformerKmToCm(Scanner input) {
        double kilometers;
        double centimeters;
        System.out.println("enter enter the data --> ");
        kilometers = input.nextDouble();
        centimeters = kilometers * 100000;
        System.out.println(kilometers + " kilometers is equal to " + centimeters + " centimeters\n ");
    }

    private static void transformerMmToNano(Scanner input) {
        double millimeters;
        double nanometers;
        System.out.println("enter enter the data --> ");
        millimeters = input.nextDouble();
        nanometers = millimeters * 1000000;
        System.out.println(millimeters + " millimeters is equal to " + nanometers + " nanometers\n ");
    }

    private static void transformerCmtoIn(Scanner input) {
        double centimeters;
        double inches;
        System.out.println("enter enter the data --> ");
        centimeters = input.nextDouble();
        inches = centimeters * 0.3937;
        System.out.println(centimeters + " centimeters is equal to " + inches + " inches\n ");
    }

    private static void transformerCmtoMc(Scanner input) {
        double centimeters;
        double micrometers;
        System.out.println("enter enter the data --> ");
        centimeters = input.nextDouble();
        micrometers = centimeters * 10000000;
        System.out.println(centimeters + " centimeters is equal to " + micrometers + " micrometers\n ");
    }

    private static void transformerMtoIn(Scanner input) {
        double meters;
        double inches;
        System.out.println("enter enter the data --> ");
        meters = input.nextDouble();
        inches = meters * 39.37;
        System.out.println(meters + " meters is equal to " + inches + " inches\n ");
    }

}
