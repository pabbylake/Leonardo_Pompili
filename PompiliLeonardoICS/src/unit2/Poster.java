package unit2;

import java.awt.Container;

import javax.swing.JFrame;//abstract window tool kit
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Poster extends JFrame
{

	
	private Container contentPane;
	
	
	private void createUserInterface()
	{
		
	}
	
	
	
	private void setUpContentPane()
	{
		
	}
	
	
	private JLabel setUpLabel(JLabel label, String text, int x, int y, int width, int height)
	{
		label = new JLabel(text);
		label.setText(text);//both of these can be used. You have options. Will show up on quiz.
		label.setBounds(x, y, width, height);
		contentPane.add(label);
		return label;
		
		
		
	}
	
	
	private JPanel setUpPanel(JPanel panel, int x, int y, int width, int height)//do not put semi-colon
	{
		panel = new JPanel();//"new" is instance of an object
		panel.setBounds(x, y, width, height);
		contentPane.add(panel);
		return panel;
		
		
		
		
		
	}
	
	private void setUpWindow()
	{
		
	}
	
	
	
	public static void main(String[] args) 
	{
		

	}

}
