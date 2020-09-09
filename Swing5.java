/**
 * Chris Loumeau
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Swing5 extends JFrame {
/**
 * Declare instance variables
 */
	JLabel label;
	JTextField tField;
	
	JPanel panel;
	JPanel EMbuttonPanel;
	 JRadioButton EMbutton;
	/**
	 * constructor for createComponents and addlistener button
	 */
	Swing5 () {
		createComponents();
		addListenerToButton();
		}
	/**
	 * sets instance variables to panel
	 */
	private void createComponents() {
		ImageIcon picture= new ImageIcon("100.png");
		label = new JLabel();
		 label.setIcon(picture);
		
		 panel = new JPanel();
		 panel.add(label);
		
		 label = new JLabel("Lab 8 Lets Get it");
		tField = new JTextField(10);
		
		EMbutton = new JRadioButton ("click me to get a 100 on Lab 8!");
		EMbuttonPanel = new JPanel();
		 EMbuttonPanel.add(EMbutton);
		
		 panel = new JPanel();
		panel.add(tField);
		panel.add(label);
		panel.add(EMbuttonPanel);
		add(panel);
		
		
	}
	/**
	 * makes the button after the method
	 */
private void addListenerToButton() {
		
		EMbutton.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				ImageIcon picture= new ImageIcon("100.png");
				label.setIcon(picture);
				System.out.println("Image is open");
				label.setText(tField.getText());
			}
		});
	
	
}
/**
 * main
 * @param args
 */
public static void main(String[] args) {
	Swing5 frame = new Swing5();
	frame.setVisible(true);
	frame.setSize(5000,2000);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
