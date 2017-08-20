package com.loudountutor.sophist.dao.mapper;

import com.loudountutor.sophist.model.Student;
import com.loudountutor.sophist.model.Tutor;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TutorRecordMapper implements ResultSetMapper<Tutor> {

    @Override
    public Tutor map(int index, ResultSet r, StatementContext ctx) throws SQLException {
            return new Tutor.Builder()
                    .setId(r.getLong("id"))
                    .setFirstName(r.getString("firstName"))
                    .setLastName(r.getString("lastName"))
                    .setDateOfBirth(r.getDate("dateOfBirth"))
                    .setEmail(r.getString("email"))
                    .setPhone(r.getString("phone"))
                    .build();
    }
}
