import static org.junit.Assert.*;
import org.junit.Test;
import LabSeven.MyFraction;


public class MyFractionTest {
	@Test
	public void testAddMethod() {
		int[] frac1 = {(int)(Math.random() * 20),(int)(Math.random() * 20)}; 
		int[] frac2 = {(int)(Math.random() * 20),(int)(Math.random() * 20)};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'+');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		assertNotNull(fraction1.add(fraction2));
	}
	
	@Test
	public void testSubMethod() {
		int[] frac1 = {(int)(Math.random() * 20),(int)(Math.random() * 20)}; 
		int[] frac2 = {(int)(Math.random() * 20),(int)(Math.random() * 20)};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'+');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		assertNotNull(fraction1.subtract(fraction2));
	}
	
	@Test 
	public void testMultMethod() {
		int[] frac1 = {(int)(Math.random() * 20),(int)(Math.random() * 20)}; 
		int[] frac2 = {(int)(Math.random() * 20),(int)(Math.random() * 20)};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'+');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		assertNotNull(fraction1.multiply(fraction2));
	}
	
	@Test
	public void testDivMethod() {
		int[] frac1 = {(int)(Math.random() * 20),(int)(Math.random() * 20)}; 
		int[] frac2 = {(int)(Math.random() * 20),(int)(Math.random() * 20)};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'+');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		assertNotNull(fraction1.divide(fraction2));
	}
	
	
	
	@Test
	public void testAddAnsNeg() {
		//Test answer when both fractions are negative
		int[] frac1 = {12 , 5}; 
		int[] frac2 = {7 , 10};
		
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'-');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '-');
		MyFraction fractionAnswer = fraction1.add(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 31.0 , fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 10.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '-', fraction1.add(fraction2).getSign());
	}
	
	@Test
	public void testAddAnsPosNeg() {
		//Test answer when fractions are positive and negative
		int[] frac1 = {25 , 21}; //resolves to 50 / 42
		int[] frac2 = {37 , 42};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'-');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		MyFraction fractionAnswer = fraction1.add(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 13.0 /*Not sure if this should be 13 or -13*/ , fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 42.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '-', fraction1.add(fraction2).getSign());
	}
	
	@Test
	public void testAddAnsPos() {
		//Test answer when both fractions are positive
		int[] frac1 = {17 , 9}; //resolves to 50 / 42
		int[] frac2 = {32 , 27};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'+');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		MyFraction fractionAnswer = fraction1.add(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 83.0 /*Not sure if this should be 13 or -13*/ , fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 27.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '+',fractionAnswer.getSign());
	}
	
	
	
	
	
	@Test
	public void testSubAnsNeg() {
		int[] frac1 = {12 , 5}; 
		int[] frac2 = {7 , 10};
		
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'-');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '-');
		MyFraction fractionAnswer = fraction1.subtract(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 17.0 , fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 10.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '-', fraction1.add(fraction2).getSign());
	}
	
	@Test
	public void testSubAnsPosNeg() {
		//Test answer when fractions are positive and negative
		int[] frac1 = {25 , 21}; //resolves to 50 / 42
		int[] frac2 = {37 , 42};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'-');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		MyFraction fractionAnswer = fraction1.subtract(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 29.0  ,/*or -29*/ fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 14.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '-', fraction1.add(fraction2).getSign());
	}
	
	@Test
	public void testSubAnsPos() {
		//Test answer when both fractions are positive
		int[] frac1 = {17 , 9}; //resolves to 51 / 27
		int[] frac2 = {32 , 27};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'+');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		MyFraction fractionAnswer = fraction1.subtract(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 19.0  , fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 27.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '+',fractionAnswer.getSign());
	}
	
	
	
	
	@Test
	public void testMultAnsNeg() {
		int[] frac1 = {12 , 5}; 
		int[] frac2 = {7 , 10};
		
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'-');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '-');
		MyFraction fractionAnswer = fraction1.multiply(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 42.0 , fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 25.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '+', fractionAnswer.getSign());
	}
	
	@Test
	public void testMultAnsPosNeg() {
		//Test answer when fractions are positive and negative
		int[] frac1 = {5 , 7};
		int[] frac2 = {2 , 3};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'-');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		MyFraction fractionAnswer = fraction1.multiply(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 10.0  , fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 21.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '-', fractionAnswer.getSign());
	}
	
	@Test
	public void testMultAnsPos() {
		//Test answer when both fractions are positive
		int[] frac1 = {4 , 9}; 
		int[] frac2 = {3 , 7};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'+');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		MyFraction fractionAnswer = fraction1.multiply(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 4.0 , fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 21.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '+',fractionAnswer.getSign());
	}

	@Test
	public void testDivAnswerNeg() {
		int[] frac1 = {12 , 5}; 
		int[] frac2 = {7 , 10};
		
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'-');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '-');
		MyFraction fractionAnswer = fraction1.divide(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 24.0 , fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 7.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '+', fractionAnswer.getSign());
	}
	
	@Test
	public void testDivAnsPosNeg() {
		//Test answer when fractions are positive and negative
		int[] frac1 = {5 , 7};
		int[] frac2 = {2 , 3};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'-');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		MyFraction fractionAnswer = fraction1.divide(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 15.0  , fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 14.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '-', fractionAnswer.getSign());
	}
	
	@Test
	public void testDivAnsPos() {
		//Test answer when both fractions are positive
		int[] frac1 = {4 , 9}; 
		int[] frac2 = {3 , 7};
		
		MyFraction fraction1 = new MyFraction(frac1[0], frac1[1],'+');
		MyFraction fraction2 = new MyFraction (frac2[0], frac2[1], '+');
		MyFraction fractionAnswer = fraction1.divide(fraction2);
		
		assertEquals("Add Negative Fractions Numerator" , 28.0 , fractionAnswer.getNumerator(), .0005);
		assertEquals("Add Negative Fractions Denominator", 27.0, fractionAnswer.getDenominator(), .0005);
		assertSame("Add Negative Fractions Sign", '+',fractionAnswer.getSign());
	}

}
