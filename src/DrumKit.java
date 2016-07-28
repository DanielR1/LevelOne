// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

    JLabel drumLabelWithImage;
    JLabel drumLabelWithImage2;

    public static void main(String[] args) throws Exception {
   	 new DrumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	
    	JFrame lol = new JFrame();
   	 

    	lol.setVisible(true);
    	   	 
 
    	lol.setSize(1200, 700);
   	 
   	
    	lol.setTitle("Sounds");
   	 
 
    	JPanel lel = new JPanel();
  
    	lol.add(lel);
   	    String DrumImage = "Soho-SD204-Coated-Steel-Shell-Snare-Drum.jpg";
   	    drumLabelWithImage = createLabelImage(DrumImage);
   	 
   	     lel.add(drumLabelWithImage);
   	
   	     lel.setLayout(new GridLayout());
    
   	    	    lol.pack();
   	 

   	    	    drumLabelWithImage.addMouseListener(this);
   	    	 String DrumImage2 = "bassdrum3.jpg";
   	   	     drumLabelWithImage2 = createLabelImage(DrumImage2);
   	   	 
   	   	     lel.add(drumLabelWithImage2);
   	   	
   	   	     lel.setLayout(new GridLayout());
   	    
   	   	    	    lol.pack();
   	   	 

   	   	    	    drumLabelWithImage2.addMouseListener(this);

    }

    public void mouseClicked(MouseEvent e) {

    	System.out.println("Mouse Clicked");

   	 JLabel drumClicked = (JLabel) e.getSource();
   	 
   		if (drumClicked == drumLabelWithImage){
   			playSound("200157__quartertone__sd13x03-pearl-mlp-lsn-hde-v03.wav");

   		}
   		if (drumClicked == drumLabelWithImage2){
   			playSound("BD0010.wav");
   		}
   	 
   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
    }

    private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}


    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}


