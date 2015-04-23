package com.task.elements.rest;

import com.task.elements.bo.ElementsBo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;

@ManagedBean
@SessionScoped
@Path("/file")
public class RestController implements Serializable {

    ElementsBo elementsBo;

    public ElementsBo getElementsBo() {
        return elementsBo;
    }

    public void setElementsBo(ElementsBo elementsBo) {
        this.elementsBo = elementsBo;
    }

    @GET
    @Path("/text/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getTextInfaById(@PathParam("id") long id) {
        System.out.println("getTextInfaById");
        return elementsBo.findTextInfaById(id);

    }
}
