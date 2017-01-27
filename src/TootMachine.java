import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	void setup(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
	
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		frame.setVisible(true);
		button1.addActionListener(this);
		button1.setText("Normal Fart");
		button2.addActionListener(this);
		button2.setText("Quick Fart");
		button3.addActionListener(this);
		button3.setText("Long Fart");
		frame.pack();
	}
public static void main(String[] args) {
	TootMachine lol = new TootMachine();
	lol.setup();
	
}

private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals(button1)){
		playSound("CommonFart.wav");
	}
	if(e.getSource().equals(button2)){
		playSound("QuickFart.wav");
	}
	if(e.getSource().equals(button3)){
		playSound("LongFart.wav");
	}
}


}
