package dev.matias.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.matias.dslist.dto.GameListDTO;
import dev.matias.dslist.entities.GameList;
import dev.matias.dslist.repositories.GameListRepository;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAllGameList() {
        List<GameList> results = this.gameListRepository.findAll();
        List<GameListDTO> listDTO = results.stream().map(x -> new GameListDTO(x)).toList();
        return listDTO;
    }

}
