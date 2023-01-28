package com.promineo.nfl.NFLDemo.service;


import java.util.List;

import com.promineo.nfl.NFLDemoPlayer.Player;

public interface PlayerService {

	
	//post a player...CREATE!!!
	public Player savePlayer (Player player);
	

	// get players
	public List<Player> getAllPlayers();
	//get player by ID
	public Player getPlayerByID(int Id);
	//update
	public Player UpdatePlayer(Player player, int Id); 
	
	//Delete
	public void deletePlayer (int Id);
}
