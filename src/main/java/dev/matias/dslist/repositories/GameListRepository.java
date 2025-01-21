package dev.matias.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.matias.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
