package store;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Store implements ProductFactory{

    private ProductFactory[] factories;

    public Store() {
    }

    public Store(ProductFactory[] factories) {
        this.factories = factories;
    }

    static LocalDate generateData() {
        Random random = new Random();
        LocalDate localDate = LocalDate.now().minusDays(random.nextInt(200));
        return localDate;
    }

    static String generateStoragePlace() {
        Random random = new Random();
        String[] str={"Icebox  ","Showcase"};
        int a = random.nextInt(str.length);
        return str[a];
    }

    public void doInspection() {
        System.out.println("Product | Produced on | Storage place | S. life days | Fresh ");
        System.out.println("--------+-------------+---------------+--------------+--------");

        for (int i = 0; i < 20; i++) {
            Product product = create();
            System.out.println(product);
        }

    }

    public ProductFactory[] getFactories() {
        return factories;
    }

    public void setFactories(ProductFactory[] factories) {
        this.factories = factories;
    }

    @Override
    public Product create() {
        Random r = new Random();
        int ind = r.nextInt(factories.length);
        return factories[ind].create();
    }

    @Override
    public String toString() {
        return "Store{" +
                "factories=" + Arrays.toString(factories) +
                '}';
    }
}

