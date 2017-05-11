/**
 * Created by Akshayraj
 */
package com.loudountutor.sophist.dao;

import com.loudountutor.sophist.model.Student;
import com.loudountutor.sophist.util.StudentNotFoundException;

public interface StudentDAO {

    Student getById(long id) throws StudentNotFoundException;

    Student add(Student student);
}
