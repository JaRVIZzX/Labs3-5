package ua.lviv.iot.chemistry.manager;

import ua.lviv.iot.chemistry.model.AbstractProduct;
import ua.lviv.iot.chemistry.model.enums.AbleToSalonCleaning;

import java.util.LinkedList;
import java.util.List;

public class CarChemistryManager {

    private List<AbstractProduct> products;

    public List<AbstractProduct> findByAbleToSalonCleaning(AbleToSalonCleaning ableToSalonCleaning){
        List<AbstractProduct> primers = new LinkedList<>();

        for (AbstractProduct product : products){
            if (product.getAbleToSalonCleaning() == ableToSalonCleaning){
                primers.add(product);
            }
    }
        return primers;
    }

    public void setProducts(List<AbstractProduct> products){
        this.products = products;
    }


}
