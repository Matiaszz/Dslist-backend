package dev.matias.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.matias.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
