package morse;

import java.util.Scanner;

public class Morse {

	public static void main(String[] args) {
		
		String[] morseCode;
		morseCode = new String[10];
		
		morseCode[0] = "-----"; // index 0, represents value 0
		morseCode[1] = ".----";		
		morseCode[2] = "..---";		
		morseCode[3] = "...--";				
		morseCode[4] = "....-";	
		morseCode[5] = ".....";		
		morseCode[6] = "-....";
		morseCode[7] = "--...";
		morseCode[8] = "---..";	
		morseCode[9] = "----.";	// index 9, represents value 9		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Type a number: ");
		String data = keyboard.nextLine();
		
		for(int i=0; i<data.length();i++) {
			String number = data.substring(i,i+1); //recuperar el caracter en la posicion i
			int index = Integer.parseInt(number);
			System.out.print(morseCode[index] + " ");
		}
		
		System.out.println();
		keyboard.close();
	}
	

}
