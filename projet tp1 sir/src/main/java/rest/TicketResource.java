package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Parameter;
import jpa.classMetier.Ticket;

@Path("/ticket")
@Produces({"application/json", "application/xml"})
public class TicketResource {

  @GET
  @Path("/{ticketId}")
  public Ticket getUserById(@PathParam("id") Long ticketId)  {
      // return ticket
      return new Ticket();
  }

  @POST
  @Consumes("application/json")
  public Response addTicket(
      @Parameter(description = "Ticket object that needs to be added to the store", required = true) Ticket ticket) {
    // add pet
    return Response.ok().entity("SUCCESS").build();
  }
}