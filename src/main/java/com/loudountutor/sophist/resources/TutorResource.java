/**
 * Created by Akshayraj
 */
package com.loudountutor.sophist.resources;

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

    private TutorDAO TutorDAO;

    public TutorResource(TutorDAO tutorDAO) {
        this.TutorDAO = tutorDAO;
    }

    @POST
    public Response addTutor(@Valid Tutor tutor) {
        Tutor newTutor = TutorDAO.add(tutor);
        return Response.status(Response.Status.CREATED).entity(newTutor).build();
    }

    @GET
    @Path("/{id}")
    public Response getTutor(@PathParam("id") long id) {
        try {
            Tutor Tutor = TutorDAO.getTutorById(id);
            return Response.ok(Tutor).build();
        } catch (TutorNotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
