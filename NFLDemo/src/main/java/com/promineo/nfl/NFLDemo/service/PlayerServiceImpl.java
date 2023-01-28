package com.promineo.nfl.NFLDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.method.support.AsyncHandlerMethodReturnValueHandler;

import com.promineo.nfl.NFLDemo.exception.ResourceNotFoundException;
import com.promineo.nfl.NFLDemo.repository.PlayerRepository;
import com.promineo.nfl.NFLDemoPlayer.Player;



@Service
public class PlayerServiceImpl implements PlayerService{
	private PlayerRepository playerRepository;
	
	@Autowired
	 public PlayerServiceImpl (PlayerRepository playerRepository) {
		super();
		this.playerRepository = playerRepository;
	}
	
	
	
	
	//this is my CREATE!	
	@Override
	public Player savePlayer(Player player) {
		
		return playerRepository.save(player);
	}



	// Get  list of all players
	@Override
	public List<Player> getAllPlayers() {
		
		return playerRepository.findAll();
	}



	//GET player by ID
	@Override
	public Player getPlayerByID(int Id) {
	
		return playerRepository.findById(Id).orElseThrow(() -> 
		new ResourceNotFoundException("player", "Id", Id));
	}




	@Override
	public Player UpdatePlayer(Player player, int Id) {
		Player existingPlayer = playerRepository.findById(Id).orElseThrow(() -> 
		new ResourceNotFoundException("player", "Id", Id));
		existingPlayer.setFirst_name(player.getFirst_name());
		existingPlayer.setLast_name(player.getLast_name());
		existingPlayer.setTeam_id(player.getTeam_id());
		playerRepository.save(existingPlayer);
		return existingPlayer;

	}




	@Override
	public void deletePlayer(int Id) {
		Player existingPlayer = playerRepository.findById(Id).orElseThrow(() -> 
		new ResourceNotFoundException("player", "Id", Id));
		playerRepository.deleteById(Id);
		
	}

}
