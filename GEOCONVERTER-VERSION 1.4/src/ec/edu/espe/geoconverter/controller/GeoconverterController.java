package ec.edu.espe.geoconverter.controller;

import ec.edu.espe.geoconverter.model.Geoconverter;
import utils.FileManager;

/**
 *
 * @author Gaby Ramos 
 */
public class GeoconverterController {
    
    public void save(Geoconverter geoconverter) {

        String data = geoconverter.getMeters() + ";" + geoconverter.getMiles() + ";" + geoconverter.getCentimeters() + ":" + geoconverter.getMillimeters() + ";"
                + geoconverter.getNanometers() + ";" + geoconverter.getInches() + ";" + geoconverter.getMicrometers() + ";" + geoconverter.getFeet() + ";"
                + geoconverter.getGigameters() + ";" + geoconverter.getYard();
        FileManager.save(data, "geoconverter");
    }

    public String[] read() {
        String[] data;
        data = FileManager.read("geoconverter.cvs");
        return data;
    }
}