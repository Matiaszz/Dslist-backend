package dev.matias.dslist.dto;

import dev.matias.dslist.entities.Game;
import lombok.Data;

@Data
public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        setId(entity.getId());
        setTitle(entity.getTitle());
        setYear(entity.getYear());
        setImgUrl(entity.getImgUrl());
        setShortDescription(entity.getShortDescription());
    }
}
