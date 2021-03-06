package com.loudountutor.sophist.dao;

import com.loudountutor.sophist.dao.mapper.StudentRecordMapper;
import com.loudountutor.sophist.model.Student;
import com.loudountutor.sophist.util.StudentNotFoundException;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.sql.Date;

@RegisterMapper(StudentRecordMapper.class)
public interface StudentDAO {

    @SqlQuery("SELECT id, firstName, lastName, dateOfBirth, email, phone" +
            " FROM student " +
            " WHERE id = :id")
    Student getById(@Bind("id") long id) throws StudentNotFoundException;

    @SqlUpdate("INSERT INTO student" +
            " (firstName, lastName, dateOfBirth, email, phone)" +
            " VALUES (:firstName, :lastName, :dateOfBirth, :email, :phone)")
    @GetGeneratedKeys
    Long add(@Bind("firstName") String firstName,
             @Bind("lastName")String lastName,
             @Bind("dateOfBirth")Date dateOfBirth,
             @Bind("email")String email,
             @Bind("phone")String phone);
}
