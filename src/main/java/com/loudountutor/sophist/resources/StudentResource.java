package com.loudountutor.sophist.resources;

import com.loudountutor.sophist.dao.StudentDAO;
import com.loudountutor.sophist.model.Student;
import com.loudountutor.sophist.util.StudentNotFoundException;

import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/student")
@Produces(MediaType.APPLICATION_JSON)
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
    public Response getStudent(@PathParam("id") long id) {
        try {
            Student student = studentDAO.getById(id);
            return Response.ok(student).build();
        } catch (StudentNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
