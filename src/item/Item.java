package item;

import java.util.Date;

public class Item {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    private String expDate;


    public Item(String name, int price, String expDate) {
        this.name = name;
        this.price = price;
        this.expDate = expDate;
    }




}