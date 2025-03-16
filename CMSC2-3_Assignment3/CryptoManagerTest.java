package Assignment3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//Testing StringInBounds method
	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("PYTHON"));
		assertFalse(CryptoManager.isStringInBounds("{PROGRAMMING}"));
	}

	//Testing EncryptCaesar method
	@Test
	public void testEncryptCaesar() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("hi", 2));
		assertEquals("IJK", CryptoManager.caesarEncryption("DEF", 5));
		assertEquals("MDYD#LV#JUHDW", CryptoManager.caesarEncryption("JAVA IS GREAT", 3));
	}

	//testing DecryptCaesar method
	@Test
	public void testDecryptCaesar() {
		assertEquals("PROGRAM", CryptoManager.caesarDecryption("QSPHSBN", 1));
		assertEquals("JAVA IS GREAT", CryptoManager.caesarDecryption("MDYD#LV#JUHDW", 3));
	}

	//testing EncryptBellaso method
	@Test
	public void testEncryptBellaso() {
		assertEquals("WX)", CryptoManager.bellasoEncryption("TOY", "CIPHER"));
		assertEquals("OP_T[9MH[[SY^JU", CryptoManager.bellasoEncryption("HAPPY HALLOWEEN", "GOODBYE"));
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.bellasoEncryption("program", "MC"));
	}

	//testing DecryptBellaso method
	@Test
	public void testDecryptBellaso() {
		assertEquals("TESTING", CryptoManager.bellasoDecryption("e#/RTy", "ECLIPSE"));
		assertEquals("MONTGOMERY COLLEGE", CryptoManager.bellasoDecryption("P^#\"[(PT''4\\R[!S[^", "COUNTY"));

	}
}
