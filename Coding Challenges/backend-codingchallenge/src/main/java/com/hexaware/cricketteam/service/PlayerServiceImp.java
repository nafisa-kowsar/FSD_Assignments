package com.hexaware.cricketteam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hexaware.cricketteam.entity.Player;
import com.hexaware.cricketteam.exception.InvalidRoleException;
import com.hexaware.cricketteam.exception.PlayerNotFoundException;
import com.hexaware.cricketteam.repository.PlayerRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PlayerServiceImp implements IPlayerService{
	
	@Autowired
	private PlayerRepository repo;

	@Override
	public List<Player> getAllPlayers() {
		
		return repo.findAll();
	}

	@Override
	public Player addPlayer(Player player) {
		
		return repo.save(player);
	}

	@Override
	public Player getPlayerById(Long playerId) {
		return repo.findById(playerId).orElse(null);
	}

	@Override
	public Player updatePlayer(Long playerId, Player updatedPlayer) throws PlayerNotFoundException {
		Player player = repo.findById(playerId).orElseThrow(() -> new PlayerNotFoundException("Couldn't find the player with ID: " + playerId));
		 player.setPlayerName(updatedPlayer.getPlayerName());
	        player.setJerseyNumber(updatedPlayer.getJerseyNumber());
	        player.setRole(updatedPlayer.getRole());
	        player.setTotalMatches(updatedPlayer.getTotalMatches());
	        player.setTeamName(updatedPlayer.getTeamName());
	        player.setDescription(updatedPlayer.getDescription());
	        
	        return repo.save(player);
		
	}

	@Override
	public String deletePlayerById(Long playerId ) {
		
		repo.deleteById(playerId);
		return "Player with ID: " + playerId + "deleted";
	}
	
	@Override
	public List<Player> getPlayersByRole(String role) throws InvalidRoleException {
        
        if(isValidRole(role)) {
        	return repo.findByRole(role);
        }
        else throw new InvalidRoleException("Invalid role entered : " + role + "Please enter a valid role");
	}

	private boolean isValidRole(String role) {
	    return "Batsman".equals(role) || "Bowler".equals(role) || "Keeper".equals(role) || "All Rounder".equals(role);
	}

}
