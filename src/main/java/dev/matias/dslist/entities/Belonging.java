package dev.matias.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging() {

    }

    public Belonging(Game game, GameList list, Integer position) {
        setId(new BelongingPK(game, list));
        setPosition(position);
    }
}
