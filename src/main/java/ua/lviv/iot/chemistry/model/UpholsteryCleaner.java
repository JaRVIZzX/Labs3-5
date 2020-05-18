package ua.lviv.iot.chemistry.model;

import ua.lviv.iot.chemistry.model.enums.AbleToSalonCleaning;

public class UpholsteryCleaner extends AbstractProduct {
    int timeToDryInMin;

    public int getTimeToDryInMin() {
        return timeToDryInMin;
    }

    public void setTimeToDryInMin(int timeToDryInMin) {
        this.timeToDryInMin = timeToDryInMin;
    }

    public UpholsteryCleaner(AbleToSalonCleaning ableToSalonCleaning, String brand, double priceInUAN,
                             int productionYear, int volumeInMl, int weightInGr, String consistency) {
        super(ableToSalonCleaning, brand, priceInUAN, productionYear, volumeInMl, weightInGr, consistency);
    }

    public UpholsteryCleaner(AbleToSalonCleaning ableToSalonCleaning, String brand, double priceInUAN, int productionYear,
                             int volumeInMl, int weightInGr, String consistency, boolean glassCleaning, int timeToDryInMin) {
        super(ableToSalonCleaning, brand, priceInUAN, productionYear, volumeInMl, weightInGr, consistency);
        this.timeToDryInMin = timeToDryInMin;
    }
}
