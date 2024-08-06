import javax.swing.*;
import java.awt.event.*;


public class VacationRentalApp extends JFrame {
	
	private JComboBox<String> locationComboBox;
	private JComboBox<String> bedroomsComboBox;
	private JList<String> mealsList;
	
	private final String[] locations = {"Parkside", "Poolside", "Lakeside"};
	private final int[] locationPrice = {700, 850, 1025};
	private final String[] bedrooms = {"1 bedroom", "2 bedroom", "3 bedroom"};
	private final int[] bedroomPrice = {0, 80, 160};
	private final String[] meals = {"Meals included", "No Meals"};
	private final int[] mealPrice = {200, 0};
	
	private void placeComponents(JPanel panel) {
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel locationLabel = new JLabel("Select Location: ");
		panel.add(locationLabel);
		
		locationComboBox = new JComboBox<>(locations);
		panel.add(locationComboBox);
		
		JLabel bedroomsLabel = new JLabel("Select a number of bedrooms: ");
		panel.add(bedroomsLabel);
		
		bedroomsComboBox = new JComboBox<>(bedrooms);
		panel.add(bedroomsComboBox);
		
		JLabel mealsLabel = new JLabel("Choose meals option: ");
		panel.add(mealsLabel);
		
		mealsList = new JList<>(meals);
		mealsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(new JScrollPane(mealsList));
		
		JButton calculateButton = new JButton("Calculate");
		panel.add(calculateButton);
		calculateButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				calculateCost();
			}
		});
	}
	
	private void calculateCost() {
		int locationIndex = locationComboBox.getSelectedIndex();
		int bedroomIndex = bedroomsComboBox.getSelectedIndex();
		int mealsIndex = mealsList.getSelectedIndex();
		
		int totalCost = locationPrice[locationIndex] + bedroomPrice[bedroomIndex] + mealPrice[mealsIndex];
		
		JOptionPane.showMessageDialog(this, "The total cost for each week is $" + totalCost);
	}
	
	private void setLocationComboBox() {
		locationComboBox.setSelectedIndex(0);		
	}
	
	private void setBedroomsComboBox() {
		bedroomsComboBox.setSelectedIndex(0);
	}
	
	private void setMealsList() {
		mealsList.setSelectedIndex(0);
	}
	
	public VacationRentalApp() {
		setTitle("Lambert's Vacation Rentals");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		add(panel);
		placeComponents(panel);
		
		setLocationComboBox();
		setBedroomsComboBox();
		setMealsList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VacationRentalApp app = new VacationRentalApp();
		app.setVisible(true);
	}

}
