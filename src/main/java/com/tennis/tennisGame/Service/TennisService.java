package com.tennis.tennisGame.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TennisService {
	int playerOneScore;
	int playerTwoScore;
	
	Map<Integer,String> score = new HashMap<>();
	
	TennisService(){
		score.put(0,"Love");
		score.put(1,"Fifteen");
		score.put(2,"Thirty");
		score.put(3,"Forty");
	}

	public String getScore(int playerOne, int playerTwo) {
		this.playerOneScore = playerOne;
		this.playerTwoScore = playerTwo;

		if(playerOneScore>=0 && playerTwoScore>=0) {
			return (playerOneScore == playerTwoScore)?score.get(playerOneScore)+"-All":score.get(playerOneScore)+"-"+score.get(playerTwoScore);
		}
		else
			return "invalid Score";
	}

}
