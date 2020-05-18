package ua.lviv.iot.chemistry.manager;

import ua.lviv.iot.chemistry.model.AbstractProduct;
import ua.lviv.iot.chemistry.model.enums.SortType;

import java.util.Comparator;
import java.util.List;

public class CarChemistryManagerUtils {

    private static final SortByWeight SORT_BY_WEIGHT = new SortByWeight();

    public static void sortByWeight(List<AbstractProduct> products, SortType sortType) {
        products.sort(sortType == SortType.ASCENDING ? SORT_BY_WEIGHT : SORT_BY_WEIGHT.reversed());
    }

    public static void sortByProductionYear(List<AbstractProduct> products, SortType sortType) {
        CarChemistryManagerUtils utils = new CarChemistryManagerUtils();
        products.sort(sortType == SortType.ASCENDING ? new SortByProductionYear() : new SortByProductionYear().reversed());
    }

    public static void sortByPriceInUAN(List<AbstractProduct> products, SortType sortType) {
        Comparator<AbstractProduct> comparator = (firstProduct, secondProduct) -> (int) (firstProduct.getPriceInUAN() - secondProduct.getPriceInUAN());
        products.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }

    public static void sortByVolumeInMl(List<AbstractProduct> products, SortType sortType) {
        Comparator<AbstractProduct> comparator = Comparator.comparingInt(AbstractProduct::getVolumeInMl);
        products.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }

    private static class SortByWeight implements Comparator<AbstractProduct> {
        @Override
        public int compare(AbstractProduct firstPrimer, AbstractProduct secondPrimer) {
            return firstPrimer.getWeightInGr() - (secondPrimer.getWeightInGr());
        }
    }

    private static class SortByProductionYear implements Comparator<AbstractProduct> {
        @Override
        public int compare(AbstractProduct firstPrimer, AbstractProduct secondPrimer) {
            return firstPrimer.getProductionYear() - secondPrimer.getProductionYear();
        }
    }


}


