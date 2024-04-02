import java.util.Scanner;

public class kmshamwell_DiceGame {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        // simple rules of the game 
        System.out.println("\nWelcome to the Dice Game!!! \n");
        System.out.println("********************************");
        System.out.println("Rules:");
        System.out.println("This is a 2 player game");
        System.out.println("Player who gets one point first wins");
        System.out.println("To win you must roll excatly a 1");
        System.out.println("********************************\n");

        // set variable playing tp true so it says while playing like playing the game 
        boolean playing = true;


        while(playing){

            // ask players if they are ready to start playing  
            System.out.println("Are you ready to play? (Y/N)");
            char playGame = keyboard.next().charAt(0);
            
            //  if they are it will ask the players and simulate the game for both player one and two 
            if (playGame == 'y' || playGame == 'Y'){
                
                // ask for both player 1 and player 2's name 
                System.out.println("Enter Player 1 name here:");
                String name1 = keyboard.next();
                System.out.println("Enter Player 2 name here:");
                String name2 = keyboard.next();
                
                Player player1 = new Player(name1); // adding player one to playerName in player file running to find the score for player one as the game goes on 
                Player player2 = new Player(name2); // adding player two to playerName in player file running to find the score for player one as the game goes on 
                
                // count start of 1 which just increased for each round that the game is played 
                int roundCount = 1;

                //  while both players score doesnt eaqul one the game plays until one person gets to one point
                while (player1.getScore() != 1 && player2.getScore() != 1){
                    
                    // set this up for the round break so after each round this will apear so you can tell its the next round being played 
                    System.out.println("\n************");
                
                    // line for the round count 
                    System.out.println("Round " + roundCount + ":");
                    
                    // player ones information when each round is printed 
                    int p1Score = player1.roll();
                    player1.editScore(p1Score);
                    System.out.println("A " + p1Score + " was rolled by " + player1.getName());
                    int p1Roundcheck = player1.getScore() - 1;
                    
                    // player twos information when each round is printed 
                    int p2Score = player2.roll();
                    player2.editScore(p2Score);
                    System.out.println("A " + p2Score + " was rolled by " + player2.getName());
                    int p2Roundcheck = player2.getScore() - 1;

                    // prints out each players points after each round so the players can see there score and whos winning after each round
                    System.out.println(player1.getName() + " -> " + player1.getScore() + " points");
                    System.out.println(player2.getName() + " -> " + player2.getScore() + " points");
                    
                    if (p1Roundcheck == p2Roundcheck){
                        System.out.println("Tie on round " + roundCount);
                    } // prints tie if score is the same for both player one and two
                    
                    else {
                        if (p1Roundcheck < p2Roundcheck){
                            System.out.println(player1.getName() + " wins round " + roundCount);
                        }
                        else {
                            System.out.println(player2.getName() + " wins round " + roundCount);
                        }
                    } // prints who has the highest score and is here to see who is winning and who wins after every round
                    
                    roundCount++; // here for the rount count to keep adding until last round

                } // while loop for each round until player 1 or player 2 wins 

                System.out.println("Would you like to play again? (Y/N)");
                char playAgain= keyboard.next().charAt(0);
                if (playAgain == 'n' || playAgain == 'N'){
                    System.out.println("Thanks for playing! ");
                    break;
                }
                else if (playAgain == 'y' || playAgain == 'Y'){
                    System.out.println("Great!");
                }
                else{
                    System.out.println("You did not select Y or N. ");

                }
            } // if statement whihc playes the game if the user types (Y)es 

            else if (playGame == 'n' || playGame == 'N'){
                System.out.println("Come back and play again later!");
                break;
            } // else if statement which break if user doesnt want to play typing (N)o

            else{
                System.out.println("Please select Y/N ");
            } // else statement for the loop telling the user to select (Y)es or (N)o when starting 
            
        } // while loop

    } // main

} // kmshamwell_DiceGame

