package store;

import java.text.ParseException;

public class Milk extends Product implements ProductFactory {

    public Milk() {
        super(Store.generateData(),"Milk",Store.generateStoragePlace(),60);
    }

    @Override
    public boolean isFresh() {
        return super.isFresh();
    }

    @Override
    public Product create() {
        return new Milk();
    }


}
