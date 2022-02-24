package store;

import java.time.LocalDate;

public class Fish extends Product implements ProductFactory{


    public Fish() {
        super(Store.generateData(),"Fish",Store.generateStoragePlace(),20);
    }

    @Override
    public boolean isFresh() {
        return super.isFresh();
    }

    @Override
    public Product create() {
        return new Fish();
    }
}
