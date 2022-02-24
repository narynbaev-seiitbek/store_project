package store;

import java.time.LocalDate;

public class Salt extends Product implements ProductFactory {


    public Salt() {
        super(Store.generateData(),"Salt",Store.generateStoragePlace(),Double.POSITIVE_INFINITY);
    }

    @Override
    public boolean isFresh() {
        return super.isFresh();
    }

    @Override
    public Product create() {
        return new Salt();
    }


}
