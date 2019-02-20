import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//cart c= new cart();
	}

	@Test
	public void test1() {
		cart c= new cart();
		int x=c.getcount();
		assertTrue(x==0);
	}
	@Test
	public void test2() {
		cart c= new cart();
		c.addBook("java",127,1);
		double x=127;
		int y=1;
		assertTrue(c.getPrice()==x);
		assertTrue(c.getcount()==y);
		
	}
	@Test
	public void test3() {
		cart c= new cart();
		c.addBook("java",127,1);
		c.addBook("web design",100,1);
		double x=227;
		int y=2;
		assertTrue(c.getPrice()==x);
		assertTrue(c.getcount()==y);
		
	}


}
