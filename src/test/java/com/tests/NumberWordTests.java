package com.tests;

import org.junit.*;

import static org.junit.Assert.*;
import com.numberword.*;

public class NumberWordTests {
	@Test
	public void addTwoTest() {
		NumberWord nw = new NumberWord();
		assertEquals(3, nw.addTwo(1));
	}

	@Test
	public void WordForZero() {
		assertEquals("zero", NumberWord.FormatNumber(0));
	}

	@Test
	public void TeensContainTeenSuffix() {
		for (int i = 13; i < 20; i++) {

			assertTrue(NumberWord.FormatNumber(i).endsWith("teen"));
		}
	}

	@Test
	public void TensContainsTySuffix() {
		for (int i = 20; i <= 90; i += 10) {
			assertTrue(NumberWord.FormatNumber(i).endsWith("ty"));
		}
	}

	@Test
	public void NumberWordContainsHyphenWhenTensIsNotZero() {
		assertTrue(NumberWord.FormatNumber(92).contains("-"));
	}

	@Test
	public void NumberWordDoesntContainHyphenWhenTensIsZero() {
		assertFalse(NumberWord.FormatNumber(102).contains("-"));
		assertFalse(NumberWord.FormatNumber(2).contains("-"));
	}

	@Test
	public void NumberWordContainsAndWhenHundredsNotZero() {
		assertTrue(NumberWord.FormatNumber(102).contains("and"));
	}

	@Test
	public void NumberWordContainsHundredWhenHundredsNotZero() {
		for (int i = 100; i <= 900; i += 100) {
			assertTrue(NumberWord.FormatNumber(i).contains("hundred"));
		}
	}

	@Test
	public void NumberWordContainsThousandWhenThousandsNotZero() {
		for (int i = 1000; i <= 10000; i += 1000) {
			assertTrue(NumberWord.FormatNumber(i).contains("thousand"));
		}
	}

}
