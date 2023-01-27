package jpa.Dao;

import jpa.domain.Ticket;


public class TicketDao extends AbstractJpaDao<Long, Ticket> {


public TicketDao() {
    super(Ticket.class);
}
    
    
}