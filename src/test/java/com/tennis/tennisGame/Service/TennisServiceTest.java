package com.tennis.tennisGame.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TennisServiceTest {
	@Autowired TennisService test;
	
	String result;

	@Test
	public void loveAll() {
		result = test.getScore(0, 0);
		assertEquals("Love-All",result);
	}
	
	/* To check player2 scores a point */
	@Test
	public void loveFifteen() {
		result = test.getScore(0, 1);
		assertEquals("Love-Fifteen",result);
	}
	
	/* To check player2 scores 2 point */
	@Test
	public void loveThirty() {
		result = test.getScore(0, 2);
		assertEquals("Love-Thirty",result);
	}
	
	/* To check player2 scores 3 point */
	@Test
	public void loveForty() {
		result = test.getScore(0, 3);
		assertEquals("Love-Forty",result);
	}
	
	/* To check player1 scores a point */
	@Test
	public void fifteenLove() {
		result = test.getScore(1,0);
		assertEquals("Fifteen-Love",result);
	}
	
	/* To check player1 scores 2 point */
	@Test
	public void thirtyLove() {
		result = test.getScore(2,0);
		assertEquals("Thirty-Love",result);
	}
	
	/* To check player1 scores 3 point */
	@Test
	public void fortyLove() {
		result = test.getScore(3,0);
		assertEquals("Forty-Love",result);
	}
	
}
