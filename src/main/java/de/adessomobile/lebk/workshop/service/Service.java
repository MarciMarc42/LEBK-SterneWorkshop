package de.adessomobile.lebk.workshop.service;

import de.adessomobile.lebk.workshop.exception.TooManyStarsException;
import de.adessomobile.lebk.workshop.model.Student;
import de.adessomobile.lebk.workshop.repository.IRepository;
import de.adessomobile.lebk.workshop.repository.impl.Repository;

public class Service {
    static final int MAX_STARS = 500;
    private final IRepository studentRepository = new Repository();

    /**
     * method to increase the stars of a student, a student can not have more than 50 stars
     *
     * @param student the student to increase the stars
     * @param stars   the number of stars to increase
     * @throws TooManyStarsException if the student would have more than 50 stars
     */
    public void increaseStars(Student student, int stars) throws TooManyStarsException {

        // wenn ein student (student.getStars() + stars) mehr als MAX_STARS hat, dann wird eine TooManyStarsException geworfen
        if (student.getStars() + stars > MAX_STARS) {

            // in diesem Fall wird eine TooManyStarsException geworfen und die Methode endet hier
            throw new TooManyStarsException();
        }

        // ansonsten wird die Anzahl der Sterne erhöht und der Student gespeichert
        student.setStars(student.getStars() + stars);
        studentRepository.save(student);
    }

    /**
     * method to decrease the stars of a student
     *
     * @param student the student to decrease the stars
     * @param stars   the number of stars to decrease
     */
    public void decreaseStars(Student student, int stars) {

        // die Anzahl der Sterne wird verringert und der Student gespeichert
        student.setStars(student.getStars() - stars);
        studentRepository.save(student);
    }
}
