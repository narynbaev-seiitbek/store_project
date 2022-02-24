package store;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public abstract class Product {
    private LocalDate producedON;
    private String storagePlace;
    private double storageLifeDays;
    private String name;

    public Product() {
    }

    public Product(LocalDate producedON, String name, String storagePlace,double storageLifeDays) {
        this.producedON = producedON;
        this.name = name;
        this.storagePlace = storagePlace;
        this.storageLifeDays = storageLifeDays;
    }

    public boolean isFresh(){
        boolean check;
        if (findDayOfProducedDate()<+storageLifeDays) {
            check = true;
        }else {
            check = false;
        }
        return check;
    }

    public double findDayOfProducedDate() {
        LocalDate pr = producedON;
        LocalDate now = LocalDate.now();
        double res = now.toEpochDay()- pr.toEpochDay();
        return res;
    }

    public LocalDate getProducedON() {
        return producedON;
    }

    public void setProducedON(LocalDate producedON) {
        this.producedON = producedON;
    }

    public String getStoragePlace() {
        return storagePlace;
    }

    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStorageLifeDays() {
        return storageLifeDays;
    }

    public void setStorageLifeDays(double storageLifeDays) {
        this.storageLifeDays = storageLifeDays;
    }

    @Override
    public String toString() {
        return
                name +"    | "+producedON+"  | "+ storagePlace+"      | "+ storageLifeDays+ "         |" + isFresh();
    }
}
