package com.demo.testing.service;

import org.springframework.stereotype.Service;

@Service
public class TestSample {

	public String testSample(String value) {
		return value + "42";
	}

}
