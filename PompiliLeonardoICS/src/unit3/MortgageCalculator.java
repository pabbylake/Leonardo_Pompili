package unit3;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MortgageCalculator extends JFrame
{
	
	/* INSTRUCTIONS
	 * 1. Fix all the errors in this program.  To do so you will have to import some stuff from the API.
	 * You will also have to complete some unfinished code.  Follow the instructions below.
	 * 
	 * 2.Complete the createUserInterface method by calling the appropriate methods.  Each component
	 * text and bounds are listed as comments above each component.  Make the correct method call to 
	 * complete this method and assign it to the correct component.  The method has the assignment for each 
	 * component but some lines of code are missing the correct method call.  Make sure to include the
	 * calls to setUpContentpPane and setUpWindow in the correct order. The monthlyPaymentJTextField
	 * should not be editable.  It is an output field.
	 * 
	 * 3. There are two actions to be performed by two buttons - calculateJButton and clearJButton.
	 * Add the correct listener to the correct button such that the application works as intended. Then
	 * complete the clear action perform method by setting the text of every field to an empty String. The
	 * calculate action is completed but take a look at how to calculate using double values. Since this 
	 * application is working with money we need to use decimal values.  Also check out Math.pow(a,b).
	 * This finds the exponential value of a^b.
	 * 
	 * 4. Complete the main method.
	 */
	
	//contentPane
	private Container contentPane;
	
	// JLabel and JTextField for home value
	private JLabel homeValueJLabel;
	private JTextField homeValueJTextField;
	
	// JLabel and JTextField for loan amount
	private JLabel loanAmountJLabel;
	private JTextField loanAmountJTextField;
	
	// JLabel and JTextField for mortgage term in years
	private JLabel termJLabel;
	private JTextField termJTextField;
	
	// JLabel and JTextField for yearly homeowner's insurance
	private JLabel insuranceJLabel;
	private JTextField insuranceJTextField;
	
	// JLabel and JTextField for yearly property taxes
	private JLabel propertyTaxesJLabel;
	private JTextField propertyTaxesJTextField;
	
	// JLabel and JTextField for interest rate percentage
	private JLabel interestJLabel;
	private JTextField interestJTextField;
	
	// JLabel and JTextField for monthly payment amount
	private JLabel monthlyPaymentJLabel;
	private JTextField monthlyPaymentJTextField;
	
	// JButtons to calculate monthly payment and clear all JTextFields
	private JButton calculateJButton;
	private JButton clearJButton;
	
	DecimalFormat dollars = new DecimalFormat("$0.00");
	
	// no-argument constructor
	public MortgageCalculator()
	{
	   createUserInterface();
	}
	
	
	private void setUpContentPane()
	{
		contentPane = getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.WHITE);
	}
	
	private JLabel setUpLabel(JLabel label, String text, int x, int y, int width, int height)
	{
		label = new JLabel(text);
		label.setBounds(x, y, width, height);
		contentPane.add(label);
		return label;
	}
	
	private JTextField setUpTextField(JTextField field, String text, int x, int y, int width, int height)
	{
		field = new JTextField(text);
		field.setBounds(x, y, width, height);
		field.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(field);
		return field;
	}
	
	private JButton setUpButton(JButton button, String text, int x, int y, int width, int height)
	{
		button = new JButton(text);
		button.setBounds(x, y, width, height);
		contentPane.add(button);
		return button;
	}
	
	private void setUpWindow()
	{
		 this.setTitle( "Mortgage Calculator" ); 
		 this.setBounds(400,400, 332, 360 );            
		 this.setVisible( true );                
		 this.setResizable(false);
	}
	
	
	
	// create and position GUI components
	public void createUserInterface()
	{
	   // get content pane and set its layout
	   
		
	   // set up homeValueJLabel - text:-"Home value:" bounds:- 10, 16, 100, 21
	   homeValueJLabel = this.setUpLabel(homeValueJLabel, "Home value", 10, 16, 100, 21);
	   
	   // set up homeValueJTextField - text:- "125000" bounds:-  212, 16, 100, 21 
	   homeValueJTextField = this.setUpTextField(homeValueJTextField,"125000", 212, 16, 100, 21);
	   
	   // set up loanAmountJLabel - text:- "Loan Amount:" bounds choose appropriate bounds 
	   loanAmountJLabel = this.setUpLabel(loanAmountJLabel,"Loan Amount:", 10, 56, 100, 21);
	   
	   // set up loanAmountJTextField - text:- "100000" bounds 212, 16, 100, 21 
	   loanAmountJTextField = this.setUpTextField(loanAmountJTextField,"100000", 212, 56, 100, 21);
	   
	   // set up termJLabel - text:- "Term (years):" bounds 10, 96, 100, 21
	   termJLabel = this.setUpLabel(termJLabel, "Term (years):", 10, 96, 100, 21);
	   
	   // set up termJTextField - text:- "20" bounds 212, 96, 100, 21
	   termJTextField = this.setUpTextField(termJTextField,"20", 212, 96, 100, 21);
	   
	   // set up insuranceJLabel - text "Homeowner's insurance (yearly):" bounds 10, 136, 196, 21  
	   insuranceJLabel = this.setUpLabel(insuranceJLabel,"Homeowner's insurance (yearly):",10, 136, 196, 21); 
	   
	   // set up insuranceJTextField- text:- "500" bounds 212, 136, 100, 21
	   insuranceJTextField = this.setUpTextField(insuranceJTextField,"500", 212, 136, 100, 21);
	   
	   // set up propertyTaxesJLabel - text:- "Property taxes (yearly):" bounds 10, 176, 148, 21  
	   propertyTaxesJLabel = this.setUpLabel(propertyTaxesJLabel,"Property taxes (yearly):",10, 176, 148, 21);
	   
	   // set up propertyTaxesJTextField - text "2100" bounds  212, 176, 100, 21 
	   propertyTaxesJTextField = this. 
	   
	   // set up interestJLabel - text "Interest rate (percent):" bounds 10, 216, 140, 21 
	   interestJLabel = this.
	   
	   // set up interestJTextField - text:- "3.5" bounds 212, 216, 100, 21 
	   interestJTextField = this.
	   
	   // set up monthlyPaymentJLabel - text:- "Monthly payment:" bounds 10, 256, 120, 21
	   monthlyPaymentJLabel = this.
	   
	   // set up monthlyPaymentJTextField - bounds 212, 256, 100, 21
	   monthlyPaymentJTextField = this.setUpTextField(monthlyPaymentJTextField, "", 212, 256, 100, 21);
	   monthlyPaymentJTextField.setBorder( new BevelBorder( 1 ) );
	   
	   // set up calculateJButton - text:- "Calculate"  bounds 133, 296, 90, 23  
	   calculateJButton = setUpButton(calculateJButton,
               "Calculate", 133, 296, 90, 23);

	  

	   // set up clearJButton - text:- "Clear" bounds 237, 296, 75, 23 
			   clearJButton = setUpButton(clearJButton,
		                "Clear", 237, 296, 75, 23);
	   
	   // set properties of application's window
	   
	} 
	
	
	private ActionListener createCalculateActionListener()
	{
		ActionListener listener = new ActionListener()
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
			double numberOfMonths = Double.parseDouble(this.termJTextField.getText())*12;
			double monthlyRate = Double.parseDouble(interestJTextField.getText())/1200.0;
			double ratePlusOne = monthlyRate + 1;
			double principal = Double.parseDouble(loanAmountJTextField.getText());
			double exponent = Math.pow(ratePlusOne, numberOfMonths);
			double numerator = principal * monthlyRate * exponent;
			double denominator = exponent - 1;
			double monthlyPayment = numerator/denominator;
			this.monthlyPaymentJTextField.setText(dollars.format(monthlyPayment));
			System.out.println(dollars.format(monthlyPayment));
			
		}
		catch(Exception error)
		{
			JOptionPane.showMessageDialog(null, "Please enter only numbers in all fields",
					"ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private ActionListener createClearActionListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				clearJButtonActionPerformed(event);
			}
		};
		return listener;
	}
	
	private void clearJButtonActionPerformed(ActionEvent event)
	{ 
		homeValueJTextField.setText("");
        loanAmountJTextField.setText("");
        termJTextField.setText("");
        insuranceJTextField.setText("");
        propertyTaxesJTextField.setText("");
        interestJTextField.setText("");
        monthlyPaymentJTextField.setText("");
	}
	
	
	// main method
	public static void main( String[] args )
	{
	   
		MortgageCalculator application = new MortgageCalculator();
		application.setVisible(true);
	
	} // end method main

} // end class MortgageCalculator

