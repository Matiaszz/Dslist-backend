package dev.matias.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.matias.dslist.dto.GameDTO;
import dev.matias.dslist.dto.GameMinDTO;
import dev.matias.dslist.entities.Game;
import dev.matias.dslist.repositories.GameRepository;

// Sevice component for Game class
@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game entity = this.gameRepository.findById(id).get();
        return new GameDTO(entity);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> results = this.gameRepository.findAll();
        List<GameMinDTO> listDTO = results.stream().map(x -> new GameMinDTO(x)).toList();
        return listDTO;
    }
}
