package com.promineo.nfl.NFLDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineo.nfl.NFLDemoPlayer.Player;

	@Repository
	public interface PlayerRepository extends JpaRepository <Player, Integer> {

	}


