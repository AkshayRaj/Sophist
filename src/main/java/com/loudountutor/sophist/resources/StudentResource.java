package com.loudountutor.sophist.resources;

import com.loudountutor.sophist.dao.StudentDAO;
import com.loudountutor.sophist.model.Student;
import com.loudountutor.sophist.util.StudentNotFoundException;
import com.loudountutor.sophist.views.StudentView;
import io.dropwizard.views.View;

import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/student")
@Consumes(MediaType.APPLICATION_JSON)
public class StudentResource {

    private StudentDAO studentDAO;

    public StudentResource(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @POST
    public Response addStudent(@Valid Student student) {
        Long newStudentId = studentDAO.add(student.getFirstName(), student.getLastName(), student.getDateOfBirth(),
                student.getEmail(), student.getPhone());
        return Response.status(Response.Status.CREATED).entity(newStudentId).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_HTML)
    public View getStudent(@PathParam("id") long id) throws StudentNotFoundException {
        Student student = studentDAO.getById(id);
        return new StudentView(student);
    }

}
