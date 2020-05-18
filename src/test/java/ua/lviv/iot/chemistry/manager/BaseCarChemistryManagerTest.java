package ua.lviv.iot.chemistry.manager;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.chemistry.model.AbstractProduct;
import ua.lviv.iot.chemistry.model.Primer;
import ua.lviv.iot.chemistry.model.enums.AbleToSalonCleaning;

import java.util.LinkedList;
import java.util.List;

public abstract class BaseCarChemistryManagerTest {

    protected List<AbstractProduct> primers;

    @BeforeEach
    public void createPrimers() {
        primers = new LinkedList<AbstractProduct>();

        primers.add(new Primer(AbleToSalonCleaning.NO,"Qwer", 420, 2003, 400, 200, "Water"));
        primers.add(new Primer(AbleToSalonCleaning.NO, "Req", 400, 2010, 500, 300, "Water"));
        primers.add(new Primer(AbleToSalonCleaning.NO, "Qwy12", 300, 2011, 600, 280, "Water"));
    }
}



