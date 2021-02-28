
	package fr.formation;
	
	import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
	
	public class ParamTest {
	

		
		@Test
		@Parameters("value")
		public void testParameters(int value) {
			assertEquals(0, value % 2);;
			
		}
		
	}

	
	