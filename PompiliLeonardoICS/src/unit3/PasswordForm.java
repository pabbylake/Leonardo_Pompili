package unit3;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PasswordForm extends JFrame
{
	
	//NOTE: The bounds are written as comments next to each GUI component
	
	//contentPane
	private Container contentPane;
	
	// JLabel and JTextField for user name
	private JLabel userNameJLabel;  //bounds 16, 16, 110, 21 
	private JTextField userNameJTextField; //bounds 172, 16, 140, 21
	
	// JLabel and JTextField for password
	private JLabel passwordJLabel; //bounds 16, 48, 140, 21
	private JPasswordField passwordJPasswordField;  //bounds 172, 48, 140, 21
	
	// JLabel and JTextField for reentering password
	private JLabel reenterPasswordJLabel;  //bounds 16, 80, 160, 21
	private JPasswordField reenterPasswordJPasswordField; //bounds 172, 80, 140, 21 
	
	// JButton for logging in to the Message Application
	private JButton logInJButton; //bounds 240, 120, 72, 24
	
	//JLabel and JTextArea for messages
	private JLabel messageJLabel;  //bounds 16, 136, 180, 21
	private JTextArea messageJTextArea;  //bounds 16, 160, 290, 40
	
	//JButtons to save a message, log out and clear all input
	private JButton saveJButton;  //bounds 58, 248, 72, 24
	private JButton logOutJButton;  //bounds 146, 248, 78, 24
	private JButton clearJButton;  //bounds 240, 248, 72, 24
	
	// no-argument constructor
	public PasswordForm()
	{
	   createUserInterface();
	}
	
	
	//Complete the following methods.  All components are added to the contentPane.
	//New methods are labeled and the others were done in previous projects.
	//NOTE: The bounds are written as comments next to each GUI component
	
	
	//1. set up contentPane
	private void setUpContentPane()
	{
	
	contentPane = getContentPane();
	contentPane.setLayout(null);
	contentPane.setBackground(Color.white);
	
	}
	
	
	//2. set up label
	private JLabel setUpLabel(JLabel label, String text, int x, int y, int width, int height)
	{
		label = new JLabel(text);
		label.setBounds(x, y, width, height);
		contentPane.add(label);
		return label;
	}
	
	//3. set up text field
	private JTextField setUpTextField(JTextField field, String text, int x, int y, int width, int height)
	{
		field = new JTextField(text);
		field.setBounds(x, y, width, height);
		contentPane.add(field);
		return field;
	}
	
	//4. set up password field - This is a new component and method
	private JPasswordField setUpPasswordField(JPasswordField field, String text, int x, int y, int width, int height)
	{
		field = new JPasswordField(text);
		field.setBounds(x, y, width, height);
		contentPane.add(field);
		return field;
        
	}
	
	//5. set up button
	 private JButton setUpButton(JButton button, String text, int x, int y, int width, int height)
	 {
		 button = new JButton(text);
	     button.setBounds(x, y, width, height);
	     contentPane.add(button);
	     return button;

	 }
	 
	 
	 
	//6. set up text area - This is a new component and method
	 private JTextArea setUpTextArea(JTextArea area, String text, int x, int y, int width, int height)
	 {
		 area = new JTextArea(text);
	     area.setBounds(x, y, width, height);
	     area.setEditable(false);
	     contentPane.add(area);
	     return area;
		 
		 
	 }
	//7. set up window - bounds 400, 400, 336, 312
	 private void setUpWindow()
	    {
	        setTitle("Password Form");
	        setBounds(400, 400, 336, 312);
	        setResizable(false);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	    }
	
	/*
	 * Finally you have to create the action performed methods for all of the buttons and add the correct
	 * action to the button.  The actions are just going to print some text in the text area.Use the name entered in 
	 * the userName field for all messages.  For example, if the user types the name Carol you should include it
	 * in your message.  So a message could read "Carol logged in", or Carol information saved", or "Carol logged out".
	 * The clear button does not have to include the user name and can say "All cleared".
	 *
	 * 
	 * 8. The log in button should print a message that says the user logged in.  
	 * 9. The save button should print a message that says that the user information was saved.
	 * 10. The log out button should print a message that says that the user is logged out.
	 * 11. The clear button should print a message that says that the user information was cleared and it should clear all fields.
	 */
	
	
	
	//12. complete this method to create and position all GUI components
	//NOTE: The bounds are written as comments next to each component
	public void createUserInterface()
	    {
	        setUpContentPane();

	        // User name
	        userNameJLabel = this.setUpLabel(userNameJLabel,"User name:", 16, 16, 110, 21);

	        userNameJTextField = this.setUpTextField(userNameJTextField,"", 172, 16, 140, 21);

	        // Password
	        passwordJLabel = this.setUpLabel(passwordJLabel,"Password:", 16, 48, 140, 21);
	        passwordJPasswordField = setUpPasswordField(passwordJPasswordField, "", 172, 48, 140, 21);
	        
	        //Reenter password
	        reenterPasswordJLabel = setUpLabel(reenterPasswordJLabel,"Reenter password:", 16, 80, 160, 21);
	        reenterPasswordJPasswordField = setUpPasswordField(reenterPasswordJPasswordField, "", 172, 80, 140, 21);
	
	        // Log in button
	        logInJButton = setUpButton(logInJButton,"Log In", 240, 120, 72, 24);
	        
	        //Message label
	        messageJLabel = setUpLabel(messageJLabel,"Messages:", 16, 136, 180, 21);
	        
	        //Message text area
	        messageJTextArea = setUpTextArea(messageJTextArea,"", 16, 160, 290, 40);
	        
	        //Save button
	        saveJButton = setUpButton(saveJButton,"Save", 58, 248, 72, 24);

	        //Log out button
	        logOutJButton = setUpButton(logOutJButton,"Log Out", 146, 248, 78, 24);

	        //Clear button
	        clearJButton = setUpButton(clearJButton,"Clear", 240, 248, 72, 24);
	        
	        //Log in action
	        logInJButton.addActionListener(new ActionListener()
	        	{
	            public void actionPerformed(ActionEvent event)
	            	{
		          messageJTextArea.setText(userNameJTextField.getText() + " logged in");

	            	}  
	        	});
	        //Save action
	        saveJButton.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent event)
	            {
	                messageJTextArea.setText(userNameJTextField.getText() + " information saved");
	            }
	        });
	        //Log out action
	        logOutJButton.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent event)
	            {
	                messageJTextArea.setText(userNameJTextField.getText() + " logged out");
	            }
	        });
	        //Clear action
	        clearJButton.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent event)
	            {
	                userNameJTextField.setText("");
	                passwordJPasswordField.setText("");
	                reenterPasswordJPasswordField.setText("");
	                messageJTextArea.setText("All cleared");
	            }
	        });

	        
	    
	        //Set up window
	        setUpWindow();
	    }
	
	
	
	//13. Complete the main method
	public static void main( String[] args )
	{
		PasswordForm application = new PasswordForm();
        application.setVisible(true);
	} 

} // end class Password
