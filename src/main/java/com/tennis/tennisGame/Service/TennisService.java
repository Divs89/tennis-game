package com.tennis.tennisGame.Service;

import org.springframework.stereotype.Service;

@Service
public class TennisService {
	int playerOneScore;
	int playerTwoScore;

	public String getScore(int playerOne, int playerTwo) {
		this.playerOneScore = playerOne;
		this.playerTwoScore = playerTwo;

		if(playerOneScore==0 && playerTwoScore ==0) {
			return "Love-All";
		}
		
		else if(playerOneScore==0 && playerTwoScore ==1) {
			return "Love-Fifteen";
		}
		else
			return "invalid Score";
	}

}
