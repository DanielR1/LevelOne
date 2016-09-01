 // Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.io.File;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton;
	private JButton fifthButton;
	
	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());
		
		// 1. Make the frame show up
		frame.setVisible(true);

		// 2. Give your frame a title
		frame.setTitle("Jeopardy");
		
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel header = createHeader("Musical Instruments");
		// 4. Add the header component to the quizPanel
		
		quizPanel.add(header);
		
		
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);

		
		// 6. Use the createButton method to set the value of firstButton 
		firstButton = createButton("$200");
	
	// 7. Add the firstButton to the quizPanel
		quizPanel.add(firstButton);
		
		// 8. Write the code inside the createButton() method below. Check that your game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.
		
		// 9. Use the secondButton variable to hold a button using the createButton method
		secondButton = createButton("$400");
		fourthButton = createButton("$600");
		thirdButton = createButton("$800");
		
		fifthButton = createButton("$1000");
		
		
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(secondButton);

		quizPanel.add(fourthButton);
		quizPanel.add(thirdButton);
		quizPanel.add(fifthButton);
		
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
		fifthButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below
				
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount+1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height, Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * 13. Use the method provided to play the Jeopardy theme music 
	 *
	 * 
	 * 14. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
	 *
	 * [optional] Use the showImage or playSound methods when the user answers a question 
	 */
	
	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton button = new JButton();
		
		// Set the text of the button to the dollarAmount
		button.setText(dollarAmount);
		
		// Increment the buttonCount (this should make the layout vertical)
		buttonCount++;
	
		// Return your new button instead of the temporary button
		return button;
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// Remove this temporary message:
		
		// Use the method that plays the jeopardy theme music.
Clip music = playJeopardyTheme();
		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton
		
		if(buttonPressed.equals(firstButton)){
			askQuestion("The most known instrument, has 88 keys","What is a piano?","Piano",200);
			firstButton.setText(null);
			quizPanel.remove(firstButton);

		}
			// Call the askQuestion() method
			
			// Fill in the askQuestion() method. When you play the game, the score should change.
		
		// Or if the buttonPressed was the secondButton
		if(buttonPressed.equals(secondButton)){
		
			askQuestion("A common instrument, has 4 strings, G,D,A,E, played with a bow","What is a violin?","violin",400);
			secondButton.setText(null);
			quizPanel.remove(secondButton);

		}
		if(buttonPressed.equals(thirdButton)){
			
			askQuestion("A common brass instrument, has 3 valves, can come in Bb or C","What is a trumpet?","trumpet",800);
			thirdButton.setText(null);
			quizPanel.remove(thirdButton);

		}
	if(buttonPressed.equals(fourthButton)){
			
			askQuestion("A common string instrument, has 6 strings,E,B,G,D,A,E, and is played plucking the strings","What is a guitar?","guitar",600);
			fourthButton.setText(null);
			quizPanel.remove(fourthButton);

		}
	if(buttonPressed.equals(fifthButton)){
		
		askQuestion("A rare string instrument, has 4 strings, C,G,D,A, played with instrument resting on shoulder, its the best instrument","What is a viola?","viola",1000);
		fifthButton.setText(null);
		quizPanel.remove(fifthButton);

	}
		

			// Call the askQuestion() method with a harder question
			
		
		// Clear the button text (set the button text to nothing)
		music.close();
		
	}
int x = 0;
	private void askQuestion(String question, String correctAnswer,String correctAnswer2, int prizeMoney) {
		// Remove this temporary message
		
		// Use a pop up to ask the user the question
		String answer = JOptionPane.showInputDialog(question);
	
		// If the answer is correct
		if(answer.equalsIgnoreCase(correctAnswer)){
			score += prizeMoney;
			updateScore();
			JOptionPane.showMessageDialog(null, "You are correct!");
			x+=1;
		}
		
			// Increase the score by the prizeMoney
			
			// Call the updateScore() method
			
			// Pop up a message to tell the user they were correct
			
		// Otherwise
		else if(answer.equalsIgnoreCase(correctAnswer2)){
			score += prizeMoney;
			updateScore();
			JOptionPane.showMessageDialog(null, "You are correct!");
			x+=1;
		}
		else{
			score -=prizeMoney;
			JOptionPane.showMessageDialog(null, "You were wrong, the correct answer was "+correctAnswer);
			updateScore();
			x+=1;
		}
		if (x==5){
			if(score>0){
			JOptionPane.showMessageDialog(null, "Congratulations, you earned $"+score);
			}
			if(score==0){
				JOptionPane.showMessageDialog(null, "Lol you earned no money :p");
			}
			if(score<0){
				score = score - (2*score);
				JOptionPane.showMessageDialog(null, "Sorry kiddo, but you have to pay $"+score);
			}
		}
			// Decrement the score by the prizeMoney
			
			// Pop up a message to tell the user the correct answer
			
			// Call the updateScore() method
			
		
	}


public Clip playJeopardyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			return clip;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
