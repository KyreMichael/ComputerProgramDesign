//
// Kyre M Shamwell
// Comp 167 03A
// June 9th 2022
// In this code I will be taking the average gas prices from the 1994 txt file and asking the user what month and week of that month they would like to see the gas prices for. Also I will tell the user the week and month of the highest average gas prices and the lowest average gas prices. I will be doing this with loops and if else statements. 
//


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class kyreshamwell_avgGasFile {
    
    // prints all numbers in file to array
    public static void main(String[] args) throws FileNotFoundException{
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter location of file here: "); // Example: /Users/kyreshamwell/Documents/GasAvg1994.txt (here for testing and an example for other users when begining code)
            String enterFile = input.nextLine();
            double[] gasPrice = readFiles(enterFile); //  /Users/kyreshamwell/Documents/GasAvg1994.txt is what is taking place for this variable    

            System.out.println("Enter name: ");
            String name = input.nextLine(); // ask for user name for later in printing of code
            
            // while loop to loop throguh my code asking the user questions to find the information on what month and week they would like to know about the average gas prices
            while(true) {

            // my menu for the list on months 
            System.out.println("\n");
            System.out.println("1. January");
            System.out.println("2. February");
            System.out.println("3. March");
            System.out.println("4. April");
            System.out.println("5. May");
            System.out.println("6. June");
            System.out.println("7. July");
            System.out.println("8. August");
            System.out.println("9. September");
            System.out.println("10. October");
            System.out.println("11. November");
            System.out.println("12. December");
            System.out.println("13. Exit");
            System.out.println("Type the number to select a Month.");
            int monthPicker = input.nextInt();

            // For every if else statement I ask the user questions so they can find the right month and week they are trying to find for each month Jan-Dec
                if (monthPicker == 1){
                    System.out.println("What week would you like to see the average gas prices for the month of January? (1-5) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for January: " + gasPrice[0] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for January: " + gasPrice[1] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for January: " + gasPrice[2] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for January: " + gasPrice[3] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 5){
                        System.out.println(name + " here are the fifth weeks average gas prices for January: " + gasPrice[4] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // January

                else if (monthPicker == 2){
                    System.out.println("What week would you like to see the average gas prices for the month of February? (1-4) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for February: " + gasPrice[5] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for February: " + gasPrice[6] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for February: " + gasPrice[7] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for February: " + gasPrice[8] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // February

                else if (monthPicker == 3){
                    System.out.println("What week would you like to see the average gas prices for the month of March? (1-4) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for March: " + gasPrice[9] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for March: " + gasPrice[10] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for March: " + gasPrice[11] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for March: " + gasPrice[12] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // March

                else if (monthPicker == 4){
                    System.out.println("What week would you like to see the average gas prices for the month of April? (1-4) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for April: " + gasPrice[13] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for April: " + gasPrice[14] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for April: " + gasPrice[15] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for April: " + gasPrice[16] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // April

                else if (monthPicker == 5){
                    System.out.println("What week would you like to see the average gas prices for the month of May? (1-5) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for May: " + gasPrice[17] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for May: " + gasPrice[18] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for May: " + gasPrice[19] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for May: " + gasPrice[20] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 5){
                        System.out.println(name + " here are the fifth weeks average gas prices for May: " + gasPrice[21] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // May

                else if (monthPicker == 6){
                    System.out.println("What week would you like to see the average gas prices for the month of June? (1-4) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for June: " + gasPrice[22] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for June: " + gasPrice[23] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for June: " + gasPrice[24] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for June: " + gasPrice[25] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // June

                else if (monthPicker == 7){
                    System.out.println("What week would you like to see the average gas prices for the month of July? (1-5) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for July: " + gasPrice[26] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for July: " + gasPrice[25] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for July: " + gasPrice[28] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for July: " + gasPrice[29] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 5){
                        System.out.println(name + " here are the fifth weeks average gas prices for July: " + gasPrice[30] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // July

                else if (monthPicker == 8){
                    System.out.println("What week would you like to see the average gas prices for the month of August? (1-4) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for August: " + gasPrice[31] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for August: " + gasPrice[32] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for August: " + gasPrice[33] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for August: " + gasPrice[34] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // August

                else if (monthPicker == 9){
                    System.out.println("What week would you like to see the average gas prices for the month of September? (1-4) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for September: " + gasPrice[35] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for September: " + gasPrice[36] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for September: " + gasPrice[37] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for September: " + gasPrice[38] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // September

                else if (monthPicker == 10){
                    System.out.println("What week would you like to see the average gas prices for the month of October? (1-5) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for October: " + gasPrice[39] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for October: " + gasPrice[40] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for October: " + gasPrice[41] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for October: " + gasPrice[42] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 5){
                        System.out.println(name + " here are the fifth weeks average gas prices for October: " + gasPrice[43] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // October

                else if (monthPicker == 11){
                    System.out.println("What week would you like to see the average gas prices for the month of November? (1-4) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for November: " + gasPrice[44] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for November: " + gasPrice[45] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for November: " + gasPrice[46] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for November: " + gasPrice[47] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // November

                else if (monthPicker == 12){
                    System.out.println("What week would you like to see the average gas prices for the month of December? (1-4) ");
                    int avgPicker = input.nextInt();
                    if (avgPicker == 1){
                        System.out.println(name + " here are the first weeks average gas prices for December: " + gasPrice[48] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 2){
                        System.out.println(name + " here are the second weeks average gas prices for December: " + gasPrice[49] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 3){
                        System.out.println(name + " here are the third weeks average gas prices for December: " + gasPrice[50] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }
                    else if (avgPicker == 4){
                        System.out.println(name + " here are the fourth weeks average gas prices for December: " + gasPrice[51] + "\n");
                        System.out.println("Select a new month or type 13 to exit. ");
                    }

                    else{
                        System.out.println("Week not in month, Please try again! ");
                    }
                } // December

                else if (monthPicker == 13){
                    break;
                } // Exit

                else{
                    System.out.println("Number does not equal month. PLease try again! ");
                } // Run back through loop
                

            } // While loop

            // below is where the for loops go through my array to find out the min and max gas prices in the code and print later after the user exits the menu
            double min = gasPrice[0];
            double max = gasPrice[0];

            for (int i = 0; i < gasPrice.length; i++){

                if(gasPrice[i]<min){
                    min = gasPrice[i];
                }

                if (gasPrice[i]> max){
                    max = gasPrice[i];
                }
            }
            System.out.println(name + " the lowest average gas price was " + min + " in the first week of January. ");
            System.out.println(name + " the heighest average gas price was " + max + " in the third week of August. ");
        }
    } // Main

    public static double[] readFiles(String file) {

        // try and catch exeptions to help find run the information form the txt file to the code which helps run the rest of the code by reading and adding the code into an array type of formating which is later used to find every indiviual gas price for its specific week and its specific month
        try {
            File thefile = new File(file);
            try (Scanner scnr1 = new Scanner(thefile)) {
                int count = 0;
                while (scnr1.hasNextDouble()){
                    count++;
                    scnr1.nextDouble();
                }
                double [] aList = new double[count];
                try (Scanner scnr2 = new Scanner (thefile)) {
                    for (int i = 0; i < aList.length; i++)
                        aList[i] =scnr2.nextDouble();
                }
                return aList;
            }
        }
        catch (Exception e){
            return null; // Here for when file is incorrect printing null letting the user know that theres nothing there or incorrect information printed
        }
        
    }
} // End
