package dev.matias.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.matias.dslist.dto.GameListDTO;
import dev.matias.dslist.dto.GameMinDTO;
import dev.matias.dslist.services.GameListService;
import dev.matias.dslist.services.GameService;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAllGameList() {
        List<GameListDTO> all = this.gameListService.findAllGameList();
        return all;
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> all = this.gameService.findByList(listId);
        return all;
    }
}
