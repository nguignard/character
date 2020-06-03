package model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Item extends LevelElement {

    private int durability;
    private EColor color;

    public Item(LevelElementId levelElementId) {
	super(levelElementId);
    }

}
