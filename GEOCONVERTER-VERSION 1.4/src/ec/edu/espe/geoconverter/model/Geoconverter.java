package ec.edu.espe.geoconverter.model;

/**
 *
 * @author Gaby Ramos
 */
public class Geoconverter {

    /**
     * @return the sourceUnit
     */
    private String pichinchaCantons;
    private float length;
    private float latitude;
    private String sourceUnit;
    private String targetUnit;
    private double valueToTransform;
    private double valueTransformed;

    public Geoconverter() {
    }

    public Geoconverter(String pichinchaCantons, float length, float latitude, double valueToTransform, String sourceUnit, double valueTransformed, String targetUnit) {

        this.pichinchaCantons = pichinchaCantons;
        this.length = length;
        this.latitude = latitude;
        this.valueToTransform = valueToTransform;
        this.valueTransformed = valueTransformed;
        this.sourceUnit = sourceUnit;
        this.targetUnit = targetUnit;

    }

    public Geoconverter(double valueToTransform, String sourceUnit, double valueToTransform0, String targetUnit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Geoconverter(String pichinchaCantons, float length, float latitude) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the pichinchaCantons
     */
    public String getPichinchaCantons() {
        return pichinchaCantons;
    }

    /**
     * @param pichinchaCantons the pichinchaCantons to set
     */
    public void setPichinchaCantons(String pichinchaCantons) {
        this.pichinchaCantons = pichinchaCantons;
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     * @return the latitude
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public double kilometersToMeters() {
        return getValueToTransform() * 1000;
    }

    public double kilometersToNanometers() {
        return getValueToTransform() * (1e+12);
    }

    public double kilometersToMiles() {
        return getValueToTransform() * 0.621371;
    }

    public double kilometersToFeet() {
        return getValueToTransform() * 3280.84;
    }

    public double kilometersToInches() {
        return getValueToTransform() * 39370.1;
    }

    public double kilometersToCentimeters() {
        return getValueToTransform() * 100000;
    }

    public double kilometersToMillimeters() {
        return getValueToTransform() * 1000000;
    }

    public double MetersTokilometers() {
        return getValueToTransform() * 0.001;
    }

    public double MetersToNanometers() {
        return getValueToTransform() * 1000000000;
    }

    public double MetersToMiles() {
        return getValueToTransform() / 1609;
    }

    public double MetersToFeet() {
        return getValueToTransform() * 3.281;
    }

    public double MetersToInches() {
        return getValueToTransform() * 39.37;
    }

    public double MetersToCentimeters() {
        return getValueToTransform() * 100;
    }

    public double MetersToMillimeters() {
        return getValueToTransform() * 1000;
    }

    public double NanometersTokilometers() {
        return getValueToTransform() / (1e-12);
    }

    public double NanometersToMeters() {
        return getValueToTransform() / (1e-9);
    }

    public double NanometersToMiles() {
        return getValueToTransform() / (6.21371e-13);
    }

    public double NanometersToFeet() {
        return getValueToTransform() / (3.28084e-9);
    }

    public double NanometersToInches() {
        return getValueToTransform() / (3.93701e-8);
    }

    public double NanometersToCentimeters() {
        return getValueToTransform() / (1e-7);
    }

    public double NanometersToMillimeters() {
        return getValueToTransform() / (1e-6);
    }

    public double MilesTokilometers() {
        return getValueToTransform() * 1.60934;
    }

    public double MilesToMeters() {
        return getValueToTransform() * 1609.34;
    }

    public double MilesToNanometers() {
        return getValueToTransform() * (1.609e+12);
    }

    public double MilesToFeet() {
        return getValueToTransform() * 5280;
    }

    public double MilesToInches() {
        return getValueToTransform() * 63360;
    }

    public double MilesToCentimeters() {
        return getValueToTransform() * 160934;
    }

    public double MilesToMillimeters() {
        return getValueToTransform() * (1.609e+6);
    }

    public double FeetTokilometers() {
        return getValueToTransform() / 0.0003048;
    }

    public double FeetToMeters() {
        return getValueToTransform() / 0.3048;
    }

    public double FeetToNanometers() {
        return getValueToTransform() * (3.048e+8);
    }

    public double FeetToMiles() {
        return getValueToTransform() / 0.000189394;
    }

    public double FeetToInches() {
        return getValueToTransform() * 12;
    }

    public double FeetToCentimeters() {
        return getValueToTransform() * 30.48;
    }

    public double FeetToMillimeters() {
        return getValueToTransform() * (304.8);
    }

    public double InchesTokilometers() {
        return getValueToTransform() * 0.0003048;
    }

    public double InchesToMeters() {
        return getValueToTransform() * 0.3048;
    }

    public double InchesToNanometers() {
        return getValueToTransform() * (3.048e+8);
    }

    public double InchesToMiles() {
        return getValueToTransform() * 0.000189394;
    }

    public double InchesToFeet() {
        return getValueToTransform() * 12;
    }

    public double InchesToCentimeters() {
        return getValueToTransform() * 30.48;
    }

    public double InchesToMillimeters() {
        return getValueToTransform() * (304.8);
    }

    public double CentimetersTokilometers() {
        return getValueToTransform() / 100000;
    }

    public double CentimetersToMeters() {
        return getValueToTransform() / 100;
    }

    public double CentimetersToNanometers() {
        return getValueToTransform() * (1e+7);
    }

    public double CentimetersToMiles() {
        return getValueToTransform() / 160934;
    }

    public double CentimetersToFeet() {
        return getValueToTransform() / 30.48;
    }

    public double CentimetersToInches() {
        return getValueToTransform() / 2.54;
    }

    public double CentimetersToMillimeters() {
        return getValueToTransform() * 10;
    }

    public double MillimetersTokilometers() {
        return getValueToTransform() / (1e+6);
    }

    public double MillimetersToMeters() {
        return getValueToTransform() / 1000;
    }

    public double MillimetersToNanometers() {
        return getValueToTransform() * 1000000;
    }

    public double MillimetersToMiles() {
        return getValueToTransform() / (1.609e+6);
    }

    public double MillimetersToFeet() {
        return getValueToTransform() / 305;
    }

    public double MillimetersToInches() {
        return getValueToTransform() / 25.4;
    }

    public double MillimetersToCentimeters() {
        return getValueToTransform() / 10;
    }

    public double getValueToTransform() {
        return valueToTransform;
    }

    public void setValueToTransform(double valueToTransform) {
        this.valueToTransform = valueToTransform;
    }

    public double getValueTransformed() {
        return valueTransformed;
    }

    public void setValueTransformed(double valueTransformed) {
        this.valueTransformed = valueTransformed;
    }

    public String getSourceUnit() {
        return sourceUnit;
    }

    public void setSourceUnit(String sourceUnit) {
        this.sourceUnit = sourceUnit;
    }

    public String getTargetUnit() {
        return targetUnit;
    }

    public void setTargetUnit(String targetUnit) {
        this.targetUnit = targetUnit;
    }
}
