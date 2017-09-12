package com.loudountutor.sophist.resources;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

@Path("/")
public class ProfileResource {

    @GET
    @Path("login")
    @Produces(MediaType.TEXT_HTML)
    public Response getLogin() {
        String pageContent = "";
        try {
            URL clientPage = Resources.getResource("assets/index.html");
            pageContent = Resources.toString(clientPage, Charsets.UTF_8);
        } catch (IOException e) {
            return Response.serverError().build();
        }
        return Response.ok(pageContent).build();
    }

    @GET
    @Path("")
    @Produces(MediaType.TEXT_HTML)
    public Response getProfile() throws URISyntaxException {

        int studentID = 1;//TODO Retrieve studentID from DB using Auth Token

        URI uri = new URI("/student/" + studentID);
        return Response.seeOther(uri).build();
    }

}