
	package fr.formation;
	
	import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	
	public class DataProviderTest {
	

		
		@Test(dataProvider = "nombresImpairs")
		public void testParameters(int value) {
			assertEquals(1, value % 2);;
			
		}
		
		@DataProvider(name = "nombresImpairs")
		public Object[] nombresImpairs() {
			
			return new Random()
					.ints(1, 50)
					.limit(10)
					.filter(x -> x % 2 == 1)
					.boxed()
					.toArray();
		}
		
	}

	
	