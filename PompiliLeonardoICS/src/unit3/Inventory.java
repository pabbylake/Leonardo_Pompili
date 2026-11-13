package unit3;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		cartonsJTextField.addKeyListener(createTextFieldsKeyListener());
		itemsJTextField = this.setUpTextField(itemsJTextField, "0", 140, 48, 40, 21);
		cartonsJTextField.addKeyListener(createTextFieldsKeyListener());
		
		totalResultJTextField = this.setUpTextField(totalResultJTextField, "", 244, 16, 86, 21);
		
		calculateJButton = this.setUpButton(calculateJButton, "Calculate Total", 204, 48, 126, 24);
		calculateJButton.addActionListener(createCalculationActionListener());
		
		this.setUpWindow();
	}
	
	//Listens for a button click
	private ActionListener createCalculationActionListener()
	{
		ActionListener listener = new ActionListener() //anonymous inner class
		{
			public void actionPerformed(ActionEvent event)
			{
				calculateJButtonActionPerformed(event);
			}
			
		};
		
		return listener;
		
	}
	
	private void calculateJButtonActionPerformed(ActionEvent event)
	{
		try
		{
			int numberOfCartons = Integer.parseInt(cartonsJTextField.getText());
			int numberOfItems = Integer.parseInt(itemsJTextField.getText());
			int total = numberOfCartons * numberOfItems;
			String totalString = String.valueOf(total);
			totalResultJTextField.setText(totalString);
		}
		catch(Exception error)
		{
			JOptionPane.showMessageDialog(null,  "Please enter an integerl ONLY", 
					"ERROR", JOptionPane.ERROR_MESSAGE);
			
		}
		
		
	}
	
	
	//Listens to the keyboard
	private KeyListener createTextFieldsKeyListener()
	{
		KeyListener listener = new KeyAdapter()
		{
			public void keyPressed(KeyEvent event)
			{
				clearTotalField(event);
			}
		};
		return listener;
				
	}
	
	private void clearTotalField(KeyEvent event)
	{
		totalResultJTextField.setText("");
	}
	
	
	public static void main(String[] args) 
	{
		Inventory app = new Inventory();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
