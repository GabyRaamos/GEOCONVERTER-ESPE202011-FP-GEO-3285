package ec.edu.espe.geoconverter.model;

/**
 *
 * @author Gaby Ramos
 */
public class Geoconverter {
    
     
    double valueToTransform;
    double valueToTransformed;
    String unit;

    public Geoconverter() {
    }


    public Geoconverter(double valueToTransform, String unit) {
        this.valueToTransform = valueToTransform;
        this.unit = unit;
    }
    
    public Geoconverter(double valueToTransformed) {
        this.valueToTransformed = valueToTransformed;
    }
     
    public double kilometersToMeters() {
        return valueToTransform * 1000;
    }

    public double kilometersToNanometers() {
        return valueToTransform * (1e+12);
    }

    public double kilometersToMiles() {
        return valueToTransform * 0.621371;
    }

    public double kilometersToFeet() {
        return valueToTransform * 3280.84;
    }

    public double kilometersToInches() {
        return valueToTransform * 39370.1;
    }
    
    public double kilometersToCentimeters() {
        return valueToTransform * 100000;
    }
    
    public double kilometersToMillimeters() {
        return valueToTransform * 1000000;
    }
    
    
    
    
    
    public double MetersTokilometers() {
        return valueToTransform * 0.001;
    }

    public double MetersToNanometers() {
        return valueToTransform * 1000000000;
    }

    public double MetersToMiles() {
        return valueToTransform / 1609;
    }

    public double MetersToFeet() {
        return valueToTransform * 3.281;
    }

    public double MetersToInches() {
        return valueToTransform * 39.37;
    }
    
    public double MetersToCentimeters() {
        return valueToTransform * 100;
    }
    
    public double MetersToMillimeters() {
        return valueToTransform * 1000;
    }

    
    
    
    public double NanometersTokilometers() {
        return valueToTransform / (1e-12);
    }

    public double NanometersToMeters() {
        return valueToTransform / (1e-9);
    }

    public double NanometersToMiles() {
        return valueToTransform / (6.21371e-13);
    }

    public double NanometersToFeet() {
        return valueToTransform / (3.28084e-9);
    }

    public double NanometersToInches() {
        return valueToTransform / (3.93701e-8);
    }
    
    public double NanometersToCentimeters() {
        return valueToTransform / (1e-7);
    }
    
    public double NanometersToMillimeters() {
        return valueToTransform / (1e-6);
    }
    
    
    
    public double MilesTokilometers() {
        return valueToTransform * 1.60934;
    }

    public double MilesToMeters() {
        return valueToTransform * 1609.34;
    }

    public double MilesToNanometers() {
        return valueToTransform * (1.609e+12);
    }

    public double MilesToFeet() {
        return valueToTransform * 5280;
    }

    public double MilesToInches() {
        return valueToTransform * 63360;
    }
    
    public double MilesToCentimeters() {
        return valueToTransform * 160934;
    }
    
    public double MilesToMillimeters() {
        return valueToTransform * (1.609e+6);
    }   
    

    
    
    
    public double FeetTokilometers() {
        return valueToTransform / 0.0003048;
    }

    public double FeetToMeters() {
        return valueToTransform / 0.3048;
    }

    public double FeetToNanometers() {
        return valueToTransform * (3.048e+8);
    }

    public double FeetToMiles() {
        return valueToTransform / 0.000189394;
    }

    public double FeetToInches() {
        return valueToTransform * 12;
    }
    
    public double FeetToCentimeters() {
        return valueToTransform * 30.48;
    }
    
    public double FeetToMillimeters() {
        return valueToTransform * (304.8);
    }    
    
    
    
    
    public double InchesTokilometers() {
        return valueToTransform * 0.0003048;
    }

    public double InchesToMeters() {
        return valueToTransform * 0.3048;
    }

    public double InchesToNanometers() {
        return valueToTransform * (3.048e+8);
    }

    public double InchesToMiles() {
        return valueToTransform * 0.000189394;
    }

    public double InchesToFeet() {
        return valueToTransform * 12;
    }
    
    public double InchesToCentimeters() {
        return valueToTransform * 30.48;
    }
    
    public double InchesToMillimeters() {
        return valueToTransform * (304.8);
    }    
    
  
    
    
    public double CentimetersTokilometers() {
        return valueToTransform / 100000;
    }

    public double CentimetersToMeters() {
        return valueToTransform / 100;
    }

    public double CentimetersToNanometers() {
        return valueToTransform * (1e+7);
    }

    public double CentimetersToMiles() {
        return valueToTransform / 160934;
    }

    public double CentimetersToFeet() {
        return valueToTransform / 30.48;
    }
    
    public double CentimetersToInches() {
        return valueToTransform / 2.54;
    }
    
    public double CentimetersToMillimeters() {
        return valueToTransform * 10;
    }   
    
    
    
    
    
    public double MillimetersTokilometers() {
        return valueToTransform / (1e+6);
    }

    public double MillimetersToMeters() {
        return valueToTransform / 1000;
    }

    public double MillimetersToNanometers() {
        return valueToTransform * 1000000;
    }

    public double MillimetersToMiles() {
        return valueToTransform / (1.609e+6);
    }

    public double MillimetersToFeet() {
        return valueToTransform / 305;
    }
    
    public double MillimetersToInches() {
        return valueToTransform / 25.4;
    }
    
    public double MillimetersToCentimeters() {
        return valueToTransform / 10;
    }      
    
    
    
    
    
    public double getValueToTransform() {
        return valueToTransform;
    }

    public void setValueToTransform(double valueToTransform) {
        this.valueToTransform = valueToTransform;
    }

    public double getValueToTransformed() {
        return valueToTransformed;
    }

    public void setValueToTransformed(double valueToTransformed) {
        this.valueToTransformed = valueToTransformed;
    }
     public String getUnit() {
        return unit;
    }

    public void setUnit(String valueToTransformed) {
        this.unit = unit;
    }

}
