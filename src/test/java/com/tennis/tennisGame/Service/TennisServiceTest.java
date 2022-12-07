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
		test.resetScore();
		result = test.getScore(0, 0);
		assertEquals("Love-All",result);
	}
	
	/* To check player2 scores a point */
	@Test
	public void loveFifteen() {
		test.resetScore();
		result = test.getScore(0, 1);
		assertEquals("Love-Fifteen",result);
	}
	
	/* To check player2 scores 2 point */
	@Test
	public void loveThirty() {
		test.resetScore();
		result = test.getScore(0, 2);
		assertEquals("Love-Thirty",result);
	}
	
	/* To check player2 scores 3 point */
	@Test
	public void loveForty() {
		test.resetScore();
		result = test.getScore(0, 3);
		assertEquals("Love-Forty",result);
	}
	
	/* To check player1 scores a point */
	@Test
	public void fifteenLove() {
		test.resetScore();
		result = test.getScore(1,0);
		assertEquals("Fifteen-Love",result);
	}
	
	/* To check player1 scores 2 point */
	@Test
	public void thirtyLove() {
		test.resetScore();
		result = test.getScore(2,0);
		assertEquals("Thirty-Love",result);
	}
	
	/* To check player1 scores 3 point */
	@Test
	public void fortyLove() {
		test.resetScore();
		result = test.getScore(3,0);
		assertEquals("Forty-Love",result);
	}
	
	/* When both player scores point */
	@Test
	public void fortyFifteen() {
		test.resetScore();
		result = test.getScore(3,1);
		assertEquals("Forty-Fifteen",result);
	}
	
	/* When both player scores point */
	@Test
	public void fifteenThirty() {
		test.resetScore();
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
		test.resetScore();
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
		assertEquals("PlayerOne Wins the Game { Statics :- PlayerOne Won : 5 Points ; PlayerTwo Won : 3 Points }"
				,result);
	}
	
	/* When player2 wins a game */
	@Test
	public void playerTwoWins() {
		test.resetScore();
		result = test.getScore(2,5);
		assertEquals("PlayerTwo Wins the Game { Statics :- PlayerOne Won : 2 Points ; PlayerTwo Won : 5 Points }",result);
	}
	
	/* When players score more points (match continues if each player score points alternatively after duece) */
	
	@Test
	public void morePointsAdv() {
		result = test.getScore(13,12);
		assertEquals("PlayerOne Advantage",result);
	}
	
	@Test
	public void morePointsWin() {
		result = test.getScore(25,23);
		assertEquals("PlayerOne Wins the Game { Statics :- PlayerOne Won : 25 Points ; PlayerTwo Won : 23 Points }",result);
	}
	
	
}
