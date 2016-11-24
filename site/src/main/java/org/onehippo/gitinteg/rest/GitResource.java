package org.onehippo.gitinteg.rest;


import org.onehippo.gitinteg.rest.model.ResponseMessage;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * Created by maheshacharya on 11/23/16.
 */
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
@Path("/git/")
public class GitResource {


    @POST
    @Path("/event")
    public ResponseMessage submitChallegeAction(
            @Context HttpServletRequest request,
            @FormParam("events") String events) {

        System.out.println("push .... " + events);

        ResponseMessage message = new ResponseMessage();
        message.setCode(200);//HttpStatus.SC_OK);
        return message;

    }


}
