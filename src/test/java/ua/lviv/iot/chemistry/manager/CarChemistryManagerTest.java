package ua.lviv.iot.chemistry.manager;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.chemistry.model.AbstractProduct;
import ua.lviv.iot.chemistry.model.enums.AbleToSalonCleaning;

import java.util.List;


class CarChemistryManagerTest extends BaseCarChemistryManagerTest {

    private CarChemistryManager carChemistryManager;
    List<AbstractProduct> foundPrimers;

    @BeforeEach
    public void setUp() {
        carChemistryManager = new CarChemistryManager();
        carChemistryManager.setProducts(primers);
    }

    @Test
    public void testFindWithPriceGreaterThan() {
       foundPrimers = carChemistryManager.findByAbleToSalonCleaning(AbleToSalonCleaning.NO);
       assertEquals(3, foundPrimers.size());
    }

}