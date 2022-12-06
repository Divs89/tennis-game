package com.tennis.tennisGame.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TennisControllerTest {
	@Autowired TennisController test;
	
	@Test
	public void controllerTest() {
		
		assertEquals("Thirty-Forty",test.tennis(2, 3));
		
	}
}
