package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class adderTest {

	@Test
	public void test() {
		adder add = new adder();
		assertEquals(30, add.addition(10, 20));
	}

}
