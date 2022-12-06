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
			return (playerOneScore<=3 && playerTwoScore <=3)?deuce():score();
		}
		else
			return "invalid Score";
	}

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
	
	public String score() {
		// TODO Auto-generated method stub
		int score = playerOneScore - playerTwoScore;

		if(Math.signum(score)==1){
		    return (score>=2)? "PlayerOne Wins the Game"+statics():"PlayerOne "+"Advantage";}

		else{
		    return (score<=-2)?"PlayerTwo Wins the Game"+statics():"PlayerTwo "+"Advantage";
		}
	}

	public String statics() {
		// TODO Auto-generated method stub
		return (" { Statics :- PlayerOne Won : "+playerOneScore+ " Points ; PlayerTwo Won : "+ playerTwoScore+" Points }");
	}

}
