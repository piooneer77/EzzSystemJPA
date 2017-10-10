
package com.syntaxerror.ezz0034.repositories;

import com.syntaxerror.ezz0034.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TicketRepository extends JpaRepository <Ticket, Integer> {
    
}
