import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter = generateRandomLetter();
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	void Setup() {

		frame.setName("Typing Game");
		frame.setVisible(true);

		frame.add(panel);
		panel.add(label);
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.pack();
		frame.addKeyListener(this);

	}

	public static void main(String[] args) {
		TypingTutor type = new TypingTutor();
		type.Setup();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	int characters = 0;
	int cc = 0;

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		System.out.println(e.getKeyChar());
		if (e.getKeyChar() == currentLetter) {
			System.out.println("Correct!");
			panel.setBackground(Color.green);
			cc += 1;

		} else {
			panel.setBackground(Color.red);

		}
		characters += 1;
		if (characters >= 60) {
			showTypingSpeed(cc);
			System.exit(0);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
	}

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

	Date timeAtStart = new Date();

}
