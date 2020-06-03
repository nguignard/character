package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public abstract class Personage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "health")
    private String health;
    @Column(name = "strength")
    private String strength;
    @Column(name = "level")
    private String level;

    @ManyToOne
    private User user;
    
    @ManyToMany
    @JoinTable(name="Personage_Level",
	    joinColumns = @JoinColumn(name = "personageid", referencedColumnName = "id"),
	    inverseJoinColumns = @JoinColumn(name = "levelId", referencedColumnName = "levelElementId"))
private Collection<LevelElement> levelElements = new ArrayList<LevelElement>();

}
