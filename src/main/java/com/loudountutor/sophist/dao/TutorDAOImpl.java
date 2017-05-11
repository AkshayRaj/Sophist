/**
 * Created by Akshayraj
 */
package com.loudountutor.sophist.dao;

import com.loudountutor.sophist.model.Student;
import com.loudountutor.sophist.model.Tutor;
import com.loudountutor.sophist.util.StudentNotFoundException;
import com.loudountutor.sophist.util.TutorNotFoundException;

public class TutorDAOImpl implements TutorDAO {

    @Override
    public Tutor getTutorById(long id) {
        return new Tutor(1, "Akshayraj Kore", "ARK", "Password");
    }

    @Override
    public Tutor add(Tutor tutor) {
        return tutor;
    }
}
