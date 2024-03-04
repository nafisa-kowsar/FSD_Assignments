package com.hexaware.cricketteam.service;

import java.util.List;

import com.hexaware.cricketteam.entity.Player;
import com.hexaware.cricketteam.exception.InvalidRoleException;
import com.hexaware.cricketteam.exception.PlayerNotFoundException;

public interface IPlayerService {
	
	public List<Player> getAllPlayers();
	
	public Player addPlayer(Player player);
	
	public Player getPlayerById(Long playerId);
	
	public Player updatePlayer(Long playerId, Player updatedPlayer) throws PlayerNotFoundException;
	
	public String deletePlayerById(Long playerId);

	public List<Player> getPlayersByRole(String role) throws InvalidRoleException;

	

	
		
	

}
