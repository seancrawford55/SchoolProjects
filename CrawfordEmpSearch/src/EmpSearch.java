import java.util.*;

public class EmpSearch {

	public static void main(String[] args) {
		String [] [] Employees =  new String [10][2];
		String EmpName;
		Scanner myObj = new Scanner(System.in);
		for (int i = 0; i < Employees.length; i++) {
			System.out.println("What employee is next?");
			EmpName = myObj.nextLine();
			if (EmpName.equals("ZZZ") ) {
				System.out.println("Terminating");
				break;
			} else {
				Employees[i][0] = EmpName;
			}
		}
		
		System.out.println("There was " + Employees.length + " added to the list");
		
		for (int s = 0; s < Employees.length; s++) {
			System.out.println("What is " + Employees[s][0] + " employee number?");
			EmpName = myObj.nextLine();
			if (EmpName.equals("ZZZ") ) {
				System.out.println("Terminating");
				break;
			} else {
				Employees[s][1] = "B" + EmpName;
			}
		}
        for (int k = 0; k < Employees.length; k++)
            // Loop through all elements of current row
            for (int j = 0; j < Employees[k].length; j++)
                System.out.print(Employees[k][j] + " ");
	}
}

