package ua.lviv.iot.chemistry.model;

import ua.lviv.iot.chemistry.model.enums.AbleToSalonCleaning;

public class Primer extends AbstractProduct {
    private String color;

    public Primer(AbleToSalonCleaning ableToSalonCleaning, String brand, double priceInUAN, int productionYear,
                  int volumeInMl, int weightInGr, String consistency) {
        super(ableToSalonCleaning, brand, priceInUAN, productionYear, volumeInMl, weightInGr, consistency);
    }

    public Primer(AbleToSalonCleaning ableToSalonCleaning, String brand, double priceInUAN, int productionYear,
                  int volumeInMl, int weightInGr, String consistency, String color){
        super(ableToSalonCleaning, brand, priceInUAN, productionYear, volumeInMl, weightInGr, consistency);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
