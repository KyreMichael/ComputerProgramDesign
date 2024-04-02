import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VendingMachine {

    // static variables to be used into every method below easier to work around 
    static Scanner user = new Scanner(System.in);
    static int vendingItem, cents, dollars  ;
    static double balance, total, change, options;
    static FileWriter fileInput;


    public static void payment() {

        System.out.println("\nTo pay please select 1 for Cash or 2 for Coins.");
        do {
            // select a number 0, 1, or 2 to select a payment option
            System.out.println("0. Stop Enter Money");
            System.out.println("1. Enter cash");
            System.out.println("2. Enter coins");
            options = user.nextDouble();

            if (options == 0) {
                System.out.println("\n");
                break;
            }
            // The vending machine accepts coins and Bills of 1 and 5
            else if (options == 1) { 
                
                // The Instuctions for the bills and how you type it in to the computer so it works correctly 
                System.out.println("\nOnly acceptable bills are $1 and $5");
                System.out.println("Please enter bills (Ex: 1 or 5) ");
                System.out.println("Remeber press '0' when to stop entering bills.");

                do {
                    dollars = user.nextInt();
                    // enter bills
                    switch (dollars) {
                        case 0:
                        System.out.println("\n");
                        break;
                        case 1: // 1 dollar
                        total += 1.00;
                        break;
                        case 5: // 5 dollar
                        total += 5.00;
                        break;
                        default:
                        System.out.println("Invalid please enter mentioned bills above");
                    }
                } 
                while (dollars != 0);
            }
            else if (options == 2) {

                // The Instuctions for the coins and how you type it in to the computer so it works correctly 
                System.out.println("\nOnly acceptable coins are .01, .05, .10, and .25 ");
                System.out.println("Please enter coins (Ex: 1 or 5 or 10 or 25)");
                System.out.println("Remeber press '0' when to stop entering coins.");
                System.out.println("***** Do not use decimals *****");
                do {
                    cents = user.nextInt();
                    // enter coins
                    switch (cents) {
                        case 0:
                        break;
                        case 1: // for pennies 
                        total += .01;
                        break;
                        case 5: // for nickles 
                        total += .05;
                        break;
                        case 10: // for dimes
                        total += .10;
                        break;
                        case 25: // for quarters
                        total += .25;
                        break;
                        default:
                        System.out.println("Invalid Coins, Please enter the new coins");
                    }
                } 
                while (cents != 0);
            } 
            else {
                System.out.println("Invalid Options");
            }
        } 
        while (options != 0);
    } // Payment

    public static void purchase() throws IOException{
        // stating the menu again for the user to see it later in the code when trying tp purchase an item again seeing if they didnt put enough money they can get a refund
        System.out.println("To selcet item in vending machine please type any number 1-7 or 0 to get money back.");
        System.out.println("0. Refund");
        System.out.println("1. BBQ Lays\t\t$.75");
        System.out.println("2. Doritos\t\t$.90");
        System.out.println("3. Honey Buns\t\t$1.00");
        System.out.println("4. Skittles\t\t$1.25");
        System.out.println("5. Starbusrt\t\t$1.50");
        System.out.println("6. Donuts\t\t$1.75");
        System.out.println("7. Sour Patch Kids\t$2.00");      
        
        // user input for the vending machine items 
        vendingItem = user.nextInt();
        
        switch (vendingItem) {    
            // each case stands for each item in the list in the vending machine and they both will print out and write to the blank file that the item the user decied to buy 
            case 0:
            break;
            case 1:
            balance += .75; 
            System.out.println("\nYou ordered BBQ Lays");
            fileInput.write("\nYou ordered BBQ Lays");
            break;
            case 2:
            balance += .90;
            System.out.println("\nYou ordered Doritos");
            fileInput.write("\nYou ordered Doritos");
            break;
            case 3:
            balance += 1.00;
            System.out.println("\nYou ordered Honey Buns");
            fileInput.write("\nYou ordered Honey Buns");
            break;
            case 4:
            balance += 1.25;
            System.out.println("\nYou ordered Skittles");
            fileInput.write("\nYou ordered Skittles");
            break;
            case 5:
            balance += 1.50;
            System.out.println("\nYou ordered Starbusrt");
            fileInput.write("\nYou ordered Starbusrt");
            break;
            // Donuts
            case 6:
            balance += 1.75;
            System.out.println("\nYou ordered Donuts");
            fileInput.write("\nYou ordered Donuts");
            break;
            // Sour Patch Kids
            case 7:
            balance += 2.00;
            System.out.println("\nYou ordered Sour Patch Kids");
            fileInput.write("\nYou ordered Sour Patch Kids");
            break;
            default:
            System.out.println("Invalid");
        }

    } // Purchase

    public static String change() {
        String changeDisplay="";
        // if statment saying if the total money added is greater than the cost of the item it will push back change
        if (total > balance) {
            change = total - balance;
            double rounded = Math.round(change * 100)/100.0; // here to round the change to the second decimal place
            //calculate for coins
            changeDisplay += rounded;
        }
        else {
            // if total money is less than the cost of the item it will give a you an message of how much change you are short
            change = balance - total;
            changeDisplay += ("You are $" + change + " short");
        }

        return changeDisplay;

    } // Change

    public static void display()  {
        
        // Display will print out how much money the item the user enters, the total amount of money you entered, the change or the amount you were short, and a come again message 
        System.out.println("\nItem cost : " + balance); // item cost
        System.out.println("Money entered : " + total); // amount of money you entered
        System.out.println("Your change : \n" + change()); // the amount of money you get back
        System.out.println("Thank you come again!");
    } // Display

    public static void main(String[] args) throws IOException { // looks out for file errors 
        
        // Introduction letting the user know that they are starting the code for the vending machine
        System.out.println("\nWelcome Customers to the Vending Machine.");

        // Here I have a variable were ther user can enter the location of a blank file so later one the informartion from the dispaly method will be writen and added to that blank file
        System.out.println("Before you start please enter a location of a blank txt or other blank document below to see your output."); // /Users/kyreshamwell/Documents/Mp1.txt
        String blankFile = user.nextLine(); 
        fileInput = new FileWriter(blankFile);


        // Information / menu of the items inside the vending machine that you can choose from 
        System.out.println("\n0. Exit");
        System.out.println("1. BBQ Lays\t\t$.75");
        System.out.println("2. Doritos\t\t$.90");
        System.out.println("3. Honey Buns\t\t$1.00");
        System.out.println("4. Skittles\t\t$1.25");
        System.out.println("5. Starburst\t\t$1.50");
        System.out.println("6. Donuts\t\t$1.75");
        System.out.println("7. Sour Patch Kids\t$2.00");

        // calls the payment module
        payment();
        // calls the purchase module
        purchase();
        // calls the change module
        change();
        // calls the display module
        display();

        // I write information from display onto the blank file entered 
        fileInput.write("\nItem cost : " + balance + "\n");
        fileInput.write("Money entered : " + total + " \n");
        fileInput.write("Your change : \n" + change() + "\n");
        fileInput.write("Thank you come again! ");

        fileInput.close();
        
    } // Main

} // Class
