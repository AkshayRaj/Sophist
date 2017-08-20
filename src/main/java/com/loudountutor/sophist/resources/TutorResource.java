package com.loudountutor.sophist.resources;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.loudountutor.sophist.dao.TutorDAO;
import com.loudountutor.sophist.model.Tutor;
import com.loudountutor.sophist.util.TutorNotFoundException;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/tutor")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TutorResource {

    private TutorDAO tutorDAO;

    public TutorResource(TutorDAO tutorDAO) {
        this.tutorDAO = tutorDAO;
    }

    @POST
    public Response addTutor(@Valid Tutor tutor) {
        Long newTutorId = tutorDAO.add(tutor.getFirstName(), tutor.getLastName(), tutor.getDateOfBirth(),
                tutor.getEmail(), tutor.getPhone());
        return Response.status(Response.Status.CREATED).entity(newTutorId).build();
    }

    @GET
    @Path("/{id}")
    public Response getTutor(@PathParam("id") long id) {
        try {
            Tutor Tutor = tutorDAO.getById(id);
            return Response.ok(Tutor).build();
        } catch (TutorNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
