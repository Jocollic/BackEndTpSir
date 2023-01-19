package jpa.Dao;

import jpa.classMetier.Ticket;


public class TicketDao extends AbstractJpaDao<Long, Ticket> {


public TicketDao() {
    super(Ticket.class);
}
    
    
}