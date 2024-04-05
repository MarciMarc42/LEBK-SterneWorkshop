package de.adessomobile.lebk.workshop.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String id;
    private String name;
    private String email;
    private int stars;
    private Avatar avatar;
}
