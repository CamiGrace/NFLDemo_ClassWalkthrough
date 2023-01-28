package com.promineo.nfl.NFLDemoPlayer;




import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;



@Data
@Entity
@Table(name= "player")
public class Player {

	//@Id
	@ GeneratedValue(strategy = GenerationType.AUTO)
	private int player_id;
	@Column (value = "team_id")
	private int team_id;
	@Column (value = "first_name")
	private String first_name;
	@Column (value = "last_name")
	private String last_name;
	
	
}



