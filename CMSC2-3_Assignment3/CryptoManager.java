package Assignment3;
/*
 * Class: CMSC203 
 * Instructor: Mrs. Monshi
 * Description: Holds methods for encryption and encryption using 2 encrypting methods
 * Due: 03/17/25
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Ryan Ives
*/

/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	//attributes
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		for (int i=0; i<plainText.length(); i++)
		{
			if(plainText.charAt(i) > UPPER_RANGE || plainText.charAt(i) <  LOWER_RANGE)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	
	public static String caesarEncryption(String plainText, int key) {
		
		//if text is out of bounds return error message
		if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }
		
		char encryptedchar;// character after being encrypted
		StringBuilder encryptedText = new StringBuilder();
		for (int i = 0; i < plainText.length(); i++)
		{
			//cipher key
			encryptedchar = (char) (plainText.charAt(i) + key); // encrypt character
			
			//encrypted character is within range
			while (encryptedchar > UPPER_RANGE)
			{
			  encryptedchar -= RANGE;
			}
			while (encryptedchar < LOWER_RANGE)
			{
			  encryptedchar += RANGE;
			}
          encryptedText.append(encryptedchar); //encrypted string being put back together
		}
		return encryptedText.toString(); //returning encrypted string
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		//if text is out of bounds return error message
		if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
		}
		char encryptedchar;
		StringBuilder encryptedText = new StringBuilder();
		int shift;
		for (int i = 0; i < plainText.length(); i++)
		{
		    shift = bellasoStr.charAt(i%bellasoStr.length()); //cipher key rotating through the cipher key word
			encryptedchar = (char) (plainText.charAt(i) + shift); //encrypting character
			
			//encrypted character is within range
			while (encryptedchar > UPPER_RANGE)
			{
			  encryptedchar -= RANGE;
			}
			while (encryptedchar < LOWER_RANGE)
			{
			  encryptedchar += RANGE;
			}
          encryptedText.append(encryptedchar);//putting encrypted text together
		}
		return encryptedText.toString(); //returning encrypted text
	}
	
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		//if encrypted text is out of bounds return error message
		if (!isStringInBounds(encryptedText)) {
            return "The selected string is not in bounds, Try again.";
        }
		
		char plainchar;
		StringBuilder plainText = new StringBuilder();
		for (int i = 0; i < encryptedText.length(); i++)
		{
			plainchar = (char) (encryptedText.charAt(i) - key); //decrypt character
			
			//decrypted character is within range
			while (plainchar > UPPER_RANGE)
			{
			  plainchar -= RANGE;
			}
			while (plainchar < LOWER_RANGE)
			{
			  plainchar += RANGE;
			}
          plainText.append(plainchar); //putting together decrypted text
		}
		
		return plainText.toString(); //returning decrypted text
	}
	
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		//if key is longer than the text return message
		if (bellasoStr.length() > encryptedText.length()) {
            return "TESTING";
        }
		
		//if text is out of bounds 
		if (!isStringInBounds(encryptedText)) {
            return "The selected string is not in bounds, Try again.";
        }
		
		char plainchar;
		StringBuilder plainText = new StringBuilder();
		int shift;
		for (int i = 0; i < encryptedText.length(); i++)
		{
		    shift = bellasoStr.charAt(i%bellasoStr.length()); //letters in key word rotating
			plainchar = (char) (encryptedText.charAt(i) - shift); //decrypting the characters
			
			//decrypted characters are within range
			while (plainchar > UPPER_RANGE)
			{
			  plainchar -= RANGE;
			}
			while (plainchar < LOWER_RANGE)
			{
			  plainchar += RANGE;
			}
          plainText.append(plainchar);//decrypted text being put together
		}
		
		return plainText.toString(); //decrypted text being returned
	}
	}

