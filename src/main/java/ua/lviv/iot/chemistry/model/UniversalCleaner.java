package ua.lviv.iot.chemistry.model;

import ua.lviv.iot.chemistry.model.enums.AbleToSalonCleaning;

public class UniversalCleaner extends AbstractProduct {
    boolean glassCleaning;

    public boolean isGlassCleaning() {
        return glassCleaning;
    }

    public void setGlassCleaning(boolean glassCleaning) {
        this.glassCleaning = glassCleaning;
    }

    public UniversalCleaner(AbleToSalonCleaning ableToSalonCleaning, String brand, double priceInUAN, int productionYear,
                            int volumeInMl, int weightInGr, String consistency){
        super(ableToSalonCleaning, brand, priceInUAN, productionYear, volumeInMl, weightInGr, consistency);
    }


    public UniversalCleaner(AbleToSalonCleaning ableToSalonCleaning, String brand, double priceInUAN, int productionYear,
                            int volumeInMl, int weightInGr, String consistency, boolean glassCleaning) {
        super(ableToSalonCleaning, brand, priceInUAN, productionYear, volumeInMl, weightInGr, consistency);
            this.glassCleaning = glassCleaning;
    }
}
