package de.adessomobile.lebk.workshop.model;


import lombok.*;

/**
 * Model class for a student.
 * Represents a student with a name, email, stars and an avatar.
 */
public class Student {

    private String id;
    private String name;
    private String email;
    private int stars;
    private Avatar avatar;

    public Student(String id, String name, String email, int stars, Avatar avatar) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.stars = stars;
        this.avatar = avatar;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}
