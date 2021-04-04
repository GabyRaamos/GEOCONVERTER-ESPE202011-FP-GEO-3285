package ec.edu.espe.geoconverter.model;

/**
 *
 * @author Gaby Ramos
 */
public class Geoconverter {

    double value;
    String unit;

    public Geoconverter() {
    }

    public Geoconverter(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }
     
        double targetUnit;
        double valueToTransform;
                
    public double kilometersToMeters() {
        return value * 1000;
    }

    public double kilometersToNanometers() {
        return value * (1e+12);
    }

    public double kilometersToMiles() {
        return value * 0.621371;
    }

    public double kilometersToFeet() {
        return value * 3280.84;
    }

    public double kilometersToInches() {
        return value * 39370.1;
    }
    
    public double kilometersToCentimeters() {
        return value * 100000;
    }
    
    public double kilometersToMillimeters() {
        return value * 1000000;
    }
    
    
    
    
    
    public double MetersTokilometers() {
        return value * 0.001;
    }

    public double MetersToNanometers() {
        return value * 1000000000;
    }

    public double MetersToMiles() {
        return value / 1609;
    }

    public double MetersToFeet() {
        return value * 3.281;
    }

    public double MetersToInches() {
        return value * 39.37;
    }
    
    public double MetersToCentimeters() {
        return value * 100;
    }
    
    public double MetersToMillimeters() {
        return value * 1000;
    }

    
    
    
    public double NanometersTokilometers() {
        return value / (1e-12);
    }

    public double NanometersToMeters() {
        return value / (1e-9);
    }

    public double NanometersToMiles() {
        return value / (6.21371e-13);
    }

    public double NanometersToFeet() {
        return value / (3.28084e-9);
    }

    public double NanometersToInches() {
        return value / (3.93701e-8);
    }
    
    public double NanometersToCentimeters() {
        return value / (1e-7);
    }
    
    public double NanometersToMillimeters() {
        return value / (1e-6);
    }
    
    
    
    public double MilesTokilometers() {
        return value * 1.60934;
    }

    public double MilesToMeters() {
        return value * 1609.34;
    }

    public double MilesToNanometers() {
        return value * (1.609e+12);
    }

    public double MilesToFeet() {
        return value * 5280;
    }

    public double MilesToInches() {
        return value * 63360;
    }
    
    public double MilesToCentimeters() {
        return value * 160934;
    }
    
    public double MilesToMillimeters() {
        return value * (1.609e+6);
    }   
    

    
    
    
    public double FeetTokilometers() {
        return value / 0.0003048;
    }

    public double FeetToMeters() {
        return value / 0.3048;
    }

    public double FeetToNanometers() {
        return value * (3.048e+8);
    }

    public double FeetToMiles() {
        return value / 0.000189394;
    }

    public double FeetToInches() {
        return value * 12;
    }
    
    public double FeetToCentimeters() {
        return value * 30.48;
    }
    
    public double FeetToMillimeters() {
        return value * (304.8);
    }    
    
    
    
    
    public double InchesTokilometers() {
        return value * 0.0003048;
    }

    public double InchesToMeters() {
        return value * 0.3048;
    }

    public double InchesToNanometers() {
        return value * (3.048e+8);
    }

    public double InchesToMiles() {
        return value * 0.000189394;
    }

    public double InchesToFeet() {
        return value * 12;
    }
    
    public double InchesToCentimeters() {
        return value * 30.48;
    }
    
    public double InchesToMillimeters() {
        return value * (304.8);
    }    
    
  
    
    
    public double CentimetersTokilometers() {
        return value / 100000;
    }

    public double CentimetersToMeters() {
        return value / 100;
    }

    public double CentimetersToNanometers() {
        return value * (1e+7);
    }

    public double CentimetersToMiles() {
        return value / 160934;
    }

    public double CentimetersToFeet() {
        return value / 30.48;
    }
    
    public double CentimetersToInches() {
        return value / 2.54;
    }
    
    public double CentimetersToMillimeters() {
        return value * 10;
    }   
    
    
    
    
    
    public double MillimetersTokilometers() {
        return value / (1e+6);
    }

    public double MillimetersToMeters() {
        return value / 1000;
    }

    public double MillimetersToNanometers() {
        return value * 1000000;
    }

    public double MillimetersToMiles() {
        return value / (1.609e+6);
    }

    public double MillimetersToFeet() {
        return value / 305;
    }
    
    public double MillimetersToInches() {
        return value / 25.4;
    }
    
    public double MillimetersToCentimeters() {
        return value / 10;
    }      
    
    
    
    
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
