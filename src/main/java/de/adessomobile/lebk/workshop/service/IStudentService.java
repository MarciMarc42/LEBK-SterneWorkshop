package de.adessomobile.lebk.workshop.service;

import de.adessomobile.lebk.workshop.exception.TooManyStarsException;
import de.adessomobile.lebk.workshop.model.Student;

public interface IStudentService {

    static final int MAX_STARS = 500;

    /**
     * method to create a student
     * @return the created student
     */
    Student saveStudent(Student student);


    /**
     * method to get the student with the most stars
     * @return the student with the most stars
     */
    Student getStudentWithMostStars();

    /**
     * method to increase the stars of a student, a student can not have more than 50 stars
     *
     * @param student the student to increase the stars
     * @param stars   the number of stars to increase
     */
    void increaseStars(Student student, int stars) throws TooManyStarsException;

}
