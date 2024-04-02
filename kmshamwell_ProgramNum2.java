//
// Kyre M Shamwell
// Comp 167 03A
// June 12 2022
// In this code I will be asking the user what day their birthday is and asking them to enter random days in the that month and printing out the days after the user birthday.
//

import java.util.Scanner;

public class kmshamwell_ProgramNum2 {
    public static void main(String[] args) {

        try (Scanner userPut = new Scanner(System.in)) {
            
            // While loop here to ask the user if they would like to start and if Y the code will run asking the three questions I have set.
            while(true){
                System.out.println("Would you like to start? (Y/N) ");
                char starter = userPut.next().charAt(0);
                
                // If Y the user will be asked when there birthday is, and some random dates in there birthday month
                if (starter == 'y' || starter == 'Y'){
                    System.out.println("Enter your birth date here: "); // enter birthday here 
                    int n=userPut.nextInt();
                    
                    System.out.println("Enter the amount of dates you would like to enter: "); // asks how many dates the user would want to enter
                    int amount = userPut.nextInt();
                    
                    int[] myList = new int[amount]; // list
                    
                    System.out.println("Enter " +amount+ " random dates in your birth month (Int only): ");  // random numbers which would be added to a list
                   
                    // for loop is to use "amount" and have the user enter the amount of numbers asked and entered earlier 
                    for(int i = 0; i<myList.length; i++){
                        System.out.println("enter name");
                        myList[i] = userPut.nextInt(); 
                    }
                    
                    
                    
                    // here we will print out all the days greater then users birthday
                    
                    System.out.println("Here are the days after your birthday in your birth month. ");
                    
                    // the foor loop goes and finds all the numbers greater the the users birthdaty and prints them out
                    for (int i = 0; i < myList.length; i++) {
                        if (myList[i] > n) {
                            System.out.println(myList[i]);
                        }
                    }
                    
                    // Ask the user if they would like to stop or keep going and if Yes then the code will loop again if not it will end the code 
                    char keepGoing; 
                    System.out.println("Do you want to go again? (Y/N)");
                    keepGoing = userPut.next().charAt(0);
                    
                    if (keepGoing == 'n' || keepGoing == 'N'){
                        System.out.println("Goodbye. ");
                        break;
                    }
                    else if (keepGoing == 'y' || keepGoing == 'Y'){
                        System.out.println("Back to the top!");
                    }
                    else{
                        System.out.println("Try again!");
                    }
                }
                else if (starter == 'n' || starter == 'N'){
                    System.out.println("Goodbye.");
                    break; // if user says no it will end loop and say goodbye
                }

                else{
                    System.out.println("Please type Y/N "); // here for errors
                }
            } // while loop
        }
    }
    
}
