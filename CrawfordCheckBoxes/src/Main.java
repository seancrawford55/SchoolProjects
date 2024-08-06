import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Main extends JFrame {
	private JCheckBox redCheckBox;
	private JCheckBox purpleCheckBox;
	private JCheckBox blueCheckBox;
	private JPanel circlePanel;
	
	private void updateCircleColor() {
        if (redCheckBox.isSelected() && !purpleCheckBox.isSelected() && !blueCheckBox.isSelected()) {
            circlePanel.setBackground(Color.RED);
        } else if (!redCheckBox.isSelected() && purpleCheckBox.isSelected() && !blueCheckBox.isSelected()) {
            circlePanel.setBackground(new Color(128, 0, 128)); // Purple
        } else if (!redCheckBox.isSelected() && !purpleCheckBox.isSelected() && blueCheckBox.isSelected()) {
            circlePanel.setBackground(Color.BLUE);
        } else if (redCheckBox.isSelected() && purpleCheckBox.isSelected() && !blueCheckBox.isSelected()) {
            circlePanel.setBackground(Color.ORANGE);
        } else if (!redCheckBox.isSelected() && purpleCheckBox.isSelected() && blueCheckBox.isSelected()) {
            circlePanel.setBackground(new Color(255, 105, 180)); // Pink
        } else {
            circlePanel.setBackground(Color.BLACK);
        }
        circlePanel.repaint();
    }
	
	public Main() {
        setTitle("Color Circle");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        redCheckBox = new JCheckBox("Red");
        purpleCheckBox = new JCheckBox("Purple");
        blueCheckBox = new JCheckBox("Blue");
        
        circlePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int diameter = Math.min(getWidth(), getHeight()) - 50;
                int x = (getWidth() - diameter) / 2;
                int y = (getHeight() - diameter) / 2;
                g.setColor(Color.BLACK);
                g.fillOval(x, y, diameter, diameter);
            }
        };
        
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(redCheckBox);
        checkBoxPanel.add(purpleCheckBox);
        checkBoxPanel.add(blueCheckBox);

        add(circlePanel, BorderLayout.CENTER);
        add(checkBoxPanel, BorderLayout.SOUTH);

        redCheckBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateCircleColor();
            }
        });

        purpleCheckBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateCircleColor();
            }
        });
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

}
