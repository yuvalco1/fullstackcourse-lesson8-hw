import java.util.Objects;

public class Car {

    // Attributes - Model, price , forSale (boolean flag). owner(name of the owner)
    public String model;
    public double price;
    public boolean forSale;
    public String owner;

    public Car(String model, double price, boolean forSale, String owner) {
        this.model = model;
        this.price = price;
        this.forSale = forSale;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean isForSale() {
        return forSale;
    }

    public String getOwner() {
        return owner;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // only owner can set forSale to true or false
    public void setPrice(String owner, double price) {
        if (owner.equals(this.owner)) {
            this.price = price;
            System.out.println("The price is set to " + price);
        } else {
            System.out.println("You are not the owner of this car");
        }

    }
    // only owner can set forSale to true or false
    public void setForSale(String owner, boolean forSale) {
        if (owner.equals(this.owner)) {
            this.forSale = forSale;
            System.out.println("The car is set for sale " + forSale);
        } else {
            System.out.println("You are not the owner of this car");
        }

    }
    private void setOwner(String owner) {
        this.owner = owner;
    }
    // car can be sold only if forSale is True and the owner is the owner of the car
    public void sale(String owner, String newOwner){
        if (this.forSale && owner == this.owner){
                    this.setOwner(newOwner);
                    System.out.println("The car is sold to "+ newOwner);
                } else {
                    System.out.println("Sale Failed - You are not the owner of this car and/or car was not set for sale");
                }


    }


}
