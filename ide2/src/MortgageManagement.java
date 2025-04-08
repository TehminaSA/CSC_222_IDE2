/*
IDE Assignment #2 - Real Estate Listings Management System
CSC 222
Tehmina Sadiq Ali
 */
import java.util.Scanner;
import java.util.ArrayList;

// create a list to store house objects
public class MortgageManagement {
    private static ArrayList<House> houses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String address;
        double price, downPayment, mortgageRate;

        while (true) {
            System.out.println("\nReal Estate Listing Management");
            System.out.println("1. Add Property with Address and Price");
            System.out.println("2. Add Property with Full Details");
            System.out.println("3. Display All Houses");
            System.out.println("4. Update House Details (except Address)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                //cases for different menu options
                case 1:
                    //Add house with Address and Price only
                    System.out.print("Enter house address: ");
                    address = scanner.nextLine();
                    System.out.print("Enter house price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    House basicHouse = new House(address, price);
                    houses.add(basicHouse);
                    System.out.println("Property with address and price added.");
                    System.out.println(" ");
                    break;
                case 2:
                    //Add house with Full details
                    System.out.print("Enter house address: ");
                    address = scanner.nextLine();
                    System.out.print("Enter house price: ");
                    price = scanner.nextDouble();
                    System.out.print("Enter down payment: ");
                    downPayment = scanner.nextDouble();
                    System.out.print("Enter mortgage rate (%): ");
                    mortgageRate = scanner.nextDouble();
                    scanner.nextLine();
                    House fullDetailHouse = new House(address, price, downPayment, mortgageRate);
                    houses.add(fullDetailHouse);
                    System.out.println("Property with full details added.");
                    System.out.println(" ");
                    break;
                case 3:
                    //Displaying All Houses
                    if (houses.isEmpty()) {
                        System.out.println("No houses to display.");
                    } else {
                        for (House house : houses) {
                            house.printHouseDetails();
                            System.out.println(" ");
                        }
                    }
                    break;
                case 4:
                    // Code for Updating Houses
                    System.out.print("Enter house address to update: ");
                    address = scanner.nextLine();
                    boolean found = false;
                    for (House house : houses) {
                        if (house.getAddress().equals(address)) {
                            System.out.print("Enter new price: ");
                            price = scanner.nextDouble();
                            System.out.print("Enter new down payment: ");
                            downPayment = scanner.nextDouble();
                            System.out.print("Enter new mortgage rate: ");
                            mortgageRate = scanner.nextDouble();
                            scanner.nextLine();

                            house.setPrice(price);
                            house.setDownPayment(downPayment);
                            house.setMortgageRate(mortgageRate);
                            System.out.println("House details updated.");
                            house.printHouseDetails();
                            System.out.println(" ");
                            found = true;
                            };
                            break;
                        }
                    //Error Handling for when input doesn't Match
                    if (!found) {
                        System.out.println("House not found.");
                    };
                    break;

                case 5:
                    //Exit program
                    System.out.println("Exiting the Real Estate Management System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try Again try again.");
                    break;
            }//switch ends
        }//ends while(true)
    }//ends main
}//ends Mortgage management class