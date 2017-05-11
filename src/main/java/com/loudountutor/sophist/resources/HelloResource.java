/**
 * Created by Akshayraj
 */
package com.loudountutor.sophist.resources;

import com.loudountutor.sophist.core.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getGreeting() {
        return "Hello world!";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting getJSONGreeting() {
        return new Greeting("Hello world!");
    }
}