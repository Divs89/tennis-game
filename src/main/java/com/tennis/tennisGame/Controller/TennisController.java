package com.tennis.tennisGame.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tennis.tennisGame.Service.TennisService;

@RestController
public class TennisController {
	@Autowired TennisService tennisService;
	
	/* It takes players point (ex.0,1,2,..22etc) as input
	 *    and displays respective score
	 */
	@GetMapping ("/tennis/{playerOne}/{playerTwo}")
	public String tennis(@PathVariable int playerOne,@PathVariable int playerTwo) {
		return tennisService.getScore(playerOne,playerTwo);
		
	}
}
