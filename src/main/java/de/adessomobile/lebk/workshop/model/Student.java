package de.adessomobile.lebk.workshop.model;


import lombok.*;

/**
 * Model class for a student.
 * Represents a student with an id, name, email, stars.
 */
@Data
@RequiredArgsConstructor
public class Student {

    private String id;
    private String name;
    private String email;
    private int stars;

}
