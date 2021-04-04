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

   
    public static String[] read(String geoconvertercvs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
