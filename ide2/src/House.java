public class House {
    private String address;
    private double price;
    private double downPayment;
    private double mortgageRate;

    // Constructor to initialize Management system with address and price only
    public House(String address, double price) {
        this.address = address;
        this.price = price;
        this.downPayment = 0;  // Default value assuming no down payment provided
        this.mortgageRate = 0;  // Default value assuming no mortgage rate provided
    }

    // Constructor to initialize Management system with address, price, downPayment, and mortgageRate
    public House(String address, double price, double downPayment, double mortgageRate) {
        this.address = address;
        this.price = price;
        this.downPayment = downPayment;
        this.mortgageRate = mortgageRate;
    }

    // Calculating monthly mortgage payment
    public double calculateMortgagePayment() {
        if (mortgageRate == 0 || downPayment == 0) {
            return 0;  // Return 0 if either mortgage rate or down payment is zero
        }
        double principal = price - downPayment;
        double monthlyRate = mortgageRate / 100 / 12;
        int loanTerm = 30 * 12;  // Mortgage term of 30 years
        return (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -loanTerm));
    }

    // Calculating the total cost of the house
    public double calculateTotalCost() {
        double monthlyPayment = calculateMortgagePayment();
        if (monthlyPayment == 0) {
            return 0;  // Return 0 if the mortgage payment could not be calculated
        }
        int loanTerm = 30 * 12;  // Mortgage term of 30 years
        return monthlyPayment * loanTerm + downPayment;
    }

    // Print house details
    public void printHouseDetails() {
        if (mortgageRate == 0 && downPayment == 0) {
            System.out.println("Address: " + address);
            System.out.printf("Price: $%.2f\n" , price);
            System.out.println("Down Payment: N/A");
            System.out.println("Mortgage Rate: N/A");
            System.out.println("Mortgage Payment: N/A");
            System.out.println("Total Cost (Including Interest): N/A");

        } else {
            System.out.println("Address: " + address);
            System.out.printf("Price: $%.2f\n" , price);
            System.out.printf("Down Payment: $%.2f\n" ,downPayment);
            System.out.println("Mortgage Rate: " + mortgageRate + "%");
            System.out.printf("Mortgage Payment: $%.2f\n", calculateMortgagePayment());
            System.out.printf("Total Cost (Including Interest): $% .2f\n" , calculateTotalCost());
        }
    }

    // Getter and Setter for properties
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
}
