package Lab1Package;
import java.util.Scanner;

public class CS380_lab1 {
	public static void main (String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("What number would you like reversed?");
		String input = kb.next();
		char[] ch = new char[input.length()];
		for (int i = 0; i< input.length(); i++) {
			ch[i] = input.charAt(input.length()-(i+1));
		}
		
		for (int j= 0; j < ch.length; j++) {
			System.out.print(ch[j]);
		}
	}

}
