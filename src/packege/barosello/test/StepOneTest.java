package packege.barosello.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class StepOneTest {
	
	int valueInputInt = 25;
	int baroVal  	  = 7;
	int selloVal 	  = 4;
	int baroselloVal  = 1;
	ArrayList<String> arrayList = new ArrayList<String>();

	@Test
	public void test() {
		Junit test = new Junit();
		
		ArrayList<String> result = test.stepOne(valueInputInt);
		int baroOccurrences = Collections.frequency(result, "Baro");
		int selloOccurrences = Collections.frequency(result, "Sello");
		int baroselloOccurrences = Collections.frequency(result, "BaroSello");

		assertEquals(Arrays.asList("0", "1", "2", "Baro", "4", "Sello", "Baro", 
				"7", "8", "Baro", "Sello", "11", "Baro", "13", "14", 
				"BaroSello", "16", "17", "Baro", "19", "Sello", "Baro", "22", 
				"23", "Baro", "Sello"), result);
		
		assertTrue("Error, baroOccurrences", baroOccurrences <= baroVal);
		assertTrue("Error, selloOccurrences", selloOccurrences <= selloVal);
		assertTrue("Error, baroselloOccurrences", baroselloOccurrences <= baroselloVal);
		
	}
}

