package com.loudountutor.sophist.resources;

import com.loudountutor.sophist.core.Greeting;
import com.loudountutor.sophist.views.ProfileView;
import io.dropwizard.views.View;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/profile")
public class ProfileResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public View getProfile() {
        return new ProfileView();
    }

}