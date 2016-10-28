package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import LabSeven.MySet;

public class MySetTest {

	List<MySet> set = new ArrayList<MySet>();

	@Test
	public void testAddMethod() {

		int[] numsOne = { 9, 10, 11, 6, 0 };
		int[] numsTwo = { 25, 9, 10, 8, 3, 2 };
		MySet setOne = new MySet(numsOne);
		MySet setTwo = new MySet(numsTwo);
		assertNotNull(setOne.add(setTwo));
	}

	@Test
	public void testSubtractMethod() {

		int[] numsOne = { 9, 10, 11, 6, 0 };
		int[] numsTwo = { 25, 9, 10, 8, 3, 2, 98 };
		MySet setOne = new MySet(numsOne);
		MySet setTwo = new MySet(numsTwo);
		assertNotNull(setOne.subtract(setTwo));
	}

	@Test
	public void testMultiplicationMethod() {

		int[] numsOne = { 9, 10, 11, 6, 0 };
		int[] numsTwo = { 25, 9, 10, 8, 3, 2, 98 };
		MySet setOne = new MySet(numsOne);
		MySet setTwo = new MySet(numsTwo);
		assertNotNull(setOne.multiply(setTwo));
	}

	@Test
	public void testDivisionMethod() {

		int[] numsOne = { 9, 10, 11, 6, 0 };
		int[] numsTwo = { 25, 9, 10, 8, 3, 2 };
		MySet setOne = new MySet(numsOne);
		MySet setTwo = new MySet(numsTwo);
		assertNotNull(setOne.divide(setTwo));
	}

	@Test
	public void testAddAnswer() {
		int[] numsOne = { 9, 10, 11, 6, 0 };
		int[] numsTwo = { 25, 9, 10, 8, 3, 2, 98 };
		int[] expected = { 25, 9, 10, 8, 3, 2, 98, 11, 6 };
		set.add(new MySet(numsOne));
		set.add(new MySet(numsTwo));
		set.add(new MySet(expected));
		MySet answer = set.get(0).add(set.get(1));
		assertEquals(set.get(2).toString(), answer.toString());
	}

	@Test
	public void testSubtractAnswer() {
		int[] numsOne = { 9, 10, 11, 7 };
		int[] numsTwo = { 9, 10, 8, 3 };
		int[] expected = { 11, 7 };
		set.add(new MySet(numsOne));
		set.add(new MySet(numsTwo));
		set.add(new MySet(expected));
		MySet answer = set.get(0).subtract(set.get(1));
		assertEquals(set.get(2).toString(), answer.toString());
	}

	@Test
	public void testMultiplicationAnswer() {
		int[] numsOne = { 9, 10, 11, 6, 0 };
		int[] numsTwo = { 9, 10, 8, 3 };
		int[] expected = { 11, 6, 0, 8, 3 };
		set.add(new MySet(numsOne));
		set.add(new MySet(numsTwo));
		set.add(new MySet(expected));
		MySet answer = set.get(0).multiply(set.get(1));
		assertEquals(set.get(2).toString(), answer.toString());
	}

	@Test
	public void testDivisionAnswer() {
		int[] numsOne = { 9, 10, 11, 6, 0 };
		int[] numsTwo = { 25, 9, 10, 8 };
		int[] expected = { 9, 10 };
		set.add(new MySet(numsOne));
		set.add(new MySet(numsTwo));
		set.add(new MySet(expected));
		MySet answer = set.get(0).divide(set.get(1));
		assertEquals(set.get(2).toString(), answer.toString());
	}

	@Test
	public void testLengthForAdd() {
		int[] numsOne = { 9, 10, 11, 6, 0 };
		int[] numsTwo = { 25, 9, 10, 8, 3, 2, 98 };
		set.add(new MySet(numsOne));
		set.add(new MySet(numsTwo));
		MySet answer = set.get(0).add(set.get(1));
		assertSame("Not Same", 9, (answer.getReference().length));

	}

	@Test
	public void testLengthForSubtraction() {
		int[] numsOne = { 9, 10, 11, 7 };
		int[] numsTwo = { 9, 10, 8, 3 };
		set.add(new MySet(numsOne));
		set.add(new MySet(numsTwo));
		MySet answer = set.get(0).subtract(set.get(1));
		assertSame("Not Same", 2, (answer.getReference().length));

	}

	@Test
	public void testLengthForMultiplication() {
		int[] numsOne = { 9, 10, 11, 6, 0 };
		int[] numsTwo = { 9, 10, 8, 3 };
		set.add(new MySet(numsOne));
		set.add(new MySet(numsTwo));
		MySet answer = set.get(0).multiply(set.get(1));
		assertSame("Not Same", 5, (answer.getReference().length));

	}

	@Test
	public void testLengthForDivision() {
		int[] numsOne = { 9, 10, 11, 6, 0 };
		int[] numsTwo = { 25, 9, 10, 8 };
		set.add(new MySet(numsOne));
		set.add(new MySet(numsTwo));
		MySet answer = set.get(0).divide(set.get(1));
		assertSame("Not Same", 2, (answer.getReference().length));

	}

}
