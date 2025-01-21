package dev.matias.dslist.dto;

import org.springframework.beans.BeanUtils;

import dev.matias.dslist.entities.Game;
import lombok.Data;

@Data
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String longDescription;
    private String shortDescription;

    public GameDTO() {
    }

    public GameDTO(Game entity) {
        // Copy all properties to this object
        BeanUtils.copyProperties(entity, this);
    }
}
