package com.hexaware.cricketteam.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricketteam.entity.Player;
import com.hexaware.cricketteam.exception.InvalidRoleException;
import com.hexaware.cricketteam.exception.PlayerNotFoundException;
import com.hexaware.cricketteam.service.IPlayerService;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/players")
public class PlayerRestController {
	
	@Autowired
	private IPlayerService service;
	
	@GetMapping("/getall")
	public List<Player> getAllPlayers() {
		
		return service.getAllPlayers();
		
	}
	
	@PostMapping("/add")
	public Player addPlayer(@RequestBody Player player) {
		return service.addPlayer(player);
	}
	
	@GetMapping("get/{playerId}")
	public Player getPlayerById(@PathVariable Long playerId) {
		
		return service.getPlayerById(playerId);
		
	}
	
	@PutMapping("update/{playerId}")
	public Player updatePlayerById(@PathVariable Long playerId, @RequestBody Player player) throws PlayerNotFoundException {
		return service.updatePlayer(playerId, player);
		
	}
	
	@DeleteMapping("/delete/{playerId}")
	public String deletePlayerById(@PathVariable Long playerId) {
		return service.deletePlayerById(playerId);
		
	}
	
	@GetMapping("/get-by-role/{role}")
	public List<Player> getPlayerByRole(@PathVariable String role) throws InvalidRoleException{
		return service.getPlayersByRole(role);
	}

}
