package com.tennis.tennisGame.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TennisControllerTest {
	@Autowired TennisController test;
	
	/* This controller test method to check it passing input to service and getting output*/
	
	@Test
	public void scoreTest() {
		assertEquals("Thirty-Forty",test.score(2,3));
	}

	
	/* Test case to start new game*/
	
	@Test
	public void newGameTest() {
		assertEquals("Love - All",test.newGame());
	}
}
