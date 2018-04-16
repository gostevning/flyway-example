package no.stevning.flywayexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
    @Id
    private Long id;

    private String name;

    private Long yearFounded;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getYearFounded() {
        return yearFounded;
    }
}
