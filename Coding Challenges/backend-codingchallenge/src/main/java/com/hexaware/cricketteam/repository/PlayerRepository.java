package com.hexaware.cricketteam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hexaware.cricketteam.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{
	
	 @Query("select p from Player p where p.role = :role order by p.playerName")
	  public List<Player> findByRole(String role);
	

}
