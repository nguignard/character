package model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class LevelElementId implements Serializable {

    @NonNull
    private String name;
    @NonNull
    private String level;


}
