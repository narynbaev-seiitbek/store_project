package store;

import java.time.LocalDate;

public class Corn extends Product implements ProductFactory{

    public Corn() {
        super(Store.generateData(),"Corn",Store.generateStoragePlace(),180);
    }

    @Override
    public boolean isFresh() {
        return super.isFresh();
    }

    @Override
    public Product create() {
        return new Corn();
    }


}
