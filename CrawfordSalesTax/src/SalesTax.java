import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.text.DecimalFormat;

public class SalesTax extends Application {
    
    // Constants for tax rates
    private static final double COUNTY_TAX_RATE = 0.06;
    private static final double STATE_TAX_RATE = 0.075;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Monthly Sales Tax Calculator");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label salesLabel = new Label("Total Sales:");
        GridPane.setConstraints(salesLabel, 0, 0);
        TextField salesField = new TextField();
        salesField.setPromptText("Enter total sales");
        GridPane.setConstraints(salesField, 1, 0);

        Label countyTaxLabel = new Label();
        GridPane.setConstraints(countyTaxLabel, 0, 1);

        Label stateTaxLabel = new Label();
        GridPane.setConstraints(stateTaxLabel, 0, 2);

        Label totalTaxLabel = new Label();
        GridPane.setConstraints(totalTaxLabel, 0, 3);

        Button countyTaxButton = new Button("Calculate County Tax");
        GridPane.setConstraints(countyTaxButton, 1, 1);
        countyTaxButton.setOnAction(e -> {
            try {
                double sales = Double.parseDouble(salesField.getText());
                double countyTax = sales * COUNTY_TAX_RATE;
                countyTaxLabel.setText("County Sales Tax: " + formatCurrency(countyTax));
            } catch (NumberFormatException ex) {
                countyTaxLabel.setText("Please enter valid number for total sales.");
            }
        });

        Button stateTaxButton = new Button("Calculate State Tax");
        GridPane.setConstraints(stateTaxButton, 1, 2);
        stateTaxButton.setOnAction(e -> {
            try {
                double sales = Double.parseDouble(salesField.getText());
                double stateTax = sales * STATE_TAX_RATE;
                stateTaxLabel.setText("State Sales Tax: " + formatCurrency(stateTax));
            } catch (NumberFormatException ex) {
                stateTaxLabel.setText("Please enter valid number for total sales.");
            }
        });

        Button totalTaxButton = new Button("Calculate Total Sales Tax");
        GridPane.setConstraints(totalTaxButton, 1, 3);
        totalTaxButton.setOnAction(e -> {
            try {
                double sales = Double.parseDouble(salesField.getText());
                double totalTax = sales * (COUNTY_TAX_RATE + STATE_TAX_RATE);
                totalTaxLabel.setText("Total Sales Tax: " + formatCurrency(totalTax));
            } catch (NumberFormatException ex) {
                totalTaxLabel.setText("Please enter valid number for total sales.");
            }
        });

        grid.getChildren().addAll(salesLabel, salesField, countyTaxButton, stateTaxButton, totalTaxButton, countyTaxLabel, stateTaxLabel, totalTaxLabel);

        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String formatCurrency(double amount) {
        DecimalFormat formatter = new DecimalFormat("$#,##0.00");
        return formatter.format(amount);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
