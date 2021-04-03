package ec.edu.espe.geoconverter.model;

/**
 *
 * @author Group 8
 */
public class Geoconverter {

    private double kilometers;
    private double meters;
    private double miles;
    private double centimeters;
    private double millimeters;
    private double nanometers;
    private double inches;
    private double micrometers;
    private double feet;
    private double gigameters;
    private double yard;

    public Geoconverter(double kilometers,double meters, double miles, double centimeters, double millimeters, double nanometers, double inches, double micrometers, double feet, double gigameters, double yard) {
        this.kilometers = kilometers;
        this.meters = meters;
        this.miles = miles;
        this.centimeters = centimeters;
        this.millimeters = millimeters;
        this.nanometers = nanometers;
        this.inches = inches;
        this.micrometers = micrometers;
        this.feet = feet;
        this.gigameters = gigameters;
        this.yard = yard;
    }

     /**
     * @return the kilometers
     */
    public double getKilometers() {
        return kilometers;
    }

    /**
     * @param kilometers the kilometers to set
     */
    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }
    
    /**
     * @return the meters
     */
    public double getMeters() {
        return meters;
    }

    /**
     * @param meters the meters to set
     */
    public void setMeters(double meters) {
        this.meters = meters;
    }

    /**
     * @return the miles
     */
    public double getMiles() {
        return miles;
    }

    /**
     * @param miles the miles to set
     */
    public void setMiles(double miles) {
        this.miles = miles;
    }

    /**
     * @return the centimeters
     */
    public double getCentimeters() {
        return centimeters;
    }

    /**
     * @param centimeters the centimeters to set
     */
    public void setCentimeters(double centimeters) {
        this.centimeters = centimeters;
    }

    /**
     * @return the millimeters
     */
    public double getMillimeters() {
        return millimeters;
    }

    /**
     * @param millimeters the millimeters to set
     */
    public void setMillimeters(double millimeters) {
        this.millimeters = millimeters;
    }

    /**
     * @return the nanometers
     */
    public double getNanometers() {
        return nanometers;
    }

    /**
     * @param nanometers the nanometers to set
     */
    public void setNanometers(double nanometers) {
        this.nanometers = nanometers;
    }

    /**
     * @return the inches
     */
    public double getInches() {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(double inches) {
        this.inches = inches;
    }

    /**
     * @return the micrometers
     */
    public double getMicrometers() {
        return micrometers;
    }

    /**
     * @param micrometers the micrometers to set
     */
    public void setMicrometers(double micrometers) {
        this.micrometers = micrometers;
    }

    /**
     * @return the feet
     */
    public double getFeet() {
        return feet;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(double feet) {
        this.feet = feet;
    }

    /**
     * @return the gigameters
     */
    public double getGigameters() {
        return gigameters;
    }

    /**
     * @param gigameters the gigameters to set
     */
    public void setGigameters(double gigameters) {
        this.gigameters = gigameters;
    }

    /**
     * @return the yard
     */
    public double getYard() {
        return yard;
    }

    /**
     * @param yard the yard to set
     */
    public void setYard(double yard) {
        this.yard = yard;
    }

}
