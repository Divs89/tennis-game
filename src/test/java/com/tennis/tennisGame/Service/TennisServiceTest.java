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
	
	/* When both player scores point */
	@Test
	public void fortyFifteen() {
		result = test.getScore(3,1);
		assertEquals("Forty-Fifteen",result);
	}
	
	/* When both player scores point */
	@Test
	public void fifteenThirty() {
		result = test.getScore(1,2);
		assertEquals("Fifteen-Thirty",result);
	}
	
	/* When both player in same point */
	@Test
	public void fifteenAll() {
		result = test.getScore(1,1);
		assertEquals("Fifteen-All",result);
	}
	
	/* When both player scores point */
	@Test
	public void thirtyAll() {
		result = test.getScore(2,2);
		assertEquals("Thirty-All",result);
	}
	
	/* When both player scores 3 point-Deuce */
	@Test
	public void deuce() {
		result = test.getScore(3,3);
		assertEquals("Deuce",result);
	}
	
	/* When player1 scores a point after deuce */
	@Test
	public void adv() {
		result = test.getScore(4,3);
		assertEquals("PlayerOne Advantage",result);
	}
	
	/* When player1 scores a point after deuce */
	@Test
	public void advTwo() {
		result = test.getScore(3,4);
		assertEquals("PlayerTwo Advantage",result);
	}
	
	/* When player1 wins a game */
	@Test
	public void playerWins() {
		result = test.getScore(5,3);
		assertEquals("PlayerOne Wins the Game",result);
	}
	
	/* When player2 wins a game */
	@Test
	public void playerTwoWins() {
		result = test.getScore(3,5);
		assertEquals("PlayerTwo Wins the Game",result);
	}
}
