package unit2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome extends JFrame
{

	private Container contentPane;
	private JPanel welcomePanel;
	private JLabel textLabel, pictureLabel;
	
	
	//no-arguement constructor
	public Welcome()
	{
		this.createUserInterface();
	}
	
	
	
	//methods
	
	//set up contentPane
	private void setUpContentPane()
	{
		contentPane = this.getContentPane();//make the ContentPane
		contentPane.setLayout(null);
		contentPane.setBackground(Color.yellow);
	}

	//set up panel
	private JPanel setUpPanel(JPanel panel, int x, int y, int width, int height)
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(x, y, width, height);
		panel.setBackground(Color.GREEN);
		contentPane.add(panel);
		return panel;
	}
	
	
	//set up label
	private JLabel setUpLabel(JLabel label, String text, int x, int y, int width, int height)
	{
		label = new JLabel();
		label.setText(text);
		label.setBounds(x, y, width, height);
		label.setFont(new Font("Arial Black",Font.BOLD,30));
		label.setHorizontalAlignment(JLabel.CENTER);
		welcomePanel.add(label);
		return label;
		
	}
	
	
	//set up window
	private void setUpWindow()
	{
		//this.setSize(608,413);
		this.setBounds(0, 0, 608, 413);
		this.setTitle("Welcome");
		this.setVisible(true);
		this.setResizable(false);
		
		
		
	}
	
	
	
	private void createUserInterface()
	{
		this.setUpContentPane();
		welcomePanel = this.setUpPanel(welcomePanel, 10, 10, 588, 373);
		textLabel = this.setUpLabel(textLabel, "Welcome to Java!", 22, 0, 550, 88);
		pictureLabel = this.setUpLabel(pictureLabel, "", 150, 70, 300, 300);
		pictureLabel.setIcon(new ImageIcon("src/unit2/images/java.jpg"));
		this.setUpWindow();
		
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Welcome app = new Welcome(); //instance of a class = object
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
