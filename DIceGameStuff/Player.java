class Player{

    private String name; // variable for the names 
    private int score; // variable for scoreing of points
    private Die die; // variable for die file 
    private int value; // variable for value of roll

    public Player(String playerName){
        name = playerName;
        score = 50; // max score 
        die = new Die(6); // gave number of sides to the dice since theres 6 sides
    }
    public int roll(){
        die.roll();
        value = die.getValue();
        return value;
    } // returns the value of the dice number rolled 
    
    public void editScore(int playerName){
        if ((score - playerName) < 1){
            score = score + playerName;    
        }
        
        else{
            score = score - playerName;  
        }
        
    } // edits the score after each round the dice is rolled until player 1 or 2 wins or ties
    
    public int getScore(){
        return score;
    } // getting users score for the game which is seen in main file
    
    public String getName() {
        return name;
    } // getting users name 
    
} // player class 
    
    