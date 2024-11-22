/* Impl class
 * author: Prerna
 * date: 2024-11-22
 */
package com.hexaware.cricketteammanagement.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricketteammanagement.entity.Player;
import com.hexaware.cricketteammanagement.exception.PlayerNotFoundException;
import com.hexaware.cricketteammanagement.repository.PlayerRepository;

@Service
public abstract  class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository repo;

    @Override
    public List<Player> getAllPlayers() {
        return repo.findAll();
    }

    @Override
    public Player getPlayerById(Integer playerId) {
        return repo.findById(playerId)
                   .orElseThrow(() -> new PlayerNotFoundException("Player not found with ID: " + playerId));
    }

    @Override
    public Player createPlayer(Player player) {
        return repo.save(player);
    }

    @Override
    public Player updatePlayer(Integer playerId, Player player) {
        Player existingPlayer = getPlayerById(playerId);
        existingPlayer.setPlayerName(player.getPlayerName());
        existingPlayer.setJerseyNumber(player.getJerseyNumber());
        existingPlayer.setRole(player.getRole());
        existingPlayer.setTotalMatches(player.getTotalMatches());
        existingPlayer.setTeamName(player.getTeamName());
        existingPlayer.setCountryStateName(player.getCountryStateName());
        existingPlayer.setDescription(player.getDescription());
        return repo.save(existingPlayer);
    }

    @Override
    public void deletePlayer(Integer playerId) {
        Player player = getPlayerById(playerId);
        repo.delete(player);
    }
    
    
    @Override
    public List<Player> getAllPlayersSortedByJerseyNumber() {
    	return repo.findAll(Sort.by(Sort.Direction.ASC, "jerseyNumber"));
    }


}
