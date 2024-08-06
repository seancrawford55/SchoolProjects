import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AnimalRadio extends JFrame {
	private JLabel imageLabel;
	
	private void DisplayImage(String imageName) {
		ImageIcon icon = new ImageIcon(imageName);
		imageLabel.setIcon(icon);
	}
	
	public AnimalRadio() {
		//Setting up window size and title
		setTitle("Animal Image Display");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//Creating the buttons with labels
		JPanel radioPanel = new JPanel();
		JRadioButton jagButton = new JRadioButton("Jaguar");
		JRadioButton chiButton = new JRadioButton("Chicken");
		JRadioButton otherButton = new JRadioButton("Other");
		
		//Bunching the buttons together
		ButtonGroup group = new ButtonGroup();
		group.add(jagButton);
		group.add(chiButton);
		group.add(otherButton);
	
		
		radioPanel.add(jagButton);
		radioPanel.add(chiButton);
		radioPanel.add(otherButton);
		
		imageLabel = new JLabel();
		add(radioPanel, BorderLayout.NORTH);
		add(radioPanel, BorderLayout.CENTER);
		
		jagButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayImage("jaguar.jpg");
			}
		});
		
		chiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayImage("chicken.jpg");
			}
		});
		
		otherButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayImage("other.jpg");
			}
		});
		
	}
		
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new AnimalRadio().setVisible(true);
				}
			});
		}
	
	}


