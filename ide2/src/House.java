public class House {
    private String address;
    private double price;
    private double downPayment;
    private double mortgageRate;

    //Constructor to initialize Management system with Address and Price only
    public House(String address, double price, double downPayment, double mortgageRate) {
        this.address = address;
        this.price = price;
        this.downPayment = 0;
        this.mortgageRate = 0;
    }
    // Constructor to initialize Management system with address, price, downPayment, and mortgageRate
    public House(String address, double price, double downPayment, double mortgageRate) {
        this.address = address;
        this.price = price;
        this.downPayment = downPayment;
        this.mortgageRate = mortgageRate;
    }
    
    //Calculating monthly mortgage
    //Calculating the total cost of the house


    //Setter and Getter for properties
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getDownPayment() {
        return downPayment;
    }
    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }
    public double getMortgageRate() {
        return mortgageRate;
    }
    public void setMortgageRate(double mortgageRate) {
        this.mortgageRate = mortgageRate;
    }

}// ends main



