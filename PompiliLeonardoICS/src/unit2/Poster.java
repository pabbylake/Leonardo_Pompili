package unit2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.Imageicon;
import javax.swing.JFrame;//abstract window tool kit
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Poster extends JFrame
{

	
	private Container contentPane;
	
	private JLabel titleLabel;
	
	private JLabel basketballLabel; //image
	
	
	
	
	//Constructor - default
	public Poster()
	{
		this.createUserInterface();
	}
	
	
	
	
	//This is where all the work will go
	private void createUserInterface()
	{
		this.setUpContentPane();//always first
		titleLabel = this.setUpLabel(titleLabel, "Basketball", 400, 20, 200, 100);
		titleLabel.setFont(new Font("Zapfino", Font.BOLD, 25));
		titleLabel.setForeground(Color.black);
		
		basketballLabel =
		this.setUpLabel(basketballLabel,"", 100, 200, 300, 300);
		basketballLabel.setIcon(new Imageicon(""));
		
		
		this.setUpWindow();//last
		// in between is where the poster "the meat" goes
		
	}
	
	
	
	
	
	
	
	private void setUpContentPane()
	{
		contentPane = this.getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(255,128,0));//need to import color
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
		panel.setLayout(null);//if you put an object on the screen and your gonna put another object on top, you have to set the layout to null.
		return panel;
		
	}
	
	
	
	
	
	private void setUpWindow()
	{
		setTitle("basketball");
		setBounds(0,0,1000,1000);
		setVisible(true);
		setResizable(false);
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		Poster app = new Poster();//start the app
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	
	
	
	
	
}
