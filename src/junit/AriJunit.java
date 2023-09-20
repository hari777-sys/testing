package junit;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AriJunit {
			AriTest a=new AriTest();
		
	@Test
		void testadd() 
	{
			assertEquals("error",  15, a.add(10,5));
			assertEquals("error",  25, a.add(10,15));
			assertEquals("error",  11, a.add(10,1));
		}

		
	@Test
		void testsub() 
	{
			assertEquals("error",  8, a.sub(10,2));
			assertEquals("error",  10, a.sub(15,5));
			assertEquals("error",  11, a.sub(15,4));
		}
		
	@Test
		void testmul() 
	{
			assertEquals("error",  20, a.mul(10,2));
			assertEquals("error",  25, a.mul(5,5));
			assertEquals("error",  60, a.mul(15,4));
		}
		
	//@Test
		void testaddfail()
	{
			assertEquals("error",  17, a.add(10,5));
		}
		
	//@Test
		void testsubfail() 
	{
			assertEquals("error",  18, a.sub(10,2));
		}
		
	//@Test
		void testmulfail() 
	{
			assertEquals("error",  30, a.mul(10,2));
		}
	}


	

