package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class LevelElement implements Serializable {

    @EmbeddedId
    @NotNull
    @Column(name = "levelElementId")
    private LevelElementId levelElementId;

    @ManyToMany
    private Collection<Personage> personages = new ArrayList<Personage>();

    public LevelElement(LevelElementId levelElementId) {
	this.levelElementId = levelElementId;
    }
}
