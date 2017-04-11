package packege.barosello.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class stepTwoTest {
	
	int valueInputInt = 25;
	int nardoVal  = 3;
	ArrayList<String> arrayList = new ArrayList<String>();

	@Test
	public void test() {
		Junit test = new Junit();
		
		ArrayList<String> result = test.stepTwo(valueInputInt);
		
		int nardoOccurrences = Collections.frequency(result, "Nardo");

		assertEquals(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "Nardo", "8", "9", "10", 
				"11", "12", "13", "Nardo", "15", "16", "17", "18", "19", "20", "Nardo", "22", "23", 
				"24", "25"), result);
		
		assertTrue("Error, nardoOccurrences", nardoOccurrences <= nardoVal);
		
		
		
	}

}
