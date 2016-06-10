import static org.junit.Assert.*;

import org.junit.Test;

public class IntSequenceTest {

	@Test
	public void test1() {
		IntSequence cr1 = new IntSequence(3);
		cr1.add(9);
		cr1.add(10);
		cr1.add(11);
		cr1.add(0);
		cr1.remove(2);
		cr1.insert(5, 1);
		System.out.println(cr1.toString());
		System.out.println(cr1.getNum());
		cr1.delete(1);
		System.out.println(cr1.getNum());
		System.out.println(cr1.toString());
	}

}
