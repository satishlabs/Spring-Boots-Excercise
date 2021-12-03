package com.satishlabs.ticketbookingrest.dao;

import com.satishlabs.ticketbookingrest.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TicketDao extends JpaRepository<Ticket, Integer> {
    Ticket findTicketByEmail(String email);
}
