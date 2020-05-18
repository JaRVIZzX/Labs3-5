package ua.lviv.iot.chemistry.model;

import ua.lviv.iot.chemistry.model.enums.AbleToSalonCleaning;

public class AbstractProduct {
    private String brand;
    private double priceInUAN;
    private int productionYear;
    private int volumeInMl;
    private int weightInGr;
    private String consistency;
    private AbleToSalonCleaning ableToSalonCleaning;

    public AbstractProduct(AbleToSalonCleaning ableToSalonCleaning, String brand, double priceInUAN, int productionYear, int volumeInMl,
                           int weightInGr, String consistency) {
        super();
        this.ableToSalonCleaning = ableToSalonCleaning;
        this.brand = brand;
        this.priceInUAN = priceInUAN;
        this.productionYear = productionYear;
        this.volumeInMl = volumeInMl;
        this.weightInGr = weightInGr;
        this.consistency = consistency;

    }


    public AbleToSalonCleaning getAbleToSalonCleaning(){
        return ableToSalonCleaning;
    }

    public void setAbleToSalonCleaning(AbleToSalonCleaning ableToSalonCleaning){
        this.ableToSalonCleaning = ableToSalonCleaning;
    }

    void spread() {
        System.out.println("Spread");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPriceInUAN() {
        return priceInUAN;
    }

    public void setPriceInUAN(double priceInUAN) {
        this.priceInUAN = priceInUAN;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getVolumeInMl() {
        return volumeInMl;
    }

    public void setVolumeInMl(int volumeInMl) {
        this.volumeInMl = volumeInMl;
    }

    public int getWeightInGr() {
        return weightInGr;
    }

    public void setWeightInGr(int weightInGr) {
        this.weightInGr = weightInGr;
    }

    public String getConsistency() {
        return consistency;
    }

    public void setConsistency(String consistency) {
        this.consistency = consistency;
    }

}
