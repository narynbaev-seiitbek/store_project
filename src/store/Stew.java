package store;

import java.time.LocalDate;

public class Stew extends Product implements ProductFactory{

    public Stew() {
        super(Store.generateData(),"Stew",Store.generateStoragePlace(),150);
    }

    @Override
    public boolean isFresh() {
        return super.isFresh();
    }

    @Override
    public Product create() {
        return new Stew();
    }
}
