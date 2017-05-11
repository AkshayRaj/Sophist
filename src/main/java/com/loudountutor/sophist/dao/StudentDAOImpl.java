/**
 * Created by Akshayraj
 */
package com.loudountutor.sophist.dao;

import com.loudountutor.sophist.model.Student;
import com.loudountutor.sophist.util.StudentNotFoundException;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public Student getById(long id) throws StudentNotFoundException {
        return new Student(1, "Akshayraj Kore", "ARK", "Password");
    }

    @Override
    public Student add(Student student) {
        return student;
    }
}
