package com.promineo.nfl.NFLDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineo.nfl.NFLDemo.service.PlayerService;
import com.promineo.nfl.NFLDemoPlayer.Player;



@RestController
@RequestMapping("/NFL_DB/player")
public class PlayerController {

	private PlayerService playerService;
	@Autowired
	private PlayerController(PlayerService playerService) {
		super();
		this.playerService = playerService;
}

//create a player API
@PostMapping
public ResponseEntity<Player> savePlayer(@RequestBody Player player) {
	return new ResponseEntity<Player> (playerService.savePlayer(player), HttpStatus.CREATED);
		

}
//READ all players API
@GetMapping
public List <Player> getAllPlayers(){
	return playerService.getAllPlayers();

}

//Get player by Id
@GetMapping("{player_id}") 
public ResponseEntity<Player> getPlayerById(@PathVariable("player_id") int playerId) {
	return new ResponseEntity<Player>(playerService.getPlayerByID(playerId), HttpStatus.OK);

}

//updating or putting
@PutMapping("{player_id}")
public ResponseEntity<Player> UpdatePlayer(@PathVariable("player_id") int playerId, 
		@RequestBody Player player){
	return new ResponseEntity<Player>(playerService.UpdatePlayer(player, playerId), HttpStatus.OK);
}
@DeleteMapping("{player_id}")
public ResponseEntity<String> deletePlayer(@PathVariable("player_id") int playerId) {
	playerService.deletePlayer(playerId);
	return new ResponseEntity<String>("Player Eliminated", HttpStatus.OK);
}
}
