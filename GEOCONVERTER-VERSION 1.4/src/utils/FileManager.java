/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class FileManager {

    public static boolean createFile(String fileGeoconverter) {
        boolean created = false;
        try {
            File file = new File(fileGeoconverter + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileGeoconverter) {
        boolean saved = false;

        createFile(fileGeoconverter);

        try {
            FileWriter myWrite = new FileWriter(fileGeoconverter + ".csv", true);
            myWrite.write(data + System.getProperty("line.separator"));
            myWrite.close();
            System.out.println("a new record of " + fileGeoconverter + " was saved");
            saved = true;
        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }

        return saved;

    }

    public static void readLines(String fileGeoconverter, String[] results) {
        int counter = 0;
        try {
            File myObj = new File(fileGeoconverter + ".csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                results[counter++] = data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static int countLines(String fileGeoconverter) {
        BufferedReader br = null;
        int numberOfLines = 0;
        try {

            File file = new File(fileGeoconverter + ".csv");
            br = new BufferedReader(new FileReader(file));
            try {
                while ((br.readLine()) != null) {
                    numberOfLines++;
                }
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            return numberOfLines;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return numberOfLines;
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

    public static String[] read(String geoconvertercvs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}