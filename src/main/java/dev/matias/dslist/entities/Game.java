package dev.matias.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(name = "game_year")
    private Integer year;

    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    public Game(String title, Integer year, String genre, Double score, String platforms, String imgUrl,
            String shortDescription,
            String longDescription) {
        setTitle(title);
        setYear(year);
        setGenre(genre);
        setPlatforms(platforms);
        setScore(score);
        setImgUrl(imgUrl);
        setShortDescription(shortDescription);
        setLongDescription(longDescription);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Game game = (Game) obj;
        return Objects.equals(id, game.id);
    }
}
