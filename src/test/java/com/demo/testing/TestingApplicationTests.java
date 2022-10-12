package com.demo.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.demo.testing.service.TestSample;

class TestingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testSample() {
		TestSample testSample = new TestSample();
		assertEquals("1242", testSample.testSample("12"));
	}

}
