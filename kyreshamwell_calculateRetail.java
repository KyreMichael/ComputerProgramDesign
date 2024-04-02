//
// Kyre M Shamwell
// Comp 167 03A
// May 24 2022
// I will be doing getting user input to ask for the specific item being bought, the market price and the market percentage of the item and printing out the retail price back to the user.
//

// Imports used for user input and deciamal format
import java.util.Scanner;
import java.text.DecimalFormat;

public class kyreshamwell_calculateRetail {
    public static void main(String[] args){
        try (Scanner userPut = new Scanner(System.in)) {
            
            // Here I used a while loop where I asked the user the specifc questions and setting there answers to their specific variables  
            while(true){
                
                System.out.println("Do you want to check retail prices? (Y/N)");               
                char theQuesion; 
                theQuesion = userPut.next().charAt(0);  
                if (theQuesion == 'y' || theQuesion == 'Y'){
                    System.out.println("What item are you buying?");
                    // The variable getItem is here to hold the name of the specific thing the user is buying
                    String getItem = userPut.next();                
                    
                    System.out.println("What is the the market price of this item?");
                    // The variable getMarketprice is here to hold the price of the item the user is buying
                    double getMarketprice = userPut.nextDouble();

                    System.out.println("What is the market percentage (Not as a decimal) of this item?");
                    // The variable getMarketpercent is here to hold the precentage not as a decimal  for the item the user is buying
                    double getMarketpercent = userPut.nextDouble();

                    // These here are for the math which helps the user eventually see the retail price of the item 
                    double findRetail = (getMarketpercent/100); 
                    double almostRetail = (findRetail*getMarketprice);
                    double theRetailCost = (getMarketprice+almostRetail);
                    
                    // Used a deciaml format to make sure only 2 decimal places were used when the final cost is printed 
                    DecimalFormat cost = new DecimalFormat("0.00");
                    var theCost = cost.format(theRetailCost);
                    // This is the final print statment which shows the user the cost of the item bought at retail price.
                    System.out.println("The retail price for " + getItem + " is $" + theCost);
                    // The stop which works by entering a Y or N to stop the program
                    System.out.println("Do you want to stop? (Y/N)");               
                    char theStop; 
                    theStop = userPut.next().charAt(0); // stoper 
    
                    // If statement which breaks the loop ending the program once the user finishes
                    if (theStop == 'y' || theStop == 'Y'){
                        System.out.println("No more items to check. ");
                        break;
                    }
                    //  Else if statement which send the user back to the top of the code if they are trying to find more than one item at retail price
                    else if (theStop == 'n' || theStop == 'N'){
                        System.out.println("Back to the top!");
                    }
                    else{
                        System.out.println("Error incorrect value");
                    }
                }
                // Else which is here if someone enters any encorrect value when trying to leave the code making them run the question again
                else{
                    System.out.println("Goodbye! ");
                    break;
                }
            }
        }
        
    }
    
}
