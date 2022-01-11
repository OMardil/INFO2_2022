package pckg1;

public class RecursiveScenarios {

     public static void main(String []args){
        
    	boolean b1 = isPalindrome("holoh");
        System.out.println(b1);
        b1 = isPalindrome("hola");
        System.out.println(b1);
        b1 = isPalindrome("anitalavalatina");
        System.out.println(b1);
        b1 = isPalindrome("holacomoestas");
        System.out.println(b1);
        b1 = isPalindrome("h");
        System.out.println(b1); 
        b1 = isPalindrome("");
        System.out.println(b1);   
        
        char[] array = new char[]{'h','o','l','h'};
        System.out.println(isPalindrome(array));
        
     }
     
     public static boolean isPalindrome(String word){
        if (word.length() <= 1)
            return true;
        
        if (word.charAt(0) == word.charAt(word.length()-1))
            return isPalindrome(word.substring(1, word.length()-1));
        else 
            return false;
     }
     
     public static boolean isPalindrome(char[] word){
       
        if (word.length <= 1)
            return true;
        
        if (word[0] == word[word.length-1]){
            char[] newArray = new char[word.length-2];
            int j = 0;
            for (int i = 1; i<word.length-1; i++){
                newArray[j++] = word[i];
            }
            return isPalindrome(newArray);
        } else 
            return false;         
     }
}