package de.adessomobile.lebk.workshop.repository;

import de.adessomobile.lebk.workshop.model.Student;

import java.util.List;

public interface IRepository {
    Student save(Student student);

    List<Student> findAll();
}
