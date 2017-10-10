
package com.syntaxerror.ezz0034.business;

import com.syntaxerror.ezz0034.models.Ticket;
import com.syntaxerror.ezz0034.repositories.TicketRepository;
import javafx.collections.ObservableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketBusiness {
    
    @Autowired
    private TicketRepository ticketRepository;

    public Ticket createNewTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public void removeTicketById(int tktid) {
        ticketRepository.delete(tktid);
    }

    public ObservableList<Ticket> getAllTickets() {
        return (ObservableList<Ticket>) ticketRepository.findAll();
    }
    
}
