/**
 * Created by Akshayraj
 */
package com.loudountutor.sophist.dao;

import com.loudountutor.sophist.model.Tutor;
import com.loudountutor.sophist.util.TutorNotFoundException;

public interface TutorDAO {
    Tutor getTutorById(long id) throws TutorNotFoundException;

    Tutor add(Tutor tutor);
}
