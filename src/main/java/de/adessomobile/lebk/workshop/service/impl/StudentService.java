package de.adessomobile.lebk.workshop.service.impl;

import de.adessomobile.lebk.workshop.exception.TooManyStarsException;
import de.adessomobile.lebk.workshop.model.Student;
import de.adessomobile.lebk.workshop.repository.IStudentRepository;
import de.adessomobile.lebk.workshop.repository.impl.StudentRepository;
import de.adessomobile.lebk.workshop.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {

    private final IStudentRepository studentRepository = new StudentRepository();;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public Student getStudentWithMostStars() {
        List<Student> all = studentRepository.findAll();

        Student studentWithMostStars = null;
        for (Student student : all) {
            if (studentWithMostStars == null || student.getStars() > studentWithMostStars.getStars()) {
                studentWithMostStars = student;
            }
        }

        return studentWithMostStars;
    }

    @Override
    public void increaseStars(Student student, int stars) throws TooManyStarsException {
        if (student.getStars() + stars > MAX_STARS) {
            throw new TooManyStarsException();
        }

        student.setStars(student.getStars() + stars);
        studentRepository.save(student);
    }
}
