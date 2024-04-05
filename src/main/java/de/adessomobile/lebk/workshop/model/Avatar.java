package de.adessomobile.lebk.workshop.model;


import lombok.*;


public class Avatar {

    private String id;
    private String name;

    public Avatar() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
