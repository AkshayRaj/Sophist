package com.loudountutor.sophist.dao;

import com.loudountutor.sophist.dao.mapper.TutorRecordMapper;
import com.loudountutor.sophist.model.Tutor;
import com.loudountutor.sophist.util.StudentNotFoundException;
import com.loudountutor.sophist.util.TutorNotFoundException;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.sql.Date;

@RegisterMapper(TutorRecordMapper.class)
public interface TutorDAO {

    @SqlQuery("SELECT id, firstName, lastName, dateOfBirth, email, phone" +
            " FROM tutor " +
            " WHERE id = :id")
    Tutor getById(@Bind("id") long id) throws TutorNotFoundException;

    @SqlUpdate("INSERT INTO tutor" +
            " (firstName, lastName, dateOfBirth, email, phone)" +
            " VALUES (:firstName, :lastName, :dateOfBirth, :email, :phone)")
    @GetGeneratedKeys
    Long add(@Bind("firstName") String firstName,
             @Bind("lastName")String lastName,
             @Bind("dateOfBirth")Date dateOfBirth,
             @Bind("email")String email,
             @Bind("phone")String phone);
}
