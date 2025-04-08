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
    public double calculateMortgagePayment() {
        if (mortgageRate == 0) || (downPayment == 0) {
            return 0;
        }
        double principal = price - downPayment;
        double monthlyRate = mortgageRate / 100 /12;
        int loanTerm= 30* 12;
        double monthlyPayment= (principal*monthlyRate)/(1- Math.pow( 1 + monthlyRate, -loanTerm));
        return monthlyPayment;
    }
    //Calculating the total cost of the house
public double calculateTotalCost() {
    double monthlyPayment = calculateMortgagePayment();
    if (monthlyPayment == 0) {
        return 0;
    } else {
        int loanTerm = 30 * 12;
        return monthlyPayment * loanTerm + downPayment;
    }
}

    //Print house details

    public void printHouseDetails() {
        if (mortgageRate == 0) ||(downPayment == 0) {
            System.out.println("N/A");
        } else {
            System.out.println("Address: " + address);
            System.out.println("Price: " + price);
            System.out.println("Down Payment: $" + downPayment);
            System.out.println("Mortgage Rate: " + mortgageRate + "%");
            System.out.println("Mortgage Payment: $" + calculateMortgagePayment());
            System.out.println("Total Cost: $" + calculateTotalCost());
        }
    }


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


