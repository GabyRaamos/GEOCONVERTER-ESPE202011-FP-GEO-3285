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
        double[] Kilometers;
        double[] Meters;
        double[] Nanometers;
        double[] Miles;
        double[] Feet;
        double[] Inches;
        double[] Centimeters;
        double[] Millimeters;
        double[] Gigameters;
        double yards;
        double centimeters;
        double millimeters;
        double nanometers;
        double inches;
        double micrometers;
        double meters;

        do {

            printConvertionMenu();

            option = input.nextInt();

            switch (option) {

                case 1:

                    System.out.println("enter the data in Kilometers : ");
                    Kilometers = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Kilometers[i] = input.nextDouble();
                    }

                    meters = transformKmToM(Kilometers);
                    System.out.println(Arrays.toString(Kilometers) + "kilometers is equal to " + meters + " meters\n ");

                    break;

                case 2:

                    System.out.println("enter the data in Meters : ");
                    Meters = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Meters[i] = input.nextDouble();
                    }
                    centimeters = transformMToCm(Meters);
                    System.out.println(Arrays.toString(Meters) + "meters is equal to " + centimeters + " centimeters\n ");

                    break;

                case 3:

                    System.out.println("enter the data in Meters : ");
                    Meters = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Meters[i] = input.nextDouble();
                    }
                    millimeters = transformMToMm(Meters);
                    System.out.println(Arrays.toString(Meters) + "meters is equal to " + millimeters + " millimeters\n ");

                    break;

                case 4:
                    System.out.println("enter  the data in Nanometers");
                    Nanometers = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Nanometers[i] = input.nextDouble();
                    }
                    meters = transformMtoNano(Nanometers);
                    System.out.println(Arrays.toString(Nanometers) + "nanometers is equal to " + meters + " meters\n");
                    break;

                case 5:

                    System.out.println("enter  the data in Feet");
                    Feet = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Feet[i] = input.nextDouble();
                    }
                    meters = transformMtoFeed(Feet);
                    System.out.println(Arrays.toString(Feet) + "feet is equal to " + meters + " meters\n");

                    break;

                case 6:

                    System.out.println("enter the data in Inches");
                    Inches = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Inches[i] = input.nextDouble();
                    }
                    meters = transformMtoInches(Inches);
                    System.out.println(Arrays.toString(Inches) + "inches is equal to " + meters + " meters\n");

                    break;

                case 7:

                    System.out.println("enter the data in Centimeters : ");
                    Centimeters = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Centimeters[i] = input.nextDouble();
                    }
                    micrometers = transformCmtoMc(Centimeters);
                    System.out.println(Arrays.toString(Centimeters) + "centimeters is equal to " + micrometers + " micrometers\n ");

                    break;

                case 8:

                    System.out.println("enter the data in Centimeters : ");
                    Centimeters = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Centimeters[i] = input.nextDouble();
                    }
                    inches = transformCmtoIn(Centimeters);
                    System.out.println(Arrays.toString(Centimeters) + "centimeters is equal to " + inches + " inches\n ");

                    break;

                case 9:

                    System.out.println("enter the data in Millimeters : ");
                    Millimeters = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Millimeters[i] = input.nextDouble();
                    }
                    nanometers = transformMmToNano(Millimeters);
                    System.out.println(Arrays.toString(Millimeters) + "millimeters is equal to " + nanometers + " nanometers\n ");

                    break;

                case 10:

                    System.out.println("enter the data in Kilometers : ");
                    Kilometers = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Kilometers[i] = input.nextDouble();
                    }
                    centimeters = transformKmToCm(Kilometers);
                    System.out.println(Arrays.toString(Kilometers) + "kilometers is equal to " + centimeters + " centimeters\n ");

                    break;

                case 11:

                    System.out.println("enter the data in Miles : ");
                    Miles = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Miles[i] = input.nextDouble();
                    }
                    meters = transformMiToM(Miles);
                    System.out.println(Arrays.toString(Miles) + "miles is equal to " + meters + " meters\n ");

                    break;

                case 12:

                    System.out.println("enter the data in Meters : ");
                    Meters = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Meters[i] = input.nextDouble();
                    }
                    yards = transformMtoYd(Meters);
                    System.out.println(Arrays.toString(Meters) + "meters is equal to " + yards + " yards\n ");

                    break;

                case 13:

                    System.out.println("enter the data in Gigameters : ");
                    Gigameters = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Gigameters[i] = input.nextDouble();
                    }
                    meters = transformGmToM(Gigameters);
                    System.out.println(Arrays.toString(Gigameters) + "gigameters is equal to " + meters + " meters\n ");

                    break;

                case 14:

                    System.out.println("enter the data in Kilometers : ");
                    Kilometers = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Kilometers[i] = input.nextDouble();
                    }
                    millimeters = transformKmToMm(Kilometers);
                    System.out.println(Arrays.toString(Kilometers) + " kilometers is equal to " + millimeters + " millimeters\n ");

                    break;

                case 15:

                    System.out.println("enter the data in Miles : ");
                    Miles = new double[1];

                    for (int i = 0; i < 1; i++) {
                        Miles[i] = input.nextDouble();

                    }
                    millimeters = transformMilesToMm(Miles);
                    System.out.println(Arrays.toString(Miles) + " miles is equal to " + millimeters + " millimeters\n ");

                    break;

                case 16:
                    System.out.println(" \n\n ******** GOOD BYE USER ******** \n"
                            + " ********************************");
                    System.out.println(" ******THANKS FOR CHOOSING US****");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
        } while (option != 16);

    }

    private static void printConvertionMenu() {
        System.out.println("███████░▒*      WELCOME TO GEOCONVERTER         *░▒███████\n"
                + "█                          VERSION 1.3                            █\n"
                + "█                        03  MARCH  2021                          █\n"
                + "████████████████████ ███████████████████████\n"
                + "                   Transformer of units of length                \n"
                + "                     _________         \n");

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
        System.out.println("▒ 14. Kilometers to millimeters");
        System.out.println("▒ 15. Miles to millimeters");
        System.out.println("█ 16. Exit");

        System.out.println("Enter your menu option >> ");
    }

    private static double transformKmToM(double[] Kilometers) {
        double meters = 0;
        for (int i = 0; i < Kilometers.length; i++) {
            meters = Kilometers[i] * 1000;

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

    private static double transformMToMm(double[] Meters) {
        double millimeters = 0;
        for (int i = 0; i < Meters.length; i++) {
            millimeters = (Meters[i] * 1000);
        }
        return millimeters;

    }

    private static double transformMtoNano(double[] Nanometers) {
        double meters = 0;
        for (int i = 0; i < Nanometers.length; i++) {
            meters = (Nanometers[i] * 1000000);
        }
        return meters;
    }

    private static double transformMtoFeed(double[] Feet) {
        double meters = 0;
        for (int i = 0; i < Feet.length; i++) {
            meters = (Feet[i] * 3.281);
        }
        return meters;
    }

    private static double transformMtoInches(double[] Inches) {
        double meters = 0;
        for (int i = 0; i < Inches.length; i++) {
            meters = (Inches[i] * 39.37);
        }
        return meters;

    }

    private static double transformCmtoMc(double[] Centimeters) {
        double micrometers = 0;
        for (int i = 0; i < Centimeters.length; i++) {
            micrometers = (Centimeters[i] * 10000000);
        }
        return micrometers;

    }

    private static double transformCmtoIn(double[] Centimeters) {
        double inches = 0;
        for (int i = 0; i < Centimeters.length; i++) {
            inches = (Centimeters[i] * 0.3937);
        }
        return inches;

    }

    private static double transformMmToNano(double[] Millimeters) {
        double nanometers = 0;
        for (int i = 0; i < Millimeters.length; i++) {
            nanometers = (Millimeters[i] * 1000000);
        }
        return nanometers;

    }

    private static double transformKmToCm(double[] Kilometers) {
        double centimeters = 0;
        for (int i = 0; i < Kilometers.length; i++) {
            centimeters = (Kilometers[i] * 100000);
        }
        return centimeters;

    }

    private static double transformMiToM(double[] Miles) {
        double meters = 0;
        for (int i = 0; i < Miles.length; i++) {
            meters = (Miles[i] * 1609.344);
        }
        return meters;

    }

    private static double transformMtoYd(double[] Meters) {
        double yards = 0;
        for (int i = 0; i < Meters.length; i++) {
            yards = (Meters[i] * 1.09361);
        }
        return yards;

    }

    private static double transformGmToM(double[] Gigameters) {
        double meters = 0;
        for (int i = 0; i < Gigameters.length; i++) {
            meters = (Gigameters[i] * 1000000000);
        }
        return meters;

    }

    private static double transformKmToMm(double[] Kilometers) {
        double milimeters = 0;

        for (int i = 0; i < Kilometers.length; i++) {
            milimeters = (Kilometers[i] * 1000000000);
        }

        return milimeters;
    }

    private static double transformMilesToMm(double[] Miles) {
        double milimeters = 0;

        for (int i = 0; i < Miles.length; i++) {
            milimeters = (Miles[i] * 1.609 * 2.72 + 6);
        }

        return milimeters;
    }
}
