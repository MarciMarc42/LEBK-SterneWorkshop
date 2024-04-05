package de.adessomobile.lebk.workshop.repository.impl;

import de.adessomobile.lebk.workshop.model.Student;
import de.adessomobile.lebk.workshop.repository.IStudentRepository;

import java.util.*;

/**
 * Please never store data in static lists, this is just for demonstration purposes.
 */
public class StudentRepository implements IStudentRepository {

    private static final Map<String, Student> students = new HashMap<>();

    @Override
    public Student save(Student student) {

        if(student.getId() == null) {
            student.setId(UUID.randomUUID().toString());
            students.put(student.getId(), student);
        } else {
            students.put(student.getId(), student);
        }
        return students.get(student.getId());

    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }
}
