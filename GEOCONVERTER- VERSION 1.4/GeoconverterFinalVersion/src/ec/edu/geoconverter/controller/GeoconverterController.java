package ec.edu.geoconverter.controller;

import ec.edu.espe.geoconverter.model.Geoconverter;
import utils.FileManager;

/**
 *
 * @author Gaby Ramos
 */
public class GeoconverterController {

    public double convert(String sourceUnit, String targetUnit, double valueToTransform) {

        double result = 0.0F;
        Geoconverter geoconverter;

        if (sourceUnit.equals("Kilometers")) {
            geoconverter = new Geoconverter(valueToTransform, " km ");

            switch (targetUnit) {

                case "Meters":
                    result = geoconverter.kilometersToMeters();
                    break;

                case "Nanometers":
                    result = geoconverter.kilometersToNanometers();
                    break;

                case "Miles":
                    result = geoconverter.kilometersToMiles();
                    break;

                case "Feet":
                    result = geoconverter.kilometersToFeet();
                    break;

                case "Inches":
                    result = geoconverter.kilometersToInches();
                    break;

                case "Centimeters":
                    result = geoconverter.kilometersToCentimeters();
                    break;

                case "Millimeters":
                    result = geoconverter.kilometersToMillimeters();
                    break;

            }
        } else if (sourceUnit.equals("Meters")) {
            geoconverter = new Geoconverter(valueToTransform, " m ");

            switch (targetUnit) {

                case "Kilometers":
                    result = geoconverter.MetersTokilometers();
                    break;

                case "Nanometers":
                    result = geoconverter.MetersToNanometers();
                    break;

                case "Miles":
                    result = geoconverter.MetersToMiles();
                    break;

                case "Feet":
                    result = geoconverter.MetersToFeet();
                    break;

                case "Inches":
                    result = geoconverter.MetersToInches();
                    break;

                case "Centimeters":
                    result = geoconverter.MetersToCentimeters();
                    break;

                case "Millimeters":
                    result = geoconverter.MetersToMillimeters();
                    break;
            }

        } else if (sourceUnit.equals("Nanometers")) {
            geoconverter = new Geoconverter(valueToTransform, " nm ");

            switch (targetUnit) {

                case "Kilometers":
                    result = geoconverter.NanometersTokilometers();
                    break;

                case "Meters":
                    result = geoconverter.NanometersToMeters();
                    break;

                case "Miles":
                    result = geoconverter.NanometersToMiles();
                    break;

                case "Feet":
                    result = geoconverter.NanometersToFeet();
                    break;

                case "Inches":
                    result = geoconverter.NanometersToInches();
                    break;

                case "Centimeters":
                    result = geoconverter.NanometersToCentimeters();
                    break;

                case "Millimeters":
                    result = geoconverter.NanometersToMillimeters();
                    break;
            }

        } else if (sourceUnit.equals("Miles")) {
            geoconverter = new Geoconverter(valueToTransform, " mi ");

            switch (targetUnit) {

                case "Kilometers":
                    result = geoconverter.MilesTokilometers();
                    break;

                case "Meters":
                    result = geoconverter.MilesToMeters();
                    break;

                case "Nanometers":
                    result = geoconverter.MilesToNanometers();
                    break;

                case "Feet":
                    result = geoconverter.MilesToFeet();
                    break;

                case "Inches":
                    result = geoconverter.MilesToInches();
                    break;

                case "Centimeters":
                    result = geoconverter.MilesToCentimeters();
                    break;

                case "Millimeters":
                    result = geoconverter.MilesToMillimeters();
                    break;
            }

        } else if (sourceUnit.equals("Feet")) {
            geoconverter = new Geoconverter(valueToTransform, " ft ");

            switch (targetUnit) {

                case "Kilometers":
                    result = geoconverter.FeetTokilometers();
                    break;

                case "Meters":
                    result = geoconverter.FeetToMeters();
                    break;

                case "Nanometers":
                    result = geoconverter.FeetToNanometers();
                    break;

                case "Miles":
                    result = geoconverter.FeetToMiles();
                    break;

                case "Inches":
                    result = geoconverter.FeetToInches();
                    break;

                case "Centimeters":
                    result = geoconverter.FeetToCentimeters();
                    break;

                case "Millimeters":
                    result = geoconverter.FeetToMillimeters();
                    break;
            }

        } else if (sourceUnit.equals("Inches")) {
            geoconverter = new Geoconverter(valueToTransform, " In ");

            switch (targetUnit) {

                case "Kilometers":
                    result = geoconverter.InchesTokilometers();
                    break;

                case "Meters":
                    result = geoconverter.InchesToMeters();
                    break;

                case "Nanometers":
                    result = geoconverter.InchesToNanometers();
                    break;

                case "Miles":
                    result = geoconverter.InchesToMiles();
                    break;

                case "Feet":
                    result = geoconverter.InchesToFeet();
                    break;

                case "Centimeters":
                    result = geoconverter.InchesToCentimeters();
                    break;

                case "Millimeters":
                    result = geoconverter.InchesToMillimeters();
                    break;
            }

        } else if (sourceUnit.equals("Centimeters")) {
            geoconverter = new Geoconverter(valueToTransform, " cm ");

            switch (targetUnit) {

                case "Kilometers":
                    result = geoconverter.CentimetersTokilometers();
                    break;

                case "Meters":
                    result = geoconverter.CentimetersToMeters();
                    break;

                case "Nanometers":
                    result = geoconverter.CentimetersToNanometers();
                    break;

                case "Miles":
                    result = geoconverter.CentimetersToMiles();
                    break;

                case "Feet":
                    result = geoconverter.CentimetersToFeet();
                    break;

                case "Inches":
                    result = geoconverter.CentimetersToInches();
                    break;

                case "Millimeters":
                    result = geoconverter.CentimetersToMillimeters();
                    break;
            }
        }

        return result;
    }
    
    public void save(Geoconverter geoconverter ) {
        
        String data = geoconverter.getUnit()+ " ; " + geoconverter.getValue();
        FileManager.save(data, "Geoconverter");
    }
    public static  String[] read(){
        
        String[] data = new String[FileManager.returnSize("Geoconverter")];
        data = FileManager.read(" geoconverter.csv ");
        
        return data;
    }
    

}
