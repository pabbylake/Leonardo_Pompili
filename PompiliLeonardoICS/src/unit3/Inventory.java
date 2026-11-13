package unit3;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;



public class Inventory extends JFrame 
{

	//content pane
	private Container contentPane;
	
	//Labels and Text Fields
	private JLabel cartonsJLabel, itemsJLabel, totalJLabel;
	private JTextField cartonsJTextField, itemsJTextField, totalResultJTextField;
	
	//calculate button
	private JButton calculateJButton;
	
	
	//constructor
	public Inventory()
	{
		this.createUserInterface();
		
	}
	
	//Methods
	//set up contentPane
 	private void setUpContentPane()
 	{
 		contentPane = this.getContentPane(); //make the contentPane
 		contentPane.setLayout(null);
 		contentPane.setBackground(Color.WHITE);
 	}
 	
 	//set up label
	 private JLabel setUpLabel(JLabel label, String text, int x, int y, int width, int height)
	 {
		label = new JLabel(text);
		label.setBounds(x, y, width, height);
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
	    return label;		
	 }
 	
	//set up Button
 	 private JButton setUpButton(JButton button, String text, int x, int y, int width, int height)
 	 {
 		button = new JButton(text);
 		button.setBounds(x, y, width, height);
 		button.setHorizontalAlignment(JLabel.CENTER);
 		contentPane.add( button );
 	    return button;		
 	 }
 	
 	 //set up text field
 	 private JTextField setUpTextField(JTextField field, String text, int x, int y, int width, int height)
 	 {
 		 field = new JTextField(text);
 		 field.setBounds(x, y, width, height);
 		 field.setHorizontalAlignment(JTextField.CENTER);
 		 contentPane.add(field);
 		 return(field);
 	 }
 	 
 	 
 	//set up window
  	private void setUpWindow()
  	{
  		this.setBounds(300, 300, 354, 112);
  		this.setTitle("Inventory");
  		this.setVisible(true);    
  		this.setResizable(false); 
  	}
 	 
 	
	private void createUserInterface()
	{
		this.setUpContentPane();
		
		cartonsJLabel = this.setUpLabel(cartonsJLabel, "Cartons per Shipment:", 0, 16, 140, 21);
		itemsJLabel = this.setUpLabel(itemsJLabel, "Items per Carton:", 0, 48, 110, 21);
		totalJLabel = this.setUpLabel(totalJLabel, "Total:", 204, 16, 40, 21);
		
		cartonsJTextField = this.setUpTextField(cartonsJTextField, "0", 140, 16, 40, 21);
		itemsJTextField = this.setUpTextField(itemsJTextField, "0", 140, 48, 40, 21);
		totalResultJTextField = this.setUpTextField(totalResultJTextField, "", 244, 16, 86, 21);
		
		calculateJButton = this.setUpButton(calculateJButton, "Calculate Total", 204, 48, 126, 24);
		
		
		
		
		
		
		this.setUpWindow();
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Inventory app = new Inventory();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
