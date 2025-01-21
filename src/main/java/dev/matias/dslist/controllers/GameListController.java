package dev.matias.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.matias.dslist.dto.GameListDTO;
import dev.matias.dslist.services.GameListService;

@RestController
@RequestMapping("/list")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAllGameList() {
        List<GameListDTO> all = this.gameListService.findAllGameList();
        return all;
    }
}
