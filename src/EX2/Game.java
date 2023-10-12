package EX2;
import java.util.ArrayList;
import java.util.LinkedList;

public class Game {
	private Players players = new Players();
    private Questions questions = new Questions();
    
    
    
    public Game()
    {
        for (var i = 0; i < 50; i++)
        {
            questions.addPopQuestion(i);
            questions.addScienceQuestion(i);
            questions.addSportsQuestion(i);
            questions.addRockQuestion(i);
            
        }
    }

    
    private void AskQuestion()
    {
        if (players.currentCategory() == "Pop")
        {
        	questions.askPopQuestion();
        }
        if (players.currentCategory() == "Science")
        {
        	questions.askScienceQuestion();
        }
        if (players.currentCategory() == "Sports")
        {
        	questions.askSportsQuestion();
        }
        if (players.currentCategory() == "Rock")
        {
        	questions.askRockQuestion();
        }
    }
    

    public void Roll(int roll)
    {
    	int currentPlayer = players.get_currentPlayer();
        System.out.println( Integer.toString(currentPlayer) + " is the current player");
        System.out.println("They have rolled a " + roll);

        
    	    if (players.get_inPenaltyBox()[currentPlayer]) {
    	    	
    	    	if (roll % 2 != 0) {
    	    		players.isgettingOutOfPenaltyBox(roll);
    	    		AskQuestion();
    	    	}
    	    	else {
    	    		players.isnotgettingOutOfPenaltyBox(roll);
    	    	}
    	   
    	        } 
    	     else {
    	        players.movePlayer(roll);
    	        System.out.println("The category is " + players.currentCategory());
    	        AskQuestion();
    	    }
    	
        }


        
}

