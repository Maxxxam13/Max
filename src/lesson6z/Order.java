package lesson6z;

import java.util.Date;

public class Order {

    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public Order() {
    }

    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {

        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public void confirmOrder() {
        if (this.isConfirmed == false) {
            this.isConfirmed = true;
            this.dateConfirmed = new Date();
        }
    }

    public boolean checkPrice() {
        return this.price > 1000 ? true : false;
    }

    public boolean isValidType() {
        if (this.type == "Buy" || this.type == "Sale")
            return true;
        else
            return false;
    }
}