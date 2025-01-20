package dev.matias.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.matias.dslist.dto.GameMinDTO;
import dev.matias.dslist.entities.Game;
import dev.matias.dslist.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(Game game) {
        List<GameMinDTO> all = this.gameService.findAll();
        return all;
    }
}
