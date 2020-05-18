package ua.lviv.iot.chemistry.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.chemistry.model.enums.SortType;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarChemistryManagerUtilsTest extends BaseCarChemistryManagerTest {

    @Test
    public void testSortByProductionYear() {
        CarChemistryManagerUtils.sortByProductionYear(primers, SortType.DESCENDING);
        assertEquals(2010, primers.get(0).getProductionYear());
        assertEquals(2018, primers.get(1).getProductionYear());
        assertEquals(2006, primers.get(2).getProductionYear());
    }

    @Test
    public void testSortByWeightInGr() {
        CarChemistryManagerUtils.sortByWeight(primers, SortType.ASCENDING);
        assertEquals(200, primers.get(0).getWeightInGr());
        assertEquals(300, primers.get(1).getWeightInGr());
        assertEquals(280, primers.get(2).getWeightInGr());
    }

    @Test
    public void testSortByPriceInUAN(){
        CarChemistryManagerUtils.sortByPriceInUAN(primers, SortType.DESCENDING);
        assertEquals(400, primers.get(0).getPriceInUAN());
        assertEquals(450, primers.get(1).getPriceInUAN());
        assertEquals(500, primers.get(2).getPriceInUAN());
    }

    @Test
    public void testSortByVolumeInMl(){
        CarChemistryManagerUtils.sortByVolumeInMl(primers, SortType.ASCENDING);
        assertEquals(400, primers.get(0).getVolumeInMl());
        assertEquals(500, primers.get(1).getVolumeInMl());
        assertEquals(600, primers.get(2).getVolumeInMl());
    }

}