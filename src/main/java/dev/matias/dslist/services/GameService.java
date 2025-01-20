package dev.matias.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.matias.dslist.dto.GameMinDTO;
import dev.matias.dslist.entities.Game;
import dev.matias.dslist.repositories.GameRepository;

// Sevice component for Game class
@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> results = this.gameRepository.findAll();
        List<GameMinDTO> listDTO = results.stream().map(x -> new GameMinDTO(x)).toList();
        return listDTO;

    }
}
