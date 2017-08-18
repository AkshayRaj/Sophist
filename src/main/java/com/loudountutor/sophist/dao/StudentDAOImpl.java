/**
 * Created by Akshayraj
 */
package com.loudountutor.sophist.dao;

import com.loudountutor.sophist.model.Student;
import com.loudountutor.sophist.util.StudentNotFoundException;

import java.util.Calendar;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public Student getById(long id) throws StudentNotFoundException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1988, 9, 1);
        return new Student.Builder()
                .setId(1L)
                .setFirstName("Akshayraj")
                .setLastName("Kore")
                .setDateOfBirth(calendar.getTime())
                .setEmail("akshayrajkore@gmail.com")
                .setPhone("4105626792")
                .setPassword("password")
                .build();
    }

    @Override
    public Long add(Student student) {
        return student.getId();
    }
}
