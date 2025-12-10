package org.cencora;
//TicketService.java

import java.util.List;
import java.util.Optional;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TicketService {

    @Inject
    private TicketRepository ticketRepository;

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll().list();
    }

    public Optional<Ticket> getTicketById(int id) {
        Optional<Ticket> ticket = ticketRepository.findByIdOptional((long) id);
        return ticket.filter(t -> t.getId() == id);
    }

    public Ticket saveTicket(Ticket ticket) {
        ticketRepository.persist(ticket);
        return ticket;
    }
}