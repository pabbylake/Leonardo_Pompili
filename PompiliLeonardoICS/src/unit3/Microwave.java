package unit3;

/*
 * Instructions
 * 
 * 1. Complete the constructor - call the createUserInterface method ✅
 * 
 * 2. Complete the following methods:
 * 
 * a. createUserInterface - call the all of the appropriate methods in the right order. 
 * 
 * The panels are listed with their bounds below.
 * doorJPanel - 16, 16, 350, 284✅
 * controlJPanel - 368, 16, 182, 284 ✅
 * 
 * The label is listed with its bounds below.
 * displayJLabel - 31, 13, 120, 30 - put the text "12:00" on this label✅
 * 
 * The buttons are listed with their bounds below.
 * oneJButton - 23, 56, 45, 45 -     put the text "1" on this button
 * twoJButton - 68, 56, 45, 45 -     put the text "2" on this button
 * threeJButton - 113, 56, 45, 45 -  put the text "3" on this button
 * fourJButton - 23, 101, 45, 45 -   put the text "4" on this button
 * fiveJButton - 68, 101, 45, 45 -   put the text "5" on this button
 * sixJButton - 113, 101, 45, 45 -   put the text "6" on this button
 * sevenJButton - 23, 146, 45, 45 -  put the text "7" on this button
 * eightJButton - 68, 146, 45, 45 -  put the text "8" on this button
 * nineJButton - 113, 146, 45, 45  - put the text "9" on this button
 * zeroJButton - 68, 191, 45, 45 -   put the text "0" on this button
 * startJButton - 13, 252, 74, 24 -  put the text "Start" on this button
 * clearJButton - 100, 252, 74, 24 - put the text "Clear" on this button
 * 
 * b. main - write the code to start the app and stop the app
 * 
 */

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Microwave extends JFrame
{
  	 private Container contentPane;
   
   	private JPanel doorJPanel, controlJPanel;
   
 	  private JLabel displayJLabel;
   
 	  private JButton oneJButton, twoJButton, threeJButton, 
      	fourJButton, fiveJButton, sixJButton, sevenJButton, 
      	eightJButton, nineJButton, zeroJButton, startJButton, 
      	clearJButton;
   
   
   	// no-argument constructor
   	public Microwave()
   	{
   		createUserInterface();
   		
   	}
   
   
	 //set up contentPane
 	private void setUpContentPane()
 	{
 		contentPane = this.getContentPane(); //make the contentPane
 		contentPane.setLayout(null);
 		contentPane.setBackground(Color.DARK_GRAY);
 	}
 	
 	//set up panel
 	private JPanel setUpPanel(JPanel panel, int x, int y, int width, int height)
 	{
 		 panel = new JPanel();
 		 panel.setLayout(null);
 		 panel.setBounds(x, y, width, height);
 		 panel.setBorder( new LineBorder( Color.BLACK ) );
 	     contentPane.add(panel);
 	     return panel;	
 	}
 	
 	 //set up label
 	 private JLabel setUpLabel(JLabel label, String text, int x, int y, int width, int height)
 	 {
 		label = new JLabel(text);
 		label.setBounds(x, y, width, height);
 		label.setBorder(new LineBorder(Color.BLACK));
 		label.setHorizontalAlignment(JLabel.CENTER);
 		controlJPanel.add(label);
 	    return label;		
 	 }
 	 
 	//set up label
 	 private JButton setUpButton(JButton button, String text, int x, int y, int width, int height)
 	 {
 		button = new JButton(text);
 		button.setBounds(x, y, width, height);
 		button.setHorizontalAlignment(JLabel.CENTER);
 		controlJPanel.add( button );
 	    return button;		
 	 }
 	 
 	 
 	//set up window
 	private void setUpWindow()
 	{
 		this.setBounds(300, 300, 574, 346);
 		this.setTitle("Microwave");
 		this.setVisible(true);    
 		this.setResizable(false); 
 	}
   
 	
   	 // create and position GUI components
   	 private void createUserInterface()
   	 {
   		 //doorJPanel - 16, 16, 350, 284
   		 doorJPanel = this.setUpPanel(doorJPanel, 16, 16, 350, 284);

   		 //controlJPanel - 368, 16, 182, 284 
   		 controlJPanel = this.setUpPanel(controlJPanel, 368, 16, 182, 284);
   		
   		 //displayJLabel - 31, 13, 120, 30 - put the text "12:00" on this label
   		 displayJLabel = this.setUpLabel(displayJLabel, "12:00", 31, 13, 120, 30);
   		 
   		 
	 } // end method createUserInterface
   
   
   
   	 // main method
   	 public static void main( String[] args ) 
   	 {
    		

    	 } // end method main

} // end class Microwave


