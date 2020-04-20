package org.bearsworld.rest.webservice.restfulwebservices.versioning;

public class PersonV2 {

    private Name name;


    public PersonV2(Name name) {
        this.name = name;
    }

    public PersonV2(String firstName, String lastName) {

        name.setFirstName(firstName);
        name.setLastName(lastName);
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
