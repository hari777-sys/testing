package junit;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class BigTestJunit {

	BigTest c=new BigTest();

	@Test
	public void testbig() {
		//fail("Not yet implemented");
		assertEquals("error in biggest",  20, c.big (20,10,5));
		assertEquals("error in biggest",  50, c.big (20,50,10));
		assertEquals("error in biggest",  80, c.big (10,20,80));
		
	}

	//@Test
	public void testbigfail() {
	assertEquals("error in biggest",  50, c.big (10,50,60));
	assertEquals("error in biggest",  5, c.big (50,10,5));
	assertEquals("error in biggest",  40, c.big (10,50,40));
}
}


