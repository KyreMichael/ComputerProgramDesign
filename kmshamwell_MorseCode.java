//
// Kyre M Shamwell
// Comp 167 03A
// June 19th 2022
// In this code i will be making a type of english to morse code translator, I will be asking the user to enter the word or sentence he/she would like into the program and it would output that users phrase in morse code. I will be doing so using a hashmap and a while statement
//
 

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class kmshamwell_MorseCode {

    public static void main(String[] args){

        // I created a HashMap with keys as characters and values and strings so I could convert the english the user imputs into morse code.
        Map<Character, String> morse = new LinkedHashMap<>();

        // Punctuation
        morse.put(' ', " "); // Space
        morse.put(',', "- -..- -"); // Comma
        morse.put('?', "..- -.."); // Question mark
        morse.put('.', ".-.-.-"); // Period

        // Numbers 0-9
        morse.put('1', ".----");
        morse.put('2', "..---");
        morse.put('3',"...--"); 
        morse.put('4',"....-");
        morse.put('5',".....");
        morse.put('6',"-....");
        morse.put('7',"--...");
        morse.put('8',"---..");
        morse.put('9',"----.");
        morse.put('0',"-----");

        // Alphabet
        morse.put('A',".-");
        morse.put('B',"-...");
        morse.put('C',"-.-.");
        morse.put('D',"-..");
        morse.put('E',".");
        morse.put('F',"..-.");
        morse.put('G',"--.");
        morse.put('H',"....");
        morse.put('I',"..");
        morse.put('J',".---");
        morse.put('K',"-.-");
        morse.put('L',".-..");
        morse.put('M',"--");
        morse.put('N',"-.");
        morse.put('O',"---");
        morse.put('P',".--.");
        morse.put('Q',"--.-");
        morse.put('R',".-.");
        morse.put('S',"...");
        morse.put('T',"-");
        morse.put('U',"..-");
        morse.put('V',"...-");
        morse.put('W',".--");
        morse.put('X',"-..-");
        morse.put('Y',"-.--");
        morse.put('Z',"--..");

        try (// Scanner for users input
        Scanner input = new Scanner(System.in)) {
            // Welcome message to let the user know that this is a morse code translator they will be using 
            System.out.println("Welcome to the morse code translator! ");
            
            // While true loop to run code until user would like to stop asking the user to enter the sentence or word and it will end up priniting both the english and morse code phrases out to the user to see 
            while (true) { 
                System.out.println("Would you like to translate english words and sentences to morse code? (Y/N)"); // Here is were user will start or stop the loop
                char startHere = input.nextLine().charAt(0);
                    
                if (startHere == 'y' || startHere == 'Y'){ // if (y)es ask the user to enter english phrases

                    // System.out.println("\nHint before starting: \n" + "** All the letters from A-Z, Numbers 0-9, and the punctuations ( ? . , ) can be translated **\n" );
                    System.out.println("\nEnter your english sentence or word you would like to be translated here: \nNote: Only letters A-Z, ('?' '.' ','), and numbers 0-9 can be translated into morse code. \n");
                    String phraseInEnglish = input.nextLine();

                    char[] morseList = phraseInEnglish.toUpperCase().toCharArray(); // turns all letters in sentence to upper case so it can match 
                    String printMorse = ""; 

                    // here it look for every key in the hashmap can find its value for each letter for the sentence or word the user entered and gets the morse value from the hashmap from every letter and prints it later on
                    for (char mc : morseList){
                        printMorse += morse.get(mc);
                    }

                    System.out.println("English Phrase: " + phraseInEnglish + "\nMorse code Phrase: " + printMorse + "\n");

                }

                else if (startHere == 'n' || startHere == 'N'){ // if (n)o leaves loop and prints goodbye becuase they will be leaving the translator
                    System.out.println("\nGoodbye. ");
                    break;
                }

                else{ // here for the user if they dont enter one or the other (Y or N)
                    System.out.println("\nPlease select Y or N. ");

                }
            }
        }
    
    }
}