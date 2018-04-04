import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
        int score= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
        String answer= JOptionPane.showInputDialog(null,"What has a head and tail,but has no body?");
       

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
             if(answer.equals("coin")) { 
          JOptionPane.showMessageDialog(null,"You are correct");
          score++;
          
             }
		// 5. Otherwise, say "wrong" and tell them the answer
             else {
            	  JOptionPane.showMessageDialog(null,"You are incorrect");
             }
             answer= JOptionPane.showInputDialog(null,"Which word is spelled incorrectly in the dictionary?");
             if(answer.equals("incorrectly")) {
            	 JOptionPane.showMessageDialog(null,"You are correct");
                 score++;
             }
             else {
            	 JOptionPane.showMessageDialog(null,"You are incorrect");
             }
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.fou
             JOptionPane.showMessageDialog(null,"Your score is "+score+"");
	}
}

