package store;

import java.text.ParseException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Store store = new Store();
        ProductFactory[] factories = {new Milk(),new Corn(), new Stew(),new Fish(),new Salt()};
        store.setFactories(factories);

        store.doInspection();





    }
}
