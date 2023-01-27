package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import io.swagger.v3.oas.annotations.Parameter;
import jpa.Dao.TicketDao;
import jpa.domain.Ticket;

@Path("/ticket")
@Produces({"application/json"})
public class TicketResource {

  TicketDao dao = new TicketDao();

  @GET
  @Path("/{id}")
  public Ticket getTicketById(@PathParam("id") Long ticketId)  {
      // return ticket
      return dao.findOne(ticketId);  
  }

  @POST
  @Consumes("application/json")
  public Response addTicket(
      @Parameter(description = "Ticket object that needs to be added to the store", required = true) Ticket ticket) {
        dao.save(ticket);
        return Response.ok().entity("SUCCESS").build();
  }
}