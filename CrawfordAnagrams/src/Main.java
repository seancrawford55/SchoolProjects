import java.util.*;

public class Main {
	private static int charRange = 256;
	
	public static boolean isAnagram (String str1, String str2) {
		boolean boo = true;
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		if (n1 != n2) {
			boo = false;
		}
		
		int count[] = new int [charRange];
		for (int i = 0; i < n1; i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		
		for (int i = 0; i < charRange; i++) {
			if (count[i] != 0) {
				boo = false;
			}
		}
		
		return boo;
	}
	public static void main (String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter your first word:");
		String Str1 = myObj.nextLine();
		System.out.println("Please enter your second word:");
		String Str2 = myObj.nextLine();
		
		if(isAnagram(Str1, Str2)) {
			System.out.println("The two words " + Str1 + " and " + Str2 + " are anagrams!");
		} else {
			System.out.println("The two words " + Str1 + " and " + Str2 + " are not anagrams.");
		}
		
	}

}
