package com.hexaware.cricketteammanagement.service;

import java.util.List;
import com.hexaware.cricketteammanagement.entity.Player;

public interface PlayerService {
    List<Player> getAllPlayers();
    Player getPlayerById(Integer playerId);
    Player createPlayer(Player player);
    Player updatePlayer(Integer playerId, Player player);
    void deletePlayer(Integer playerId);
     List<Player> getAllPlayersSortedByJerseyNumber(); 
        
}


