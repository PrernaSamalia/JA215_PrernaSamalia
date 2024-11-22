package com.hexaware.cricketteammanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerId;

    @NotBlank(message = "Player name is mandatory")
    private String playerName;

    @NotNull(message = "Jersey number is required")
    @Min(value = 1, message = "Jersey number")
    private Integer jerseyNumber;

    @NotBlank(message = "Role is mandatory")
    private String role; 

    @NotNull(message = "Total matches must be specified")
    @Min(value = 0, message = "Total matches must be positive")
    private Integer totalMatches;

    @NotBlank(message = "Team name is mandatory")
    private String teamName;

    @NotBlank(message = "Country/State name is mandatory")
    private String countryStateName;

    @Size(max = 500, message = "Description must be within desired limit")
    private String description;

    // Getters and Setters
    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(Integer jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(Integer totalMatches) {
        this.totalMatches = totalMatches;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountryStateName() {
        return countryStateName;
    }

    public void setCountryStateName(String countryStateName) {
        this.countryStateName = countryStateName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
