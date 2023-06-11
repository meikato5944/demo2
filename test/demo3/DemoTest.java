package demo3;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class DemoTest {

	@Test
	void ともに自然数() {
		Demo target = new Demo();
		int result = target.absAdd(3, 5);
		assertTrue(result == 8);
	}
	
	@Test
	void 片方負の数() {
		Demo target = new Demo();
		int result = target.absAdd(-3, 5);
		assertTrue(result == 8);
	}
	
	@Test
	void 両方負の数() {
		Demo target = new Demo();
		int result = target.absAdd(-3, -5);
		assertTrue(result == 8);
	}
}
