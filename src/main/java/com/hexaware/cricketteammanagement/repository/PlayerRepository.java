package com.hexaware.cricketteammanagement.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.hexaware.cricketteammanagement.entity.Player;


@Repository
public interface PlayerRepository  extends JpaRepository<Player ,Integer>{ 
	
/*
@Query("SELECT p from Player p wherep.teamname = :teamName")
List<Player> findPlyersByTeamName(@Param("teamname") String teamName);
*/


@Query("SELECT p FROM Player p ORDER BY p.jerseyNumber ASC")
List<Player> findAllPlayersSortedByJerseyNumber();

}