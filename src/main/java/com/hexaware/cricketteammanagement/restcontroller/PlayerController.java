package com.hexaware.cricketteammanagement.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.hexaware.cricketteammanagement.entity.Player;
import com.hexaware.cricketteammanagement.service.PlayerService;


@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private PlayerService service;

    // Get all players
    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers() {
        return ResponseEntity.ok(service.getAllPlayers());
    }

    // Get a player by ID
    @GetMapping("/{playerId}")
    public ResponseEntity<Player> getPlayerById(@PathVariable Integer playerId) {
        return ResponseEntity.ok(service.getPlayerById(playerId));
    }

    // Create a new player
    @PostMapping
    public ResponseEntity<Player> createPlayer(@Validated @RequestBody Player player) {
        return new ResponseEntity<>(service.createPlayer(player), HttpStatus.CREATED);
    }

    // Update player details
    @PutMapping("/{playerId}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Integer playerId, @Validated @RequestBody Player player) {
        return ResponseEntity.ok(service.updatePlayer(playerId, player));
    }

    // Delete a player by ID
    @DeleteMapping("/{playerId}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Integer playerId) {
        service.deletePlayer(playerId);
        return ResponseEntity.noContent().build();
    }

    
    @GetMapping("/{sorted-by-jersey}")
    public ResponseEntity<List<Player>> getAllPlayersSortedByJerseyNumber() {
        return ResponseEntity.ok(service.getAllPlayersSortedByJerseyNumber());
    }

}
