import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
public static void main(String[] args) {
	SimpleCalculator calculator = new SimpleCalculator();

	calculator.show();


}
JTextField field1 = new JTextField();
JTextField field2 = new JTextField();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
JLabel label = new JLabel();
private void show() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel(new FlowLayout());
	frame.add(panel);
	
	
	panel.add(field1);
	panel.add(field2);
field1.setPreferredSize(new Dimension(150,25));
field2.setPreferredSize(new Dimension(150,25));
	
	
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	frame.setSize(350, 300);
	button1.setText("add");
	button2.setText("sub");
	button3.setText("mult");
	button4.setText("div");
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);

	panel.add(label);
	label.setFont(new Font("Arial", Font.BOLD, 50));
}

@Override
public void actionPerformed(ActionEvent e) {
	JButton clicked = (JButton)e.getSource();
	String text1 = field1.getText();
	String text2 = field2.getText();
	int num1 = Integer.parseInt(text1);
	int num2 = Integer.parseInt(text2);
	if(clicked.equals(button1)){
	int answer = num1+num2;
	label.setText(""+answer);
	}
	if(clicked.equals(button2)){
		int answer = num1-num2;
		label.setText(""+answer);
	}
	if(clicked.equals(button3)){
		int answer = num1*num2;
		label.setText(""+answer);
	}
	if(clicked.equals(button4)){
		int answer= num1/num2;
		label.setText(""+answer);
	}
	
	
}
}
