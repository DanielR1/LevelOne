 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		int score = 0;

		
String url = "http://www.brandsoftheworld.com/sites/default/files/styles/logo-thumbnail/public/032013/starbucks_2011_true_logo_0.png?itok=Z0oN3t_m";
	
Component image;

		
image = createImage(url);

quizWindow.add(image);
	

quizWindow.pack();



String answer1 = JOptionPane.showInputDialog("What Logo is this?");
Answer("Starbucks", answer1, score);


	
quizWindow.remove(image);

	
String url2 = "https://www.mozilla.org/media/img/styleguide/identity/firefox/guidelines-logo.7ea045a4e288.png";
Component image2;
image2 = createImage(url2);

		
quizWindow.add(image2);


quizWindow.pack();

	
String answer2 = JOptionPane.showInputDialog("What logo is this?");
Answer("Firefox", answer2, score);
score+=100;
quizWindow.remove(image2);
quizWindow.pack();
String url3 = "https://www.aa.com/newamerican/img/newLook1.jpg";
Component image3;
image3 = createImage(url3);

		
quizWindow.add(image3);


quizWindow.pack();

	
String answer3 = JOptionPane.showInputDialog("What logo is this?");
Answer("american airlines", answer3, score);
score+=100;
quizWindow.remove(image3);
quizWindow.pack();
String url4 = "http://www.gannett-cdn.com/-mm-/114f25abccb5766a3396e5eb2a44631f73ac957b/c=0-26-534-428&r=x404&c=534x401/local/-/media/IAGroup/DesMoines/2014/09/02/1409680261000-nationwide-eagle-logo-new.jpg";
Component image4;
image4 = createImage(url4);

		
quizWindow.add(image4);


quizWindow.pack();

	
String answer4 = JOptionPane.showInputDialog("What logo is this?");
Answer("nationwide", answer4, score);
score+=100;
quizWindow.remove(image4);
quizWindow.pack();

JOptionPane.showMessageDialog(null, ""+score);


	

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	public static void Answer(String answer,String guess, int CurrentScore)
	{
	if(answer.equalsIgnoreCase(guess)){
		System.out.println("CORRECT");
		CurrentScore+=100;
	
	}
	else{
		System.out.println("INCORRECT");
	}
	}
	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}