package de.adessomobile.lebk.workshop.repository.impl;

import de.adessomobile.lebk.workshop.model.Student;
import de.adessomobile.lebk.workshop.repository.IRepository;

import java.util.*;

/**
 * Please never store data in static lists, this is just for demonstration purposes.
 */
public class Repository implements IRepository {

    private static final Map<String, Student> students = new HashMap<>();

    @Override
    public Student save(Student student) {
        students.put(student.getId(), student);
        return student;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }
}
