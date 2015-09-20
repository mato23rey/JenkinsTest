import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		HelloPrinter hp = new HelloPrinter();
		
		assertTrue(hp.printHello("Hello"));
	}
}
