import java.util.Scanner;

public class MorseToText {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String output = "";
		System.out.println("Cuantas palabras desea capturar?");
		int wordCount = keyboard.nextInt();
		keyboard.nextLine();
		
		for (int i=0; i<wordCount; i++) {
			String morseCodes = keyboard.nextLine();
			String[] letters = morseCodes.split(" ");
			String word = convertCodesToWord(letters);
			output+= word + " ";	
		}
		
		System.out.println(output);
		
		
	}

	private static String convertCodesToWord(String[] letters) {
		String word = "";
		for(int i=0; i<letters.length; i++){
			String letter = findInArray(letters[i]);
			word += letter;
		}
		
		return word;
	}

	private static String findInArray(String code) {
		String[] letters = {"A", "B", "C","D","E","F","G","H","I","J","K","L","M","N","O","P",
							"Q","R","S","T","U","V","W","X","Y","Z",
							"0","1","2","3","4","5","6","7","8","9"};
		
		String[] morseCodes = {
				"./",		//A
				"/...",		//B
				"/./.",		//C
				"/..",		//D
				".",		//E
				"../.",		//F
				"//.",		//G
				"....",		//H
				"..",	    //I
				".///",		//J
				"/./", 		//K
				"./..",		//L
				"//",		//M
				"/.",		//N
				"///",		//O
				".//.",		//P
				"//./",		//Q
				"./.",		//R
				"...",		//S
				"/",		//T
				".//",		//U
				".../",		//V
				".//",		//W
				"/../",		//X
				"/.//",		//Y
				"//..",		//Z
				"/////",	//0			
				".////",	//1
				"..///",	//2
				"...//",	//3
				"..../",	//4
				".....",	//5
				"/....",	//6
				"//...",	//7
				"///..",	//8
				"////.",	//9
		};
		
		for(int i=0; i<morseCodes.length;i++) {
			if (morseCodes[i].equals(code)) {
				return letters[i];
			}
		}
		return "!";		
		
	}

}
