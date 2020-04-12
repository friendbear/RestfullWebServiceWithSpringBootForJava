package org.bearsworld.rest.webservice.restfulwebservices.user;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {

    protected User() {

    }
    public User(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    @Size(min=2)
    private String name;
    @Past
    @Getter
    @Setter
    private Date birthDate;

    @Override
    public String toString() {
        return String.format("User [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
    }
}
