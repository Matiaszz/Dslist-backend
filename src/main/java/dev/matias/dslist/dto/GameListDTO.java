package dev.matias.dslist.dto;

import dev.matias.dslist.entities.GameList;
import lombok.Data;

@Data
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        setId(entity.getId());
        setName(entity.getName());
    }
}
