package com.tennis.tennisGame.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TennisService {
	
	Map<Integer,String> score = new HashMap<>();
	Map<String,Integer> points = new HashMap<>();
	
	int playerOneScore;
	int playerTwoScore;	
	
	TennisService(){
		score.put(0,"Love");
		score.put(1,"Fifteen");
		score.put(2,"Thirty");
		score.put(3,"Forty");
		
		points.put("playerOneScore", 0);
		points.put("playerTwoScore", 0);
	}
	
	/* 
	 * Gets input from controller and checks it is a valid input
	 */

	public String getScore(int playerOne, int playerTwo) {
		this.playerOneScore = playerOne;
		this.playerTwoScore = playerTwo;
	
		if(playerOne>=points.get("playerOneScore") && playerTwo >=points.get("playerTwoScore")) {
			points.put("playerOneScore", playerOne);
			points.put("playerTwoScore", playerTwo);
			return (playerOne<=3 && playerTwo <=3)?deuce():score();
		}
		else
			return "invalid Score";
	}
	
	/*
	 * Handles when both players score same point until they reaches duece
	 */
	
	public String deuce() {
		// TODO Auto-generated method stub
		if (playerOneScore ==3 && playerTwoScore == 3){
	        return "Deuce";
	        }

	    else {
	       return (playerOneScore == playerTwoScore)?(score.get(playerOneScore)+"-All"):
	                            (score.get(playerOneScore)+"-"+score.get(playerTwoScore));
	         }
	}
	
	/*
	 * Handles Advantage and Winning points
	 */
	
	public String score() {
		// TODO Auto-generated method stub
		int score = playerOneScore - playerTwoScore;
		
		if(playerOneScore == playerTwoScore) {
			return "Deuce";
		}

		else if(Math.signum(score)==1){
		    return (score>=2)? "PlayerOne Wins the Game"+statics():"PlayerOne "+"Advantage";}

		else{
		    return (score<=-2)?"PlayerTwo Wins the Game"+statics():"PlayerTwo "+"Advantage";
		}
	}
	
	/*
	 * Method to display how much points each player won after win a game
	 */

	public String statics() {
		// TODO Auto-generated method stub
		resetScore();
		return (" { Statics :- PlayerOne Won : "+playerOneScore+ " Points ; PlayerTwo Won : "+ playerTwoScore+" Points }");
	}
	
	/* Reset the scores to zero
	 * 
	 */
	
	public String resetScore() {
		points.put("playerOneScore", 0);
		points.put("playerTwoScore", 0);
		return "Love-All";
	}

}
