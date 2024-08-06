import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;


public class CrawfordUpperCase {

	public static void main(String[] args) {
		try {			
								
			File outFile = new File("OutputFile.txt");
			
			if (outFile.createNewFile()) {
				System.out.println("File created: " + outFile.getName());
			} else {
				System.out.println("File already exists.");
			}
			
			System.out.println("What is the name of your file?");
			Scanner keyboard = new Scanner(System.in);
			String read = keyboard.nextLine() + ".txt";
			File reader = new File(read);
			Scanner inputFile = new Scanner(reader);
			
			while (inputFile.hasNextLine()) {
				String data = inputFile.nextLine();
				FileWriter myWriter = new FileWriter(outFile);
				myWriter.write(data.toUpperCase());
				myWriter.close();
				System.out.println("Successful transcription");
			}
			inputFile.close();
			keyboard.close();
			
			
		} catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		} catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		 }
	}
}
